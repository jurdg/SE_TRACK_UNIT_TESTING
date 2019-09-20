package com.capgemini.se_track.enums;

public enum ContentUnit {
    ML("mL"),
    CL("cL"),
    L("L"),
    MG("mg"),
    G("g"),
    KG("kg");

    private String contentUnit;

    public String getContentUnit() {
        return contentUnit;
    }

    ContentUnit (String s) {
        this.contentUnit = s;
    }
}
