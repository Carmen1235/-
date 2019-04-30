package com.wqy.model.brand;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.wqy.model.base.WebBaseBrandInfo;
import lombok.Data;

import java.io.Serializable;

/**
 * 前端商标诉讼信息
 * @author wangqiuye
 */
@Data
public class WebBrandSsInfo extends WebBaseBrandInfo implements Serializable {
    private String id;
    private String pid;
    /**
     * 其他来源 WebBaseBrandInfo
     */
    @Excel(name ="诉讼类型" )
    private String sslx="";
    @Excel(name ="审级" )
    private String sj="";
    @Excel(name ="原告" )
    private String yg="";
    @Excel(name ="被告" )
    private String bg="";
    @Excel(name ="案由" )
    private String ay="";
    @Excel(name ="诉讼请求" )
    private String ssqq="";
    @Excel(name ="案件结果" )
    private String ajjg="";
    @Excel(name ="裁判日期" )
    private String cprq= null;
    @Excel(name ="一审法院" )
    private String ysfy="";
    @Excel(name ="律师" )
    private String ls="";
    @Excel(name ="律师事务所" )
    private String lssws="";
    @Excel(name ="第三人" )
    private String dsr="";
    @Excel(name ="上诉信息" )
    private String ssxx="";
    @Excel(name ="申请单位" )
    private String applyUnit="";
    @Excel(name ="使用单位" )
    private String useUnit="";
    @Excel(name ="涉案商标" )
    private String sasb="";
    @Excel(name ="备注" )
    private String bz="";

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

    public String getSslx() {
        return sslx;
    }

    public void setSslx(String sslx) {
        this.sslx = sslx;
    }

    public String getSj() {
        return sj;
    }

    public void setSj(String sj) {
        this.sj = sj;
    }

    public String getYg() {
        return yg;
    }

    public void setYg(String yg) {
        this.yg = yg;
    }

    public String getBg() {
        return bg;
    }

    public void setBg(String bg) {
        this.bg = bg;
    }

    public String getAy() {
        return ay;
    }

    public void setAy(String ay) {
        this.ay = ay;
    }

    public String getSsqq() {
        return ssqq;
    }

    public void setSsqq(String ssqq) {
        this.ssqq = ssqq;
    }

    public String getAjjg() {
        return ajjg;
    }

    public void setAjjg(String ajjg) {
        this.ajjg = ajjg;
    }

    public String getCprq() {
        return cprq;
    }

    public void setCprq(String cprq) {
        this.cprq = cprq;
    }

    public String getYsfy() {
        return ysfy;
    }

    public void setYsfy(String ysfy) {
        this.ysfy = ysfy;
    }

    public String getLs() {
        return ls;
    }

    public void setLs(String ls) {
        this.ls = ls;
    }

    public String getLssws() {
        return lssws;
    }

    public void setLssws(String lssws) {
        this.lssws = lssws;
    }

    public String getDsr() {
        return dsr;
    }

    public void setDsr(String dsr) {
        this.dsr = dsr;
    }

    public String getSsxx() {
        return ssxx;
    }

    public void setSsxx(String ssxx) {
        this.ssxx = ssxx;
    }

    public String getApplyUnit() {
        return applyUnit;
    }

    public void setApplyUnit(String applyUnit) {
        this.applyUnit = applyUnit;
    }

    public String getUseUnit() {
        return useUnit;
    }

    public void setUseUnit(String useUnit) {
        this.useUnit = useUnit;
    }

    public String getSasb() {
        return sasb;
    }

    public void setSasb(String sasb) {
        this.sasb = sasb;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }
}
