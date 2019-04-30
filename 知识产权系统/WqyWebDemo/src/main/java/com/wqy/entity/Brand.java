package com.wqy.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;

import java.util.Date;
@ExcelTarget("商标")
public class Brand {

    private String id;

    @Excel(name ="商标标样",type = 2,savePath = "")
    private String brandStyle;
    @Excel(name ="商标名称" )
    private String brandName;
    @Excel(name ="群组" )
    private String groups;
    @Excel(name ="类别" )
    private String category;
    @Excel(name ="保护地域" )
    private String protectedAreas;
    @Excel(name ="申请人" )
    private String applyName;
    @Excel(name ="操作地" )
    private String address;
    @Excel(name ="申请号" )
    private String applyNumber;
    @Excel(name ="申请日",format="yyyy/MM/dd/",width = 15.0)
    private Date applyDate;
    @Excel(name ="初审公告日期",format="yyyy/MM/dd/",width = 15.0 )
    private Date cbsdggr;
    @Excel(name ="注册公告日期",format="yyyy/MM/dd/",width = 15.0 )
    private Date zcggr;
    @Excel(name ="注册号" )
    private String regNumber;
    @Excel(name ="专利权期限" )
    private Date deadline;
    @Excel(name ="法律状态" )
    private String state;
    @Excel(name ="申请项目表" )
    private String sqxmb;
    @Excel(name ="代理机构" )
    private String agency;
    @Excel(name ="商标来源" )
    private String brandSource;
    @Excel(name ="备注" )
    private String bz;

    private String fileNumber;

    private Date regDate;

    private String commodity;

    private String brandType;

    private Date authorization;

    private String partOwer;

    private String color;

    private Date firstDate;

    private String projectApplyNumber;

    private String applyUnit;

    private String useUnit;

    private Date acceptDate;

    private Date noticeDate;

    private Date intRegDate;

    private Date lateDate;

    private String faomousTrademark;

    private String reputedTrademark;

    private String reject;

    private String ext1;

    private String ext2;

    private String ext3;

    private String ext4;

    private String ext5;

    private String ext6;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBrandStyle() {
        return brandStyle;
    }

    public void setBrandStyle(String brandStyle) {
        this.brandStyle = brandStyle == null ? null : brandStyle.trim();
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber == null ? null : fileNumber.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getApplyName() {
        return applyName;
    }

    public void setApplyName(String applyName) {
        this.applyName = applyName == null ? null : applyName.trim();
    }

    public String getProtectedAreas() {
        return protectedAreas;
    }

    public void setProtectedAreas(String protectedAreas) {
        this.protectedAreas = protectedAreas == null ? null : protectedAreas.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getApplyNumber() {
        return applyNumber;
    }

    public void setApplyNumber(String applyNumber) {
        this.applyNumber = applyNumber == null ? null : applyNumber.trim();
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber == null ? null : regNumber.trim();
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups == null ? null : groups.trim();
    }

    public String getCommodity() {
        return commodity;
    }

    public void setCommodity(String commodity) {
        this.commodity = commodity == null ? null : commodity.trim();
    }

    public String getBrandType() {
        return brandType;
    }

    public void setBrandType(String brandType) {
        this.brandType = brandType == null ? null : brandType.trim();
    }

    public Date getAuthorization() {
        return authorization;
    }

    public void setAuthorization(Date authorization) {
        this.authorization = authorization;
    }

    public String getPartOwer() {
        return partOwer;
    }

    public void setPartOwer(String partOwer) {
        this.partOwer = partOwer == null ? null : partOwer.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency == null ? null : agency.trim();
    }

    public Date getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(Date firstDate) {
        this.firstDate = firstDate;
    }

    public String getBrandSource() {
        return brandSource;
    }

    public void setBrandSource(String brandSource) {
        this.brandSource = brandSource == null ? null : brandSource.trim();
    }

    public String getProjectApplyNumber() {
        return projectApplyNumber;
    }

    public void setProjectApplyNumber(String projectApplyNumber) {
        this.projectApplyNumber = projectApplyNumber == null ? null : projectApplyNumber.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getApplyUnit() {
        return applyUnit;
    }

    public void setApplyUnit(String applyUnit) {
        this.applyUnit = applyUnit == null ? null : applyUnit.trim();
    }

    public String getUseUnit() {
        return useUnit;
    }

    public void setUseUnit(String useUnit) {
        this.useUnit = useUnit == null ? null : useUnit.trim();
    }

    public Date getAcceptDate() {
        return acceptDate;
    }

    public void setAcceptDate(Date acceptDate) {
        this.acceptDate = acceptDate;
    }

    public Date getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeDate(Date noticeDate) {
        this.noticeDate = noticeDate;
    }

    public Date getIntRegDate() {
        return intRegDate;
    }

    public void setIntRegDate(Date intRegDate) {
        this.intRegDate = intRegDate;
    }

    public Date getLateDate() {
        return lateDate;
    }

    public void setLateDate(Date lateDate) {
        this.lateDate = lateDate;
    }

    public String getFaomousTrademark() {
        return faomousTrademark;
    }

    public void setFaomousTrademark(String faomousTrademark) {
        this.faomousTrademark = faomousTrademark == null ? null : faomousTrademark.trim();
    }

    public String getReputedTrademark() {
        return reputedTrademark;
    }

    public void setReputedTrademark(String reputedTrademark) {
        this.reputedTrademark = reputedTrademark == null ? null : reputedTrademark.trim();
    }

    public String getReject() {
        return reject;
    }

    public void setReject(String reject) {
        this.reject = reject == null ? null : reject.trim();
    }

    public Date getCbsdggr() {
        return cbsdggr;
    }

    public void setCbsdggr(Date cbsdggr) {
        this.cbsdggr = cbsdggr;
    }

    public Date getZcggr() {
        return zcggr;
    }

    public void setZcggr(Date zcggr) {
        this.zcggr = zcggr;
    }

    public String getSqxmb() {
        return sqxmb;
    }

    public void setSqxmb(String sqxmb) {
        this.sqxmb = sqxmb == null ? null : sqxmb.trim();
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

    public String getExt6() {
        return ext6;
    }

    public void setExt6(String ext6) {
        this.ext6 = ext6 == null ? null : ext6.trim();
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id='" + id + '\'' +
                ", brandStyle='" + brandStyle + '\'' +
                ", brandName='" + brandName + '\'' +
                ", groups='" + groups + '\'' +
                ", category='" + category + '\'' +
                ", protectedAreas='" + protectedAreas + '\'' +
                ", applyName='" + applyName + '\'' +
                ", address='" + address + '\'' +
                ", applyNumber='" + applyNumber + '\'' +
                ", applyDate=" + applyDate +
                ", cbsdggr=" + cbsdggr +
                ", zcggr=" + zcggr +
                ", regNumber='" + regNumber + '\'' +
                ", deadline=" + deadline +
                ", state='" + state + '\'' +
                ", sqxmb='" + sqxmb + '\'' +
                ", agency='" + agency + '\'' +
                ", brandSource='" + brandSource + '\'' +
                ", bz='" + bz + '\'' +
                ", fileNumber='" + fileNumber + '\'' +
                ", regDate=" + regDate +
                ", commodity='" + commodity + '\'' +
                ", brandType='" + brandType + '\'' +
                ", authorization=" + authorization +
                ", partOwer='" + partOwer + '\'' +
                ", color='" + color + '\'' +
                ", firstDate=" + firstDate +
                ", projectApplyNumber='" + projectApplyNumber + '\'' +
                ", applyUnit='" + applyUnit + '\'' +
                ", useUnit='" + useUnit + '\'' +
                ", acceptDate=" + acceptDate +
                ", noticeDate=" + noticeDate +
                ", intRegDate=" + intRegDate +
                ", lateDate=" + lateDate +
                ", faomousTrademark='" + faomousTrademark + '\'' +
                ", reputedTrademark='" + reputedTrademark + '\'' +
                ", reject='" + reject + '\'' +
                ", ext1='" + ext1 + '\'' +
                ", ext2='" + ext2 + '\'' +
                ", ext3='" + ext3 + '\'' +
                ", ext4='" + ext4 + '\'' +
                ", ext5='" + ext5 + '\'' +
                ", ext6='" + ext6 + '\'' +
                '}';
    }
}