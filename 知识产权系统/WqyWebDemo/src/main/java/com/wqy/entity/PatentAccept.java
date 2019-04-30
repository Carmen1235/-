package com.wqy.entity;

import java.util.Date;

public class PatentAccept {
    private String id;

    private String pid;

    private String assignNumber;

    private String assignName;

    private String acceptName;

    private Date acceptDate;

    private Date acceptFinishDate;

    private String other;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getAssignNumber() {
        return assignNumber;
    }

    public void setAssignNumber(String assignNumber) {
        this.assignNumber = assignNumber == null ? null : assignNumber.trim();
    }

    public String getAssignName() {
        return assignName;
    }

    public void setAssignName(String assignName) {
        this.assignName = assignName == null ? null : assignName.trim();
    }

    public String getAcceptName() {
        return acceptName;
    }

    public void setAcceptName(String acceptName) {
        this.acceptName = acceptName == null ? null : acceptName.trim();
    }

    public Date getAcceptDate() {
        return acceptDate;
    }

    public void setAcceptDate(Date acceptDate) {
        this.acceptDate = acceptDate;
    }

    public Date getAcceptFinishDate() {
        return acceptFinishDate;
    }

    public void setAcceptFinishDate(Date acceptFinishDate) {
        this.acceptFinishDate = acceptFinishDate;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }
}