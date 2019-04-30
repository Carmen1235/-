package com.wqy.entity;

public class Wxinfo {
    private String tId;

    private String tAppid;

    private String tAppsecret;

    private String tAccessToken;

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId == null ? null : tId.trim();
    }

    public String gettAppid() {
        return tAppid;
    }

    public void settAppid(String tAppid) {
        this.tAppid = tAppid == null ? null : tAppid.trim();
    }

    public String gettAppsecret() {
        return tAppsecret;
    }

    public void settAppsecret(String tAppsecret) {
        this.tAppsecret = tAppsecret == null ? null : tAppsecret.trim();
    }

    public String gettAccessToken() {
        return tAccessToken;
    }

    public void settAccessToken(String tAccessToken) {
        this.tAccessToken = tAccessToken == null ? null : tAccessToken.trim();
    }
}