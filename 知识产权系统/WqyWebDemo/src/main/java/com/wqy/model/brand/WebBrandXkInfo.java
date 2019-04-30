package com.wqy.model.brand;

import com.wqy.model.base.WebBaseBrandInfo;
import lombok.Data;

import java.io.Serializable;

/**
 * 商标许可信息
 */
@Data
public class WebBrandXkInfo extends WebBaseBrandInfo implements Serializable {
    private String id;
    private String pid;
    /**
     * 其他来源 BrandBaseInfo
     */
    private String bxkf;
    private String bxkqx;
    private String bxkspjfw;

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

    public String getBxkf() {
        return bxkf;
    }

    public void setBxkf(String bxkf) {
        this.bxkf = bxkf;
    }

    public String getBxkqx() {
        return bxkqx;
    }

    public void setBxkqx(String bxkqx) {
        this.bxkqx = bxkqx;
    }

    public String getBxkspjfw() {
        return bxkspjfw;
    }

    public void setBxkspjfw(String bxkspjfw) {
        this.bxkspjfw = bxkspjfw;
    }
}
