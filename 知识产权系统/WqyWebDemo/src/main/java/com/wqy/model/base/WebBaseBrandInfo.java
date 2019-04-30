package com.wqy.model.base;


import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.List;

/**
 * 前端商标公共实体
 * @author wangqiuye
 */
@Data
public class WebBaseBrandInfo {

    @Excel(name ="商标标样")
    private String brandStyle="";
    @Excel(name ="商标名称" )
    private String brandName="";
    @Excel(name ="群组" )
    private String groups="";
    @Excel(name ="类别" )
    private String category="";
    @Excel(name ="保护地域" )
    private String protectedAreas="";
    @Excel(name ="申请人" )
    private String applyName="";
    @Excel(name ="操作地" )
    private String address="";
    @Excel(name ="申请号" )
    private String applyNumber;
    @Excel(name ="申请日")
    private String applyDate="";
    @Excel(name ="初审公告日期")
    private String cbsdggr="";
    @Excel(name ="注册公告日期")
    private String zcggr="";
    @Excel(name ="注册号" )
    private String regNumber="";
    @Excel(name ="专利权期限" )
    private String deadline="";
    @Excel(name ="法律状态" )
    private String state="";
    @Excel(name ="申请项目表" )
    private String sqxmb="";
    @Excel(name ="代理机构" )
    private String agency="";
    @Excel(name ="商标来源" )
    private String brandSource="";
    @Excel(name = "商标授权日")
    private String authorization;

    /**
     * 权限
     */
    @Excel(name ="用户操作地址/用户权限" )
    private String hid_value_address="";
    @Excel(name ="用户操作地址/用户权限 String to List" )
    private List adds;
    /**
     * 查询条件
     */
    @Excel(name ="查询条件 申请日 开始范围" )
    private String apply_date_start;
    @Excel(name ="查询条件 申请日 结束范围" )
    private String apply_date_end;
    /**
     * 排序
     */
    @Excel(name ="排序字段" )
    private String sort;
    @Excel(name ="排序规则" )
    private String order;

    public String getBrandStyle() {
        return brandStyle;
    }

    public void setBrandStyle(String brandStyle) {
        this.brandStyle = brandStyle;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProtectedAreas() {
        return protectedAreas;
    }

    public void setProtectedAreas(String protectedAreas) {
        this.protectedAreas = protectedAreas;
    }

    public String getApplyName() {
        return applyName;
    }

    public void setApplyName(String applyName) {
        this.applyName = applyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getApplyNumber() {
        return applyNumber;
    }

    public void setApplyNumber(String applyNumber) {
        this.applyNumber = applyNumber;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getCbsdggr() {
        return cbsdggr;
    }

    public void setCbsdggr(String cbsdggr) {
        this.cbsdggr = cbsdggr;
    }

    public String getZcggr() {
        return zcggr;
    }

    public void setZcggr(String zcggr) {
        this.zcggr = zcggr;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSqxmb() {
        return sqxmb;
    }

    public void setSqxmb(String sqxmb) {
        this.sqxmb = sqxmb;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getBrandSource() {
        return brandSource;
    }

    public void setBrandSource(String brandSource) {
        this.brandSource = brandSource;
    }

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
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

    public String getApply_date_start() {
        return apply_date_start;
    }

    public void setApply_date_start(String apply_date_start) {
        this.apply_date_start = apply_date_start;
    }

    public String getApply_date_end() {
        return apply_date_end;
    }

    public void setApply_date_end(String apply_date_end) {
        this.apply_date_end = apply_date_end;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
