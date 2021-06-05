package com.example.demo.Service;

import com.example.demo.Entity.VisitRequestTable;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wudi
 * @since 2021-06-02
 */
public interface IVisitRequestTableService extends IService<VisitRequestTable> {
    public int countPendingRequest();
}
