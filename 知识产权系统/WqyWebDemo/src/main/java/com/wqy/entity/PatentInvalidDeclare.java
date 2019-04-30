package com.wqy.entity;

public class PatentInvalidDeclare extends PatentInvalidDeclareKey {
    private String invalidOwer;

    private String invalidFiles;

    private String results;

    public String getInvalidOwer() {
        return invalidOwer;
    }

    public void setInvalidOwer(String invalidOwer) {
        this.invalidOwer = invalidOwer == null ? null : invalidOwer.trim();
    }

    public String getInvalidFiles() {
        return invalidFiles;
    }

    public void setInvalidFiles(String invalidFiles) {
        this.invalidFiles = invalidFiles == null ? null : invalidFiles.trim();
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results == null ? null : results.trim();
    }
}