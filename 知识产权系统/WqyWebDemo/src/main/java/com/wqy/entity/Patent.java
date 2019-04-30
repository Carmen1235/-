package com.wqy.entity;

import java.util.Date;

public class Patent {
    private String id;

    private String technicalClassification;

    private String patentname;

    private String image;

    private String patentProduct;

    private String applyType;

    private String protectedAreas;

    private String patentType;

    private String address;

    private Date applyDate;

    private String applyName;

    private String applyNumber;

    private String state;

    private Date accreditDate;

    private String patentNumber;

    private Date patentEndDate;

    private Date patentInvalidDate;

    private String egency;

    private Date priorityDeadline;

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

    @Override
    public String toString() {
        return "Patent{" +
                "id='" + id + '\'' +
                ", technicalClassification='" + technicalClassification + '\'' +
                ", patentname='" + patentname + '\'' +
                ", image='" + image + '\'' +
                ", patentProduct='" + patentProduct + '\'' +
                ", applyType='" + applyType + '\'' +
                ", protectedAreas='" + protectedAreas + '\'' +
                ", patentType='" + patentType + '\'' +
                ", address='" + address + '\'' +
                ", applyDate=" + applyDate +
                ", applyName='" + applyName + '\'' +
                ", applyNumber='" + applyNumber + '\'' +
                ", state='" + state + '\'' +
                ", accreditDate=" + accreditDate +
                ", patentNumber='" + patentNumber + '\'' +
                ", patentEndDate=" + patentEndDate +
                ", patentInvalidDate=" + patentInvalidDate +
                ", egency='" + egency + '\'' +
                ", priorityDeadline=" + priorityDeadline +
                ", applyTable='" + applyTable + '\'' +
                ", patentLevel='" + patentLevel + '\'' +
                ", vettingProcess='" + vettingProcess + '\'' +
                ", gkh='" + gkh + '\'' +
                ", ly='" + ly + '\'' +
                ", bz='" + bz + '\'' +
                ", ext1='" + ext1 + '\'' +
                ", ext2='" + ext2 + '\'' +
                ", ext3='" + ext3 + '\'' +
                ", ext4='" + ext4 + '\'' +
                ", ext5='" + ext5 + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTechnicalClassification() {
        return technicalClassification;
    }

    public void setTechnicalClassification(String technicalClassification) {
        this.technicalClassification = technicalClassification == null ? null : technicalClassification.trim();
    }

    public String getPatentname() {
        return patentname;
    }

    public void setPatentname(String patentname) {
        this.patentname = patentname == null ? null : patentname.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getPatentProduct() {
        return patentProduct;
    }

    public void setPatentProduct(String patentProduct) {
        this.patentProduct = patentProduct == null ? null : patentProduct.trim();
    }

    public String getApplyType() {
        return applyType;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType == null ? null : applyType.trim();
    }

    public String getProtectedAreas() {
        return protectedAreas;
    }

    public void setProtectedAreas(String protectedAreas) {
        this.protectedAreas = protectedAreas == null ? null : protectedAreas.trim();
    }

    public String getPatentType() {
        return patentType;
    }

    public void setPatentType(String patentType) {
        this.patentType = patentType == null ? null : patentType.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public String getApplyName() {
        return applyName;
    }

    public void setApplyName(String applyName) {
        this.applyName = applyName == null ? null : applyName.trim();
    }

    public String getApplyNumber() {
        return applyNumber;
    }

    public void setApplyNumber(String applyNumber) {
        this.applyNumber = applyNumber == null ? null : applyNumber.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getAccreditDate() {
        return accreditDate;
    }

    public void setAccreditDate(Date accreditDate) {
        this.accreditDate = accreditDate;
    }

    public String getPatentNumber() {
        return patentNumber;
    }

    public void setPatentNumber(String patentNumber) {
        this.patentNumber = patentNumber == null ? null : patentNumber.trim();
    }

    public Date getPatentEndDate() {
        return patentEndDate;
    }

    public void setPatentEndDate(Date patentEndDate) {
        this.patentEndDate = patentEndDate;
    }

    public Date getPatentInvalidDate() {
        return patentInvalidDate;
    }

    public void setPatentInvalidDate(Date patentInvalidDate) {
        this.patentInvalidDate = patentInvalidDate;
    }

    public String getEgency() {
        return egency;
    }

    public void setEgency(String egency) {
        this.egency = egency == null ? null : egency.trim();
    }

    public Date getPriorityDeadline() {
        return priorityDeadline;
    }

    public void setPriorityDeadline(Date priorityDeadline) {
        this.priorityDeadline = priorityDeadline;
    }

    public String getApplyTable() {
        return applyTable;
    }

    public void setApplyTable(String applyTable) {
        this.applyTable = applyTable == null ? null : applyTable.trim();
    }

    public String getPatentLevel() {
        return patentLevel;
    }

    public void setPatentLevel(String patentLevel) {
        this.patentLevel = patentLevel == null ? null : patentLevel.trim();
    }

    public String getVettingProcess() {
        return vettingProcess;
    }

    public void setVettingProcess(String vettingProcess) {
        this.vettingProcess = vettingProcess == null ? null : vettingProcess.trim();
    }

    public String getGkh() {
        return gkh;
    }

    public void setGkh(String gkh) {
        this.gkh = gkh == null ? null : gkh.trim();
    }

    public String getLy() {
        return ly;
    }

    public void setLy(String ly) {
        this.ly = ly == null ? null : ly.trim();
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1 == null ? null : ext1.trim();
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2 == null ? null : ext2.trim();
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3 == null ? null : ext3.trim();
    }

    public String getExt4() {
        return ext4;
    }

    public void setExt4(String ext4) {
        this.ext4 = ext4 == null ? null : ext4.trim();
    }

    public String getExt5() {
        return ext5;
    }

    public void setExt5(String ext5) {
        this.ext5 = ext5 == null ? null : ext5.trim();
    }
}