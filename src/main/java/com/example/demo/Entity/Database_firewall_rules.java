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
    public class Database_firewall_rules implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String start_ip_address;

    private String end_ip_address;

    private LocalDateTime create_date;

    private LocalDateTime modify_date;


}
