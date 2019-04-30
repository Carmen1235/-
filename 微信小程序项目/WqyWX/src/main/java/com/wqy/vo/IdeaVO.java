package com.wqy.vo;

import java.util.Date;

/**
 * @author 王秋叶
 * @create 2018-08-08 9:59
 * @desc 微信端发送的 意见/建议 网页 实体信息
 **/
public class IdeaVO {
    private String id;

    private String wxId;

    private String userName;

    private String nickName;

    private String department;

    private String userId;

    private Long telPhone;

    private String question;

    private Date createDate;

    private String sort;

    private String ex1;

    private String ex2;

    private String ex3;

    @Override
    public String toString() {
        return "IdeaVO{" +
                "id='" + id + '\'' +
                ", wxId='" + wxId + '\'' +
                ", userName='" + userName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", department='" + department + '\'' +
                ", userId='" + userId + '\'' +
                ", telPhone=" + telPhone +
                ", question='" + question + '\'' +
                ", createDate=" + createDate +
                ", sort='" + sort + '\'' +
                ", ex1='" + ex1 + '\'' +
                ", ex2='" + ex2 + '\'' +
                ", ex3='" + ex3 + '\'' +
                '}';
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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
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
}
