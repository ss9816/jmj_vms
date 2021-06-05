package com.example.demo.Mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class VisitorTypeTableMapperTest {

    @Autowired
    private VisitorTypeTableMapper mapper;

    @Test
    void test() {
        mapper.selectList(null).forEach(System.out::println);
    }

    ;
}