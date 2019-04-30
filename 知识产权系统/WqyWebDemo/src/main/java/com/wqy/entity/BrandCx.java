package com.wqy.entity;

import java.util.Date;

public class BrandCx extends BrandCxKey {
    private String cxf;

    private String bcxf;

    private String cxqz;

    private Date cxrq;

    private String cxdljg;

    private String cxjg;

    public String getCxf() {
        return cxf;
    }

    public void setCxf(String cxf) {
        this.cxf = cxf == null ? null : cxf.trim();
    }

    public String getBcxf() {
        return bcxf;
    }

    public void setBcxf(String bcxf) {
        this.bcxf = bcxf == null ? null : bcxf.trim();
    }

    public String getCxqz() {
        return cxqz;
    }

    public void setCxqz(String cxqz) {
        this.cxqz = cxqz == null ? null : cxqz.trim();
    }

    public Date getCxrq() {
        return cxrq;
    }

    public void setCxrq(Date cxrq) {
        this.cxrq = cxrq;
    }

    public String getCxdljg() {
        return cxdljg;
    }

    public void setCxdljg(String cxdljg) {
        this.cxdljg = cxdljg == null ? null : cxdljg.trim();
    }

    public String getCxjg() {
        return cxjg;
    }

    public void setCxjg(String cxjg) {
        this.cxjg = cxjg == null ? null : cxjg.trim();
    }
}