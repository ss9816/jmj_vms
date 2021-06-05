package com.example.demo.Entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;

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
@TableName("VisitRequestTable")
public class VisitRequestTable implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField(value = "VisitRequestID")
    private String VisitRequestID;
    @TableField(value = "VisitorTypeID")
    private Integer VisitorTypeID;
    @TableField(value = "Status")
    private String Status;
    @TableField(value = "UserID")
    private Integer UserID;
    @TableField(value = "ExpectedArriveDateTime")
    private LocalDateTime ExpectedArriveDateTime;
    @TableField(value = "ExpectedLeavingDateTime")
    private LocalDateTime ExpectedLeavingDateTime;
    @TableField(value = "AdditionalNotes")
    private String AdditionalNotes;
    @TableField(value = "WalkInVisitor")
    private Integer WalkInVisitor;
    @TableField(value = "Address")
    private String Address;
    @TableField(value = "Reason")
    private String Reason;


}
