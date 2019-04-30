package com.wqy.model.brand;

import com.wqy.model.base.WebBaseBrandInfo;
import lombok.Data;

import java.io.Serializable;

/**
 * 商标使用信息
 */
@Data
public class WebBrandSyInfo extends WebBaseBrandInfo implements Serializable {
    private String id;
    private String pid;
    /**
     * 其他来源 BrandBaseInfo
     */
    private String sbsydw;
    private String spjfw;
    private String use_start_date;
    private String syzj;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getSbsydw() {
        return sbsydw;
    }

    public void setSbsydw(String sbsydw) {
        this.sbsydw = sbsydw;
    }

    public String getSpjfw() {
        return spjfw;
    }

    public void setSpjfw(String spjfw) {
        this.spjfw = spjfw;
    }

    public String getUse_start_date() {
        return use_start_date;
    }

    public void setUse_start_date(String use_start_date) {
        this.use_start_date = use_start_date;
    }

    public String getSyzj() {
        return syzj;
    }

    public void setSyzj(String syzj) {
        this.syzj = syzj;
    }
}
