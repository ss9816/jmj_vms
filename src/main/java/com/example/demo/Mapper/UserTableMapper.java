package com.example.demo.Mapper;

import com.example.demo.Entity.UserTable;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.Enum.UserRoleEnum;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wudi
 * @since 2021-06-02
 */
public interface UserTableMapper extends BaseMapper<UserTable> {

    @Select("Select count(*) from UserTable where UserRole=#{role}")
    public int countRole(int role);
}
