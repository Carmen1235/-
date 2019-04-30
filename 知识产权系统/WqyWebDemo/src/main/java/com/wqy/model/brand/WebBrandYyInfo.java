package com.wqy.model.brand;

import com.wqy.model.base.WebBaseBrandInfo;
import lombok.Data;

import java.io.Serializable;

/**
 * 商标异议信息
 * @author wangqiuye
 */
@Data
public class WebBrandYyInfo extends WebBaseBrandInfo implements Serializable {
    private String id;
    private String pid;
    /**
     * 其他来源 BrandBaseInfo
     */
    /**
     * 异议方
     */
    private String yyf = "";
    /**
     * 被异议方
     */
    private String byyf = "";
    /**
     * 异议群组
     */
    private String yyqz = "";
    /**
     * 提异议日期
     */
    private String tyyrq = null;
    /**
     * 异议代理机构
     */
    private String yydljg = "";
    /**
     * 异议结果
     */
    private String yyjg = "";

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

    public String getYyf() {
        return yyf;
    }

    public void setYyf(String yyf) {
        this.yyf = yyf;
    }

    public String getByyf() {
        return byyf;
    }

    public void setByyf(String byyf) {
        this.byyf = byyf;
    }

    public String getYyqz() {
        return yyqz;
    }

    public void setYyqz(String yyqz) {
        this.yyqz = yyqz;
    }

    public String getTyyrq() {
        return tyyrq;
    }

    public void setTyyrq(String tyyrq) {
        this.tyyrq = tyyrq;
    }

    public String getYydljg() {
        return yydljg;
    }

    public void setYydljg(String yydljg) {
        this.yydljg = yydljg;
    }

    public String getYyjg() {
        return yyjg;
    }

    public void setYyjg(String yyjg) {
        this.yyjg = yyjg;
    }
}
