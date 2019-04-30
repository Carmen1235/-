package com.wqy.model.brand;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.io.Serializable;
import java.util.List;


/**
 * 商标监测信息
 * @author wangqiuye
 */
@Data
public class WebBrandJcInfo implements Serializable {
    private String id;
    private String image;
    private String applyNumber="";
    private String applyName="";
    private String sbType="";
    private String groups="";
    private String applyDate="";
    private String startDate="";
    private String endDate="";
    private String results="";

    /**
     * 查询条件
     */
    private String apply_date_start="";
    private String apply_date_end="";
    /**
     * 权限
     */
    @Excel(name ="用户操作地址/用户权限" )
    private String hid_value_address="";
    @Excel(name ="用户操作地址/用户权限 String to List" )
    private List adds;
    /**
     * 排序
     */
    @Excel(name ="排序字段" )
    private String sort;
    @Excel(name ="排序规则" )
    private String order;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getApplyNumber() {
        return applyNumber;
    }

    public void setApplyNumber(String applyNumber) {
        this.applyNumber = applyNumber;
    }

    public String getApplyName() {
        return applyName;
    }

    public void setApplyName(String applyName) {
        this.applyName = applyName;
    }

    public String getSbType() {
        return sbType;
    }

    public void setSbType(String sbType) {
        this.sbType = sbType;
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
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
