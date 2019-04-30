package com.wqy.entity;

import java.util.Date;
/**
 * @author 王秋叶
 * @create 2018-08-30 13:52
 * @desc 信访信息实体
 **/
public class Idea {
    private String tId;

    private String tWxid;

    private String tUsername;

    private String tDepartment;

    private String tUserid;

    private Long tTelphone;

    private Date tCreatedate;

    private String tNickname;

    private String tSort;

    private String tEx1;

    private String tEx2;

    private String tEx3;

    private String tQuestion;

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId == null ? null : tId.trim();
    }

    public String gettWxid() {
        return tWxid;
    }

    public void settWxid(String tWxid) {
        this.tWxid = tWxid == null ? null : tWxid.trim();
    }

    public String gettUsername() {
        return tUsername;
    }

    public void settUsername(String tUsername) {
        this.tUsername = tUsername == null ? null : tUsername.trim();
    }

    public String gettDepartment() {
        return tDepartment;
    }

    public void settDepartment(String tDepartment) {
        this.tDepartment = tDepartment == null ? null : tDepartment.trim();
    }

    public String gettUserid() {
        return tUserid;
    }

    public void settUserid(String tUserid) {
        this.tUserid = tUserid == null ? null : tUserid.trim();
    }

    public Long gettTelphone() {
        return tTelphone;
    }

    public void settTelphone(Long tTelphone) {
        this.tTelphone = tTelphone;
    }

    public Date gettCreatedate() {
        return tCreatedate;
    }

    public void settCreatedate(Date tCreatedate) {
        this.tCreatedate = tCreatedate;
    }

    public String gettNickname() {
        return tNickname;
    }

    public void settNickname(String tNickname) {
        this.tNickname = tNickname == null ? null : tNickname.trim();
    }

    public String gettSort() {
        return tSort;
    }

    public void settSort(String tSort) {
        this.tSort = tSort == null ? null : tSort.trim();
    }

    public String gettEx1() {
        return tEx1;
    }

    public void settEx1(String tEx1) {
        this.tEx1 = tEx1 == null ? null : tEx1.trim();
    }

    public String gettEx2() {
        return tEx2;
    }

    public void settEx2(String tEx2) {
        this.tEx2 = tEx2 == null ? null : tEx2.trim();
    }

    public String gettEx3() {
        return tEx3;
    }

    public void settEx3(String tEx3) {
        this.tEx3 = tEx3 == null ? null : tEx3.trim();
    }

    public String gettQuestion() {
        return tQuestion;
    }

    public void settQuestion(String tQuestion) {
        this.tQuestion = tQuestion == null ? null : tQuestion.trim();
    }
}