package com.wqy.entity;

public class Wxuser {
    private String tId;

    private String tName;

    private String tTouser;

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId == null ? null : tId.trim();
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public String gettTouser() {
        return tTouser;
    }

    public void settTouser(String tTouser) {
        this.tTouser = tTouser == null ? null : tTouser.trim();
    }
}