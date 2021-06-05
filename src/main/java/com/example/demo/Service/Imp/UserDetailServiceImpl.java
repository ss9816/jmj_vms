package com.example.demo.Service.Imp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.Entity.UserTable;
import com.example.demo.Enum.UserRoleEnum;
import com.example.demo.Mapper.UserTableMapper;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    private final PasswordEncoder passwordEncoder;
    private
    UserTableMapper userTableMapper;


    public UserDetailServiceImpl(UserTableMapper userTableMapper, PasswordEncoder pw) {
        this.userTableMapper = userTableMapper;
        this.passwordEncoder = pw;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        System.out.println("LoadUserByUserName");

        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("username", s);
        System.out.println("username: "+s);
        UserTable userTable = userTableMapper.selectOne(queryWrapper);
        if (userTable == null) {
            throw new UsernameNotFoundException("Username not existed");
        }
        String pass = passwordEncoder.encode(userTable.getUserpassword());

        UserRoleEnum role = userTable.getUserRole();
        System.out.println(role);
        System.out.println(pass);
        return new User(s, pass, AuthorityUtils.commaSeparatedStringToAuthorityList(role.name())); // ROLE_'role'

    }
}
