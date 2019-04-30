package com.wqy.entity;

import java.util.Date;

public class BrandYy extends BrandYyKey {
    private String yyf;

    private String byyf;

    private String yyqz;

    private Date tyyrq;

    private String yydljg;

    private String yyjg;

    public String getYyf() {
        return yyf;
    }

    public void setYyf(String yyf) {
        this.yyf = yyf == null ? null : yyf.trim();
    }

    public String getByyf() {
        return byyf;
    }

    public void setByyf(String byyf) {
        this.byyf = byyf == null ? null : byyf.trim();
    }

    public String getYyqz() {
        return yyqz;
    }

    public void setYyqz(String yyqz) {
        this.yyqz = yyqz == null ? null : yyqz.trim();
    }

    public Date getTyyrq() {
        return tyyrq;
    }

    public void setTyyrq(Date tyyrq) {
        this.tyyrq = tyyrq;
    }

    public String getYydljg() {
        return yydljg;
    }

    public void setYydljg(String yydljg) {
        this.yydljg = yydljg == null ? null : yydljg.trim();
    }

    public String getYyjg() {
        return yyjg;
    }

    public void setYyjg(String yyjg) {
        this.yyjg = yyjg == null ? null : yyjg.trim();
    }
}