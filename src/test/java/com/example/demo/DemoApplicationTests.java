package com.example.demo;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Encoders;
import io.jsonwebtoken.security.Keys;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.security.Key;
import java.util.Date;

@SpringBootTest
class DemoApplicationTests {


    @Test
    void contextLoads() {
    }

    @Test
    void testToken() {
        Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

        String secretString = Encoders.BASE64.encode(key.getEncoded());
        System.out.println(secretString);
        String jws = Jwts.builder().
                setId("8888")
                .setSubject("Joe")
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, key).compact();

        System.out.println(jws);

        // String[] str = jws.split("\\.");
    }

    @Test
    void testpass() {
        PasswordEncoder pw = new BCryptPasswordEncoder();
        String encode = pw.encode("testingpass");
        System.out.println(encode);

        System.out.println(pw.matches("testingpass2", encode));
    }

    @Test
    void log() {

    }

    @Test
    void testparse() {
        String token = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI4ODg4Iiwic3ViIjoiSm9lIiwia" +
                "WF0IjoxNjIyODY1MzQ1fQ.uj3fdw3cnjUDEy7PzFQe54A8-5WKhOPjqN1AW-2-hFw";

        Claims body = (Claims) Jwts.parserBuilder().setSigningKey("wOk9DSJTWjUngoZFn6raPqjujpU1jclDjcby4hRL0Y0=")
                .build().parse(token).getBody();

        System.out.println(body.getId());
        System.out.println(body.getSubject());
        System.out.println(body.getIssuedAt());
    }
}
