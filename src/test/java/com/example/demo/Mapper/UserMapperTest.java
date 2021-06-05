package com.example.demo.Mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.Entity.User;
import com.example.demo.Enum.UserRoleEnum;
import com.example.demo.Enum.UserStatusEnum;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.AfterTestClass;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTest {

    @Autowired
   private UserMapper userMapper;

    @Test
    void  test(){
        userMapper.selectList(null).forEach(System.out::println);
    }

    @Test
    void insert(){
       User user = new User();
       user.setUserrole(UserRoleEnum.GUARD);
       user.setUserpassword("test6");
       user.setUsername("test6");
       user.setUseremail("test4@gmail.com");
       user.setActives(UserStatusEnum.ACTIVE);
       userMapper.insert(user);

    }
    @Test
    void update(){
        User user = userMapper.selectById(2);
        user.setUsername("usernamemodifed");
        User user2 = userMapper.selectById(2);
        userMapper.updateById(user);
    }

    @Test
    void delete(){
        userMapper.deleteById(3);
    }

    @Test
    void sometest(){
        QueryWrapper queryWrapper = new QueryWrapper();
        //queryWrapper.orderByDesc("username");
        //queryWrapper.eq("userid",4);
        //queryWrapper.inSql("userid","select userid from usertable where userid >2");
        //userMapper.selectList(queryWrapper).forEach(System.out::println);
        queryWrapper.gt("userid",0);
        System.out.println(userMapper.selectCount(queryWrapper));
        userMapper.selectList(queryWrapper).forEach(System.out::println);
    }

    @Test
    void pagetest(){
        Page<User> page = new Page<>(2,2);
        Page<User> res = userMapper.selectPage(page,null);
        res.getRecords().forEach(System.out::println);

    }

}