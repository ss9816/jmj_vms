package com.example.demo.Mapper;

import com.example.demo.Entity.VisitRequestTable;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wudi
 * @since 2021-06-02
 */
public interface VisitRequestTableMapper extends BaseMapper<VisitRequestTable> {

    @Select("Select count(*) from VisitRequestTable where Status=0")
    public int countPendingRequest();

}
