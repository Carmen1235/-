package com.wqy.entity;

import java.util.Date;

public class PatentRenewals {
    private String id;

    private String technicalclf;

    private String patentname;

    private String image;

    private String patenttype;

    private String protectedareas;

    private String applytype;

    private Date applydate;

    private String applyname;

    private String applynumber;

    private String state;

    private Date accreditdate;

    private String patentnumber;

    private String agency;

    private String annualfee;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTechnicalclf() {
        return technicalclf;
    }

    public void setTechnicalclf(String technicalclf) {
        this.technicalclf = technicalclf == null ? null : technicalclf.trim();
    }

    public String getPatentname() {
        return patentname;
    }

    public void setPatentname(String patentname) {
        this.patentname = patentname == null ? null : patentname.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getPatenttype() {
        return patenttype;
    }

    public void setPatenttype(String patenttype) {
        this.patenttype = patenttype == null ? null : patenttype.trim();
    }

    public String getProtectedareas() {
        return protectedareas;
    }

    public void setProtectedareas(String protectedareas) {
        this.protectedareas = protectedareas == null ? null : protectedareas.trim();
    }

    public String getApplytype() {
        return applytype;
    }

    public void setApplytype(String applytype) {
        this.applytype = applytype == null ? null : applytype.trim();
    }

    public Date getApplydate() {
        return applydate;
    }

    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }

    public String getApplyname() {
        return applyname;
    }

    public void setApplyname(String applyname) {
        this.applyname = applyname == null ? null : applyname.trim();
    }

    public String getApplynumber() {
        return applynumber;
    }

    public void setApplynumber(String applynumber) {
        this.applynumber = applynumber == null ? null : applynumber.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getAccreditdate() {
        return accreditdate;
    }

    public void setAccreditdate(Date accreditdate) {
        this.accreditdate = accreditdate;
    }

    public String getPatentnumber() {
        return patentnumber;
    }

    public void setPatentnumber(String patentnumber) {
        this.patentnumber = patentnumber == null ? null : patentnumber.trim();
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency == null ? null : agency.trim();
    }

    public String getAnnualfee() {
        return annualfee;
    }

    public void setAnnualfee(String annualfee) {
        this.annualfee = annualfee == null ? null : annualfee.trim();
    }
}