package com.example.demo.Service.Imp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.Entity.UserTable;
import com.example.demo.Enum.UserRoleEnum;
import com.example.demo.Mapper.UserTableMapper;
import com.example.demo.Service.IUserTableService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wudi
 * @since 2021-06-02
 */
@Service
public class UserTableServiceImpl extends ServiceImpl<UserTableMapper, UserTable> implements IUserTableService {

    @Autowired
    private UserTableMapper userTableMapper;

    @Override
    public int countAdmin() {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("userrole", UserRoleEnum.ADMIN);
        int c = userTableMapper.selectCount(queryWrapper);
        return c;
    }

    @Override
    public int CountRole(int role) {
       return userTableMapper.countRole(role);
    }
}
