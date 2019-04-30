package com.wqy.model.patent;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 专利诉讼信息
 */
@Data
public class WebPatentLawsuitInfo {
    private String id;
    private String pid;

    /**
     * 技术类型
     */
    private String technical_classification;

    /**
     * 专利名称
     */
    private String patentName;
    private String image;
    private String patent_product;
    private String apply_type;

    /**
     * 保护地域
     */
    private String protected_areas;
    private String patent_type;

    /**
     * 申请日
     */
    private String apply_date_start;
    private String apply_date;
    private String apply_date_end;

    /**
     * 申请人
     */
    private String apply_name;

    /**
     * 授权日
     */
    private String accredit_date_start;
    private String accredit_date;
    private String accredit_date_end;

    /**
     * 专利号
     */
    private String patent_number;
    private String suit;
    private String solicitor;
    private String lawyer;
    private String process;
    private String results;
    private String other;

    private String hid_value_address;

    private List adds;

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

    public String getApply_date_start() {
        return apply_date_start;
    }

    public void setApply_date_start(String apply_date_start) {
        this.apply_date_start = apply_date_start;
    }

    public String getApply_date() {
        return apply_date;
    }

    public void setApply_date(String apply_date) {
        this.apply_date = apply_date;
    }

    public String getApply_date_end() {
        return apply_date_end;
    }

    public void setApply_date_end(String apply_date_end) {
        this.apply_date_end = apply_date_end;
    }

    public String getApply_name() {
        return apply_name;
    }

    public void setApply_name(String apply_name) {
        this.apply_name = apply_name;
    }

    public String getAccredit_date_start() {
        return accredit_date_start;
    }

    public void setAccredit_date_start(String accredit_date_start) {
        this.accredit_date_start = accredit_date_start;
    }

    public String getAccredit_date() {
        return accredit_date;
    }

    public void setAccredit_date(String accredit_date) {
        this.accredit_date = accredit_date;
    }

    public String getAccredit_date_end() {
        return accredit_date_end;
    }

    public void setAccredit_date_end(String accredit_date_end) {
        this.accredit_date_end = accredit_date_end;
    }

    public String getPatent_number() {
        return patent_number;
    }

    public void setPatent_number(String patent_number) {
        this.patent_number = patent_number;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getSolicitor() {
        return solicitor;
    }

    public void setSolicitor(String solicitor) {
        this.solicitor = solicitor;
    }

    public String getLawyer() {
        return lawyer;
    }

    public void setLawyer(String lawyer) {
        this.lawyer = lawyer;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getHid_value_address() {
        return hid_value_address;
    }

    public void setHid_value_address(String hid_value_address) {
        this.hid_value_address = hid_value_address;
    }

    public List getAdds() {
        return adds;
    }

    public void setAdds(List adds) {
        this.adds = adds;
    }
}
