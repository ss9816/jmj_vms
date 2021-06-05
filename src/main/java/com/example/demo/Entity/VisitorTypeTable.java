package com.example.demo.Entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("VisitorTypeTable")
public class VisitorTypeTable implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField(value = "TypeID")
    private Integer TypeID;
    @TableField(value = "TypeDesc")
    private String TypeDesc;


}
