package com.wqy.pojo.patent;

import lombok.Data;

import java.util.Date;

/**
 * 专利转让信息
 */
@Data
public class PatentAcceptInfo {

    private String id;
    private String pid;
    private String technical_classification;
    private String patentName;
    private String image;
    private String protected_areas;
    private String patent_type;
    private Date apply_date;
    private String apply_name;
    private String apply_number;
    private Date accredit_date;
    private String patent_number;
    private String egency;
    private String assign_number;
    private String assign_name;
    private String accept_name;
    private Date accept_date;
    private Date accept_finish_date;
    private String other;

    private String address;

    private String hid_value_address;


}
