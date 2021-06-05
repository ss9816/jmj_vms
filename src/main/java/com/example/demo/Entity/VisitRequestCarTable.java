package com.example.demo.Entity;

import java.io.Serializable;
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
    public class VisitRequestCarTable implements Serializable {

    private static final long serialVersionUID = 1L;

    private String VisitRequestID;

    private String VisitorName;

    private String VisitorTel;

    private String VisitorVehicleType;

    private Integer PeopleCount;

    private String VisitorPlateNum;

    private String VehicleTypeNotes;


}
