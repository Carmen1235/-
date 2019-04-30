package com.wqy.pojo.patent;

import lombok.Data;

import java.util.Date;

/**
 * 专利无效宣告信息
 */
@Data
public class PatentInvalidDeclareInfo {
    private String id;
    private  String pid;
    private String technical_classification;
    private String patentName;
    private String image;
    private String patent_product;
    private String apply_type;
    private String protected_areas;
    private String patent_type;
    private String apply_date;
    private String apply_name;
    private Date accredit_date;
    private String patent_number;
    private String invalid_ower;
    private String invalid_files;
    private String results;

    private String address;

    private String hid_value_address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getTechnical_classification() {
        return technical_classification;
    }

    public void setTechnical_classification(String technical_classification) {
        this.technical_classification = technical_classification;
    }

    public String getPatentName() {
        return patentName;
    }

    public void setPatentName(String patentName) {
        this.patentName = patentName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPatent_product() {
        return patent_product;
    }

    public void setPatent_product(String patent_product) {
        this.patent_product = patent_product;
    }

    public String getApply_type() {
        return apply_type;
    }

    public void setApply_type(String apply_type) {
        this.apply_type = apply_type;
    }

    public String getProtected_areas() {
        return protected_areas;
    }

    public void setProtected_areas(String protected_areas) {
        this.protected_areas = protected_areas;
    }

    public String getPatent_type() {
        return patent_type;
    }

    public void setPatent_type(String patent_type) {
        this.patent_type = patent_type;
    }

    public String getApply_date() {
        return apply_date;
    }

    public void setApply_date(String apply_date) {
        this.apply_date = apply_date;
    }

    public String getApply_name() {
        return apply_name;
    }

    public void setApply_name(String apply_name) {
        this.apply_name = apply_name;
    }

    public Date getAccredit_date() {
        return accredit_date;
    }

    public void setAccredit_date(Date accredit_date) {
        this.accredit_date = accredit_date;
    }

    public String getPatent_number() {
        return patent_number;
    }

    public void setPatent_number(String patent_number) {
        this.patent_number = patent_number;
    }

    public String getInvalid_ower() {
        return invalid_ower;
    }

    public void setInvalid_ower(String invalid_ower) {
        this.invalid_ower = invalid_ower;
    }

    public String getInvalid_files() {
        return invalid_files;
    }

    public void setInvalid_files(String invalid_files) {
        this.invalid_files = invalid_files;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHid_value_address() {
        return hid_value_address;
    }

    public void setHid_value_address(String hid_value_address) {
        this.hid_value_address = hid_value_address;
    }
}
