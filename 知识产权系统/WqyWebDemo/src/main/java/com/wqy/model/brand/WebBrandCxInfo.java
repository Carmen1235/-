package com.wqy.model.brand;

import com.wqy.model.base.WebBaseBrandInfo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;


/**
 * 商标撤销信息
 */
@Data
public class WebBrandCxInfo extends WebBaseBrandInfo implements Serializable {
    private String id;
    private String pid;
    /**
     * 其他来源 WebBaseBrandInfo
     */
    private String cxf = "";
    private String bcxf = "";
    private String cxqz = "";
    private String cxrq = null;
    private String cxdljg ="";
    private String cxjg = "";

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

    public String getCxf() {
        return cxf;
    }

    public void setCxf(String cxf) {
        this.cxf = cxf;
    }

    public String getBcxf() {
        return bcxf;
    }

    public void setBcxf(String bcxf) {
        this.bcxf = bcxf;
    }

    public String getCxqz() {
        return cxqz;
    }

    public void setCxqz(String cxqz) {
        this.cxqz = cxqz;
    }

    public String getCxrq() {
        return cxrq;
    }

    public void setCxrq(String cxrq) {
        this.cxrq = cxrq;
    }

    public String getCxdljg() {
        return cxdljg;
    }

    public void setCxdljg(String cxdljg) {
        this.cxdljg = cxdljg;
    }

    public String getCxjg() {
        return cxjg;
    }

    public void setCxjg(String cxjg) {
        this.cxjg = cxjg;
    }
}
