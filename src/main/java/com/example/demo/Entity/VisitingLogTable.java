package com.example.demo.Entity;

import java.time.LocalDateTime;
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
    public class VisitingLogTable implements Serializable {

    private static final long serialVersionUID = 1L;

      private String VisitingLogID;

    private String VisitRequestID;

    private Integer VisitorTypeID;

    private String VisitorName;

    private String VisitorTel;

    private String ResidentsAddress;

    private String AdditionalNotes;

    private String VisitorVehicleType;

    private String VisitorPlateNum;

    private String VehicleTypeNotes;

    private Integer PeopleCount;

    private Integer WalkInVisitor;

    private LocalDateTime ExpectedArriveDateTime;

    private LocalDateTime ExpectedLeavingDateTime;

    private LocalDateTime ActualArrivedDateTime;

    private LocalDateTime ActualLeavingDateTime;

    private byte[] VisitorLicenseImage;

    private String VisitStatus;

    private String Reason;


}
