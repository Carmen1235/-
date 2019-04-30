package com.wqy.pojo.patent;

import lombok.Data;

import java.util.Date;

/**
 * 专利续展信息
 */
@Data
public class PatentRenewalsNewInfo {
    private String id;
    private String pid;
    private String technical_classification;
    private String patentName;
    private String image;
    private String patent_type;
    private String protected_areas;
    private String apply_type;
    private Date apply_date;
    private String apply_name;
    private String apply_number;
    private String state;
    private Date accredit_date;
    private String patent_number;
    private String egency;
    private String annual_fee;

    private String address;

    private String hid_value_address;


}
