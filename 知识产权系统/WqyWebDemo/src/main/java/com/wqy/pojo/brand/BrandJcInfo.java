package com.wqy.pojo.brand;

import lombok.Data;

import java.util.Date;

/**
 * 商标监测信息
 */
@Data
public class BrandJcInfo {
    private String id;
    private String image;
    private String apply_number;
    private String apply_name;
    private String sb_type;
    private String groups;
    private Date apply_date_start;
    private Date apply_date_end;
    private Date apply_date;
    private Date start_date;
    private Date end_date;
    private String results;


}
