package com.wqy.entity;

public class BrandXk extends BrandXkKey {
    private String bxkf;

    private String bxkqx;

    private String bxkspjfw;

    public String getBxkf() {
        return bxkf;
    }

    public void setBxkf(String bxkf) {
        this.bxkf = bxkf == null ? null : bxkf.trim();
    }

    public String getBxkqx() {
        return bxkqx;
    }

    public void setBxkqx(String bxkqx) {
        this.bxkqx = bxkqx == null ? null : bxkqx.trim();
    }

    public String getBxkspjfw() {
        return bxkspjfw;
    }

    public void setBxkspjfw(String bxkspjfw) {
        this.bxkspjfw = bxkspjfw == null ? null : bxkspjfw.trim();
    }
}