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
    public class ThemeTable implements Serializable {

    private static final long serialVersionUID = 1L;

      private Integer ThemeID;

    private String ThemeName;

    private String ThemeStyleSheet;

    private byte[] Preview;


}
