package com.capgemini.se_track.models;

import com.capgemini.se_track.enums.ContentUnit;

public class Content {
    private ContentUnit unit;
    private float contentAmount;

    public Content(float contentAmount, ContentUnit unit) {
        this.contentAmount = contentAmount;
        this.unit = unit;
    }

    public ContentUnit getUnit() {
        return unit;
    }

    public void setUnit(ContentUnit unit) {
        this.unit = unit;
    }

    public float getContentAmount() {
        return contentAmount;
    }

    public void setContentAmount(float contentAmount) {
        this.contentAmount = contentAmount;
    }
}
