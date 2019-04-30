package com.wqy.model.brand;


import cn.afterturn.easypoi.excel.annotation.Excel;
import com.wqy.model.base.WebBaseBrandInfo;
import lombok.Data;

import java.io.Serializable;

/**
 * 前端商标实体类
 * @author wangqiuye
 */
@Data
public class WebBrandInfo extends WebBaseBrandInfo implements Serializable {

    private String id;
    /**
     * 其他字段 WebBaseBrandInfo
     */
    @Excel(name ="备注" )
    private String bz;
    @Excel(name = "档案编号")
    private String fileNumber;
    @Excel(name = "商品/服务")
    private String commodity;
    @Excel(name = "档案编号")
    private String brandType;
    @Excel(name = "商标授权日")
    private String authorization;
    @Excel(name = "共有人")
    private String partOwer;
    @Excel(name = "颜色")
    private String color;
    @Excel(name = "最早使用日期")
    private String firstDate;
    @Excel(name = "项目申请编号")
    private String projectApplyNumber;
    @Excel(name = "受理日期")
    private String acceptDate;
    @Excel(name = "国际注册日期")
    private String intRegDate;
    @Excel(name = "后期指定日期")
    private String lateDate;
    @Excel(name = "著名商标认定")
    private String faomousTrademark;
    @Excel(name = "驰名商标认定")
    private String reputedTrademark;
    @Excel(name = "驳回记录")
    private String reject;
    @Excel(name = "预留字段1")
    private String ext1;
    @Excel(name = "预留字段2")
    private String ext2;
    @Excel(name = "预留字段3")
    private String ext3;
    @Excel(name = "预留字段4")
    private String ext4;
    @Excel(name = "预留字段5")
    private String ext5;
    @Excel(name = "预留字段6")
    private String ext6;

    @Excel(name = " 已经过时，注册公告日期")
    private String regDate;
    @Excel(name = " 已经过时，初步审定公告日 同初审公告日期")
    private String noticeDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    public String getCommodity() {
        return commodity;
    }

    public void setCommodity(String commodity) {
        this.commodity = commodity;
    }

    public String getBrandType() {
        return brandType;
    }

    public void setBrandType(String brandType) {
        this.brandType = brandType;
    }

    @Override
    public String getAuthorization() {
        return authorization;
    }

    @Override
    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public String getPartOwer() {
        return partOwer;
    }

    public void setPartOwer(String partOwer) {
        this.partOwer = partOwer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(String firstDate) {
        this.firstDate = firstDate;
    }

    public String getProjectApplyNumber() {
        return projectApplyNumber;
    }

    public void setProjectApplyNumber(String projectApplyNumber) {
        this.projectApplyNumber = projectApplyNumber;
    }

    public String getAcceptDate() {
        return acceptDate;
    }

    public void setAcceptDate(String acceptDate) {
        this.acceptDate = acceptDate;
    }

    public String getIntRegDate() {
        return intRegDate;
    }

    public void setIntRegDate(String intRegDate) {
        this.intRegDate = intRegDate;
    }

    public String getLateDate() {
        return lateDate;
    }

    public void setLateDate(String lateDate) {
        this.lateDate = lateDate;
    }

    public String getFaomousTrademark() {
        return faomousTrademark;
    }

    public void setFaomousTrademark(String faomousTrademark) {
        this.faomousTrademark = faomousTrademark;
    }

    public String getReputedTrademark() {
        return reputedTrademark;
    }

    public void setReputedTrademark(String reputedTrademark) {
        this.reputedTrademark = reputedTrademark;
    }

    public String getReject() {
        return reject;
    }

    public void setReject(String reject) {
        this.reject = reject;
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

    public String getExt6() {
        return ext6;
    }

    public void setExt6(String ext6) {
        this.ext6 = ext6;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeDate(String noticeDate) {
        this.noticeDate = noticeDate;
    }
}
