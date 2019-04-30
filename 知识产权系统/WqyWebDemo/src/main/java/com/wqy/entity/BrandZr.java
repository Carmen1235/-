package com.wqy.entity;

import java.util.Date;

public class BrandZr extends BrandZrKey {
    private Date zrslr;

    private String srr;

    private String dljg;

    private String zryy;

    private Date zrwcr;

    public Date getZrslr() {
        return zrslr;
    }

    public void setZrslr(Date zrslr) {
        this.zrslr = zrslr;
    }

    public String getSrr() {
        return srr;
    }

    public void setSrr(String srr) {
        this.srr = srr == null ? null : srr.trim();
    }

    public String getDljg() {
        return dljg;
    }

    public void setDljg(String dljg) {
        this.dljg = dljg == null ? null : dljg.trim();
    }

    public String getZryy() {
        return zryy;
    }

    public void setZryy(String zryy) {
        this.zryy = zryy == null ? null : zryy.trim();
    }

    public Date getZrwcr() {
        return zrwcr;
    }

    public void setZrwcr(Date zrwcr) {
        this.zrwcr = zrwcr;
    }
}