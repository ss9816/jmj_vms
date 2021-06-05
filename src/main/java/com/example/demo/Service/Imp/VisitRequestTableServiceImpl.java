package com.example.demo.Service.Imp;

import com.example.demo.Entity.VisitRequestTable;
import com.example.demo.Mapper.VisitRequestTableMapper;
import com.example.demo.Service.IVisitRequestTableService;
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
public class VisitRequestTableServiceImpl extends ServiceImpl<VisitRequestTableMapper, VisitRequestTable> implements IVisitRequestTableService {

    @Autowired
    private VisitRequestTableMapper visitRequestTableMapper;

    @Override
    public int countPendingRequest() {
        return visitRequestTableMapper.countPendingRequest();
    }
}
