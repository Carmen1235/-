package com.wqy.pojo.patent;

import lombok.Data;

import java.util.Date;

/**
 * 专利诉讼信息
 */
@Data
public class PatentLawsuitInfo {
    private String id;
    private String pid;
    private String technical_classification;
    private String patentName;
    private String image;
    private String patent_product;
    private String apply_type;
    private String protected_areas;
    private String patent_type;
    private Date apply_date;
    private String apply_name;
    private Date accredit_date;
    private String patent_number;
    private String suit;
    private String solicitor;
    private String lawyer;
    private String process;
    private String results;
    private String other;

    private String address;

    private String hid_value_address;


}
