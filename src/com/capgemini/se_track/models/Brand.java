package com.capgemini.se_track.models;

public abstract class Brand {
    private String brandName;

    public Brand (String newBrandName) {
        this.setBrandName(newBrandName);
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName (String brandName) {
        if (brandName == null) throw new IllegalArgumentException();
        this.brandName = brandName;
    }
}
