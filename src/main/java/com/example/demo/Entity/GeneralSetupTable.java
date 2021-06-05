package com.example.demo.Entity;

import com.baomidou.mybatisplus.annotation.IdType;

import java.time.LocalDate;

import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.ibatis.annotations.ConstructorArgs;

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
public class GeneralSetupTable implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "GeneralSetupID", type = IdType.AUTO)
    private Integer GeneralSetupID;

    private LocalDate DataRetention;

    private Integer ThemeID;

    private Integer WalkInAllowed;


}
