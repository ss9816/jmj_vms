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
    public class IncomerPermissionSetupTable implements Serializable {

    private static final long serialVersionUID = 1L;

      private Integer IncomerSetupID;

    private Integer DAT1;

    private Integer DAT2;

    private String CarAllowed;


}
