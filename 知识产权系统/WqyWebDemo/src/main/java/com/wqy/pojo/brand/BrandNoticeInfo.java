package com.wqy.pojo.brand;

import com.wqy.pojo.base.BrandBaseInfo;
import lombok.Data;

import java.util.Date;

/**
 * 商标提醒
 * @author wangqiuye
 */
@Data
public class BrandNoticeInfo extends BrandBaseInfo {
    private String pid;
    private String id;
    /**
     * 其他来源 BrandBaseInfo
     */
    private Date txrq;
    private Date yxrq;
    private Date xzrq;
    private Date xztxrq;
    private Date gwcljxtxrq;
    private String enables;
    private Date jxrq1;
    private Date jxrq2;
    private Date jxrq3;
    private Date jxrq4;
    private Date jxrq5;
    private Date jxrq6;
    private Date jxrq7;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTxrq() {
        return txrq;
    }

    public void setTxrq(Date txrq) {
        this.txrq = txrq;
    }

    public Date getYxrq() {
        return yxrq;
    }

    public void setYxrq(Date yxrq) {
        this.yxrq = yxrq;
    }

    public Date getXzrq() {
        return xzrq;
    }

    public void setXzrq(Date xzrq) {
        this.xzrq = xzrq;
    }

    public Date getXztxrq() {
        return xztxrq;
    }

    public void setXztxrq(Date xztxrq) {
        this.xztxrq = xztxrq;
    }

    public Date getGwcljxtxrq() {
        return gwcljxtxrq;
    }

    public void setGwcljxtxrq(Date gwcljxtxrq) {
        this.gwcljxtxrq = gwcljxtxrq;
    }

    public String getEnables() {
        return enables;
    }

    public void setEnables(String enables) {
        this.enables = enables;
    }

    public Date getJxrq1() {
        return jxrq1;
    }

    public void setJxrq1(Date jxrq1) {
        this.jxrq1 = jxrq1;
    }

    public Date getJxrq2() {
        return jxrq2;
    }

    public void setJxrq2(Date jxrq2) {
        this.jxrq2 = jxrq2;
    }

    public Date getJxrq3() {
        return jxrq3;
    }

    public void setJxrq3(Date jxrq3) {
        this.jxrq3 = jxrq3;
    }

    public Date getJxrq4() {
        return jxrq4;
    }

    public void setJxrq4(Date jxrq4) {
        this.jxrq4 = jxrq4;
    }

    public Date getJxrq5() {
        return jxrq5;
    }

    public void setJxrq5(Date jxrq5) {
        this.jxrq5 = jxrq5;
    }

    public Date getJxrq6() {
        return jxrq6;
    }

    public void setJxrq6(Date jxrq6) {
        this.jxrq6 = jxrq6;
    }

    public Date getJxrq7() {
        return jxrq7;
    }

    public void setJxrq7(Date jxrq7) {
        this.jxrq7 = jxrq7;
    }
}
