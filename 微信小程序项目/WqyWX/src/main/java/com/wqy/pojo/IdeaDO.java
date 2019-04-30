package com.wqy.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;

import java.util.Date;

/**
 * @Auther: 王秋叶
 * @author: WangQiuYe
 * @Date: 2018/8/17 13:22
 * @Description: IdeaDO对象
 */
@ExcelTarget("ideaDO")
public class IdeaDO {
    private String id;

    private String wxId;

    @Excel(name = "姓名")
    private String userName;

    @Excel(name = "昵称")
    private String nickName;

    @Excel(name = "部门")
    private String department;

    private String userId;

    @Excel(name = "联系方式")
    private Long telPhone;

    @Excel(name = "反馈意见")
    private String question;

    @Excel(name="创建时间",databaseFormat = "yyyyMMddHHmmss", format = "yyyy-MM-dd",  width = 20)
    private Date createDate;

    /**
     * createDateStart
     */
    private Date createDateStart;
    /**
     * createDateEnd
     */
    private Date createDateEnd;

    @Excel(name = "分类")
    private String sort;

    private String ex1;

    private String ex2;

    private String ex3;

    @Override
    public String toString() {
        return "IdeaDO{" +
                "id='" + id + '\'' +
                ", wxId='" + wxId + '\'' +
                ", userName='" + userName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", department='" + department + '\'' +
                ", userId='" + userId + '\'' +
                ", telPhone=" + telPhone +
                ", question='" + question + '\'' +
                ", createDate=" + createDate +
                ", createDateStart=" + createDateStart +
                ", createDateEnd=" + createDateEnd +
                ", sort='" + sort + '\'' +
                ", ex1='" + ex1 + '\'' +
                ", ex2='" + ex2 + '\'' +
                ", ex3='" + ex3 + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getTelPhone() {
        return telPhone;
    }

    public void setTelPhone(Long telPhone) {
        this.telPhone = telPhone;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getCreateDateStart() {
        return createDateStart;
    }

    public void setCreateDateStart(Date createDateStart) {
        this.createDateStart = createDateStart;
    }

    public Date getCreateDateEnd() {
        return createDateEnd;
    }

    public void setCreateDateEnd(Date createDateEnd) {
        this.createDateEnd = createDateEnd;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getEx1() {
        return ex1;
    }

    public void setEx1(String ex1) {
        this.ex1 = ex1;
    }

    public String getEx2() {
        return ex2;
    }

    public void setEx2(String ex2) {
        this.ex2 = ex2;
    }

    public String getEx3() {
        return ex3;
    }

    public void setEx3(String ex3) {
        this.ex3 = ex3;
    }
}
