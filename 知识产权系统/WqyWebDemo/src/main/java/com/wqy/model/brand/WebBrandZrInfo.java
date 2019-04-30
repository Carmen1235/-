package com.wqy.model.brand;

import com.wqy.model.base.WebBaseBrandInfo;
import lombok.Data;

import java.io.Serializable;

/**
 * 商标转让信息
 */
@Data
public class WebBrandZrInfo extends WebBaseBrandInfo implements Serializable {
    private String id;
    private String pid;
    /**
     * 其他来源 BrandBaseInfo
     */
    private String zrslr;
    private String srr;
    private String dljg;
    private String zryy;
    private String zrwcr;

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

    public String getZrslr() {
        return zrslr;
    }

    public void setZrslr(String zrslr) {
        this.zrslr = zrslr;
    }

    public String getSrr() {
        return srr;
    }

    public void setSrr(String srr) {
        this.srr = srr;
    }

    public String getDljg() {
        return dljg;
    }

    public void setDljg(String dljg) {
        this.dljg = dljg;
    }

    public String getZryy() {
        return zryy;
    }

    public void setZryy(String zryy) {
        this.zryy = zryy;
    }

    public String getZrwcr() {
        return zrwcr;
    }

    public void setZrwcr(String zrwcr) {
        this.zrwcr = zrwcr;
    }
}
