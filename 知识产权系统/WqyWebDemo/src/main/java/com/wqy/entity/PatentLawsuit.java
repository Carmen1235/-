package com.wqy.entity;

public class PatentLawsuit extends PatentLawsuitKey {
    private String suit;

    private String solicitor;

    private String lawyer;

    private String process;

    private String results;

    private String other;

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit == null ? null : suit.trim();
    }

    public String getSolicitor() {
        return solicitor;
    }

    public void setSolicitor(String solicitor) {
        this.solicitor = solicitor == null ? null : solicitor.trim();
    }

    public String getLawyer() {
        return lawyer;
    }

    public void setLawyer(String lawyer) {
        this.lawyer = lawyer == null ? null : lawyer.trim();
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process == null ? null : process.trim();
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results == null ? null : results.trim();
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }
}