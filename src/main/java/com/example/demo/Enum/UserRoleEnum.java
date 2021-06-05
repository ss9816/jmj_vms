package com.example.demo.Enum;

import com.baomidou.mybatisplus.annotation.EnumValue;

public enum UserRoleEnum {
    ADMIN(1,"Admin"),
    GUARD(2,"Guard"),
    RESIDENT(3,"Resident");

    UserRoleEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @EnumValue
    private int code;
    private String msg;

}
