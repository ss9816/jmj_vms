package com.example.demo.Service;

import com.example.demo.Entity.UserTable;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.Enum.UserRoleEnum;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wudi
 * @since 2021-06-02
 */
public interface IUserTableService extends IService<UserTable> {

    public int countAdmin();
    public int CountRole(int role);
}
