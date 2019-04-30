package com.wqy.model.patent;

import lombok.Data;
import org.aspectj.lang.annotation.DeclareAnnotation;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 前端专利实体类
 */
@Data
public class WebPatentInfo {
    private String id;

    /**
     * 技术类型/分类
     */
    private String technicalClassification;

    /**
     * 专利名称
     */
    private String patentname;

    private String image;

    private String patentProduct;

    private String applyType;

    /**
     * 保护地域
     */
    private String protectedAreas;

    private String patentType;

    private String address;

    /**
     * 专利申请日
     */
    private String applyDateStart;
    private String applyDate;
    private String applyDateEnd;

    /**
     * 申请人
     */
    private String applyName;

    /**
     * 申请号
     */
    private String applyNumber;

    /**
     * 法律状态
     */
    private String state;

    /**
     * 授权公告日
     */
    private String accreditDateStart;
    private String accreditDate;
    private String accreditDateEnd;

    /**
     * 专利号
     */
    private String patentNumber;

    /**
     * 专利截止日
     */
    private String patentEndDateStart;
    private String patentEndDate;
    private String patentEndDateEnd;

    private String patentInvalidDate;

    private String egency;

    private String priorityDeadline;

    private String applyTable;

    private String patentLevel;

    private String vettingProcess;

    private String gkh;

    private String ly;

    private String bz;

    private String ext1;

    private String ext2;

    private String ext3;

    private String ext4;

    private String ext5;

    private String hid_value_address;

    private List adds;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTechnicalClassification() {
        return technicalClassification;
    }

    public void setTechnicalClassification(String technicalClassification) {
        this.technicalClassification = technicalClassification;
    }

    public String getPatentname() {
        return patentname;
    }

    public void setPatentname(String patentname) {
        this.patentname = patentname;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPatentProduct() {
        return patentProduct;
    }

    public void setPatentProduct(String patentProduct) {
        this.patentProduct = patentProduct;
    }

    public String getApplyType() {
        return applyType;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }

    public String getProtectedAreas() {
        return protectedAreas;
    }

    public void setProtectedAreas(String protectedAreas) {
        this.protectedAreas = protectedAreas;
    }

    public String getPatentType() {
        return patentType;
    }

    public void setPatentType(String patentType) {
        this.patentType = patentType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getApplyDateStart() {
        return applyDateStart;
    }

    public void setApplyDateStart(String applyDateStart) {
        this.applyDateStart = applyDateStart;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getApplyDateEnd() {
        return applyDateEnd;
    }

    public void setApplyDateEnd(String applyDateEnd) {
        this.applyDateEnd = applyDateEnd;
    }

    public String getApplyName() {
        return applyName;
    }

    public void setApplyName(String applyName) {
        this.applyName = applyName;
    }

    public String getApplyNumber() {
        return applyNumber;
    }

    public void setApplyNumber(String applyNumber) {
        this.applyNumber = applyNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAccreditDateStart() {
        return accreditDateStart;
    }

    public void setAccreditDateStart(String accreditDateStart) {
        this.accreditDateStart = accreditDateStart;
    }

    public String getAccreditDate() {
        return accreditDate;
    }

    public void setAccreditDate(String accreditDate) {
        this.accreditDate = accreditDate;
    }

    public String getAccreditDateEnd() {
        return accreditDateEnd;
    }

    public void setAccreditDateEnd(String accreditDateEnd) {
        this.accreditDateEnd = accreditDateEnd;
    }

    public String getPatentNumber() {
        return patentNumber;
    }

    public void setPatentNumber(String patentNumber) {
        this.patentNumber = patentNumber;
    }

    public String getPatentEndDateStart() {
        return patentEndDateStart;
    }

    public void setPatentEndDateStart(String patentEndDateStart) {
        this.patentEndDateStart = patentEndDateStart;
    }

    public String getPatentEndDate() {
        return patentEndDate;
    }

    public void setPatentEndDate(String patentEndDate) {
        this.patentEndDate = patentEndDate;
    }

    public String getPatentEndDateEnd() {
        return patentEndDateEnd;
    }

    public void setPatentEndDateEnd(String patentEndDateEnd) {
        this.patentEndDateEnd = patentEndDateEnd;
    }

    public String getPatentInvalidDate() {
        return patentInvalidDate;
    }

    public void setPatentInvalidDate(String patentInvalidDate) {
        this.patentInvalidDate = patentInvalidDate;
    }

    public String getEgency() {
        return egency;
    }

    public void setEgency(String egency) {
        this.egency = egency;
    }

    public String getPriorityDeadline() {
        return priorityDeadline;
    }

    public void setPriorityDeadline(String priorityDeadline) {
        this.priorityDeadline = priorityDeadline;
    }

    public String getApplyTable() {
        return applyTable;
    }

    public void setApplyTable(String applyTable) {
        this.applyTable = applyTable;
    }

    public String getPatentLevel() {
        return patentLevel;
    }

    public void setPatentLevel(String patentLevel) {
        this.patentLevel = patentLevel;
    }

    public String getVettingProcess() {
        return vettingProcess;
    }

    public void setVettingProcess(String vettingProcess) {
        this.vettingProcess = vettingProcess;
    }

    public String getGkh() {
        return gkh;
    }

    public void setGkh(String gkh) {
        this.gkh = gkh;
    }

    public String getLy() {
        return ly;
    }

    public void setLy(String ly) {
        this.ly = ly;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3;
    }

    public String getExt4() {
        return ext4;
    }

    public void setExt4(String ext4) {
        this.ext4 = ext4;
    }

    public String getExt5() {
        return ext5;
    }

    public void setExt5(String ext5) {
        this.ext5 = ext5;
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

    public String getSort() {
        return sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    /**
     * 排序字段
     */
    private String sort;
    private String order;

    public void setSort(String sort) {
        switch (sort) {
            case "patentname":
                this.sort = this.isEqualsOrOther(sort, "patentname");
                break;
            case "patentNumber":
                this.sort = this.isEqualsOrOther(sort, "patent_number");
                break;
            case "technicalClassification":
                this.sort = this.isEqualsOrOther(sort, "technical_classification");
                break;
            case "applyName":
                this.sort = this.isEqualsOrOther(sort, "apply_name");
                break;
            case "applyNumber":
                this.sort = this.isEqualsOrOther(sort, "apply_number");
                break;
            case "protectedAreas":
                this.sort = this.isEqualsOrOther(sort, "protected_areas");
                break;
            case "state":
                this.sort = this.isEqualsOrOther(sort, "state");
                break;
            case "applyDate":
                this.sort = this.isEqualsOrOther(sort, "apply_date");
                break;
            case "accreditDate":
                this.sort = this.isEqualsOrOther(sort, "accredit_date");
                break;
            case "patentEndDate":
                this.sort = this.isEqualsOrOther(sort, "patent_end_date");
                break;
            case "patentProduct":
                this.sort = this.isEqualsOrOther(sort, "patent_product");
                break;
            case "applyType":
                this.sort = this.isEqualsOrOther(sort, "apply_type");
                break;
            case "patentType":
                this.sort = this.isEqualsOrOther(sort, "patent_type");
                break;
            case "address":
                this.sort = this.isEqualsOrOther(sort, "address");
                break;
            case "patentInvalidDate":
                this.sort = this.isEqualsOrOther(sort, "patent_invalid_date");
                break;
            case "egency":
                this.sort = this.isEqualsOrOther(sort, "egency");
                break;
            case "priorityDeadline":
                this.sort = this.isEqualsOrOther(sort, "priority_deadline");
            case "patentLevel":
                this.sort = this.isEqualsOrOther(sort, "patent_level");
                break;
            default:
                break;
        }


    }

    public String isEqualsOrOther(String regStr, String other) {
        if (regStr.equals(other)) {
            return regStr;
        } else {
            return other;
        }
    }
}
