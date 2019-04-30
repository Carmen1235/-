package com.wqy.entity;

import java.util.Date;

public class BrandSy extends BrandSyKey {
    private String sbsydw;

    private String spjfw;

    private Date useStartDate;

    private String syzj;

    public String getSbsydw() {
        return sbsydw;
    }

    public void setSbsydw(String sbsydw) {
        this.sbsydw = sbsydw == null ? null : sbsydw.trim();
    }

    public String getSpjfw() {
        return spjfw;
    }

    public void setSpjfw(String spjfw) {
        this.spjfw = spjfw == null ? null : spjfw.trim();
    }

    public Date getUseStartDate() {
        return useStartDate;
    }

    public void setUseStartDate(Date useStartDate) {
        this.useStartDate = useStartDate;
    }

    public String getSyzj() {
        return syzj;
    }

    public void setSyzj(String syzj) {
        this.syzj = syzj == null ? null : syzj.trim();
    }
}