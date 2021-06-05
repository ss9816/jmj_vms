package com.example.demo.Config;

import com.example.demo.Service.Imp.UserDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import javax.sql.DataSource;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private  DataSource dataSource;
    @Autowired
    private  PersistentTokenRepository persistentTokenRepository;
    @Autowired
    private UserDetailServiceImpl userDetailService;



    @Bean
    public PasswordEncoder getPassword() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin().loginPage("/testlogin").loginProcessingUrl("/logintest")
                .successForwardUrl("/login")
                .failureForwardUrl("/Error");

        http.authorizeRequests()
                .antMatchers("/testlogin").permitAll()
                .antMatchers("/Error").permitAll()
                .antMatchers("/index").hasAnyAuthority("ADMIN") //hasAnyRole
                .anyRequest().authenticated();

        http.rememberMe()
                .tokenRepository(persistentTokenRepository)
                .tokenValiditySeconds(60)//Default 2 weeks
                .userDetailsService(userDetailService)
                 .rememberMeCookieName("remember")
        ;//Cookie/Session

        //Firewall
        http.csrf().disable();

        http.logout().logoutUrl("/logout").logoutSuccessUrl("/testlogin");
    }

    @Bean
    public PersistentTokenRepository persistentTokenRepository() {
        JdbcTokenRepositoryImpl tokenRepository = new JdbcTokenRepositoryImpl();
        tokenRepository.setDataSource(dataSource);
        //tokenRepository.setCreateTableOnStartup(true);
        return tokenRepository;
    }
}
