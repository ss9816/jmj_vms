package com.example.demo.Enum;

import com.baomidou.mybatisplus.annotation.EnumValue;

/**
 * User Status
 * Delete - > Inactive
 */
public enum UserStatusEnum {
    ACTIVE (true,"Active User"),
    INACTIVE(false,"Inactive User");

    UserStatusEnum(boolean code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @EnumValue
    private boolean code;
    private String msg;
}
