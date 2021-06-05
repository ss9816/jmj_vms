package com.example.demo.Entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;

import com.example.demo.Enum.UserRoleEnum;
import com.example.demo.Enum.UserStatusEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 *
 * </p>
 *
 * @author wudi
 * @since 2021-06-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("UserTable")
public class UserTable implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private int userid;
    @TableField(value="UserRole")
    private UserRoleEnum userRole; // userRole // user_role
    private String userpassword;
    private String username;
    private String useremail;
    @TableLogic
    private UserStatusEnum actives;


}
