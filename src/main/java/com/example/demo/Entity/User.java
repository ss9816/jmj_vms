package com.example.demo.Entity;

import com.baomidou.mybatisplus.annotation.*;
import com.example.demo.Enum.UserRoleEnum;
import com.example.demo.Enum.UserStatusEnum;
import lombok.Data;

@Data
@TableName("UserTable")
public class User {


    @TableId(type = IdType.AUTO)
    private int Userid;
    private UserRoleEnum Userrole;
    private String Userpassword;
    private String Username;
    private String Useremail;
    @TableLogic
    private UserStatusEnum Actives;

}
