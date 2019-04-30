package com.wqy.vo;

/**
 * @Auther: 王秋叶
 * @Date: 2018/8/17 10:53
 * @author
 * @Description: 网页端 发送的Mail实体
 */
public class MailVO {
    /**
     * id 网页端id
     */
    private String id;

    /**
     * wxid
     */
    private String wxid;

    /**
     * username
     */
    private String username;

    /**
     * department
     */
    private String department;

    /**
     * userid
     */
    private String userid;


    /**
     * telphone
     */
    private Long telphone;

    /**
     * question
     */
    private String question;

    /**
     * createDateStart
     */
    private String createDateStart;
    /**
     * createDateEnd
     */
    private String createDateEnd;
    /**
     * createDate
     */
    private String createDate;

    /**
     * sort
     */
    private String sort;

    private String ex1;

    private String ex2;

    private String ex3;


    @Override
    public String toString() {
        return "MailVO{" +
                "id='" + id + '\'' +
                ", wxid='" + wxid + '\'' +
                ", username='" + username + '\'' +
                ", department='" + department + '\'' +
                ", userid='" + userid + '\'' +
                ", telphone=" + telphone +
                ", question='" + question + '\'' +
                ", createDateStart='" + createDateStart + '\'' +
                ", createDateEnd='" + createDateEnd + '\'' +
                ", createDate='" + createDate + '\'' +
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

    public String getWxid() {
        return wxid;
    }

    public void setWxid(String wxid) {
        this.wxid = wxid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Long getTelphone() {
        return telphone;
    }

    public void setTelphone(Long telphone) {
        this.telphone = telphone;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCreateDateStart() {
        return createDateStart;
    }

    public void setCreateDateStart(String createDateStart) {
        this.createDateStart = createDateStart;
    }

    public String getCreateDateEnd() {
        return createDateEnd;
    }

    public void setCreateDateEnd(String createDateEnd) {
        this.createDateEnd = createDateEnd;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
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
