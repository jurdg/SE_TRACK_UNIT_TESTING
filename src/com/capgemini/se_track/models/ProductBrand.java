package com.capgemini.se_track.models;

public class ProductBrand extends Brand {
    private String brandType;

    public ProductBrand(String newBrandName, String brandType) {
        super(newBrandName);
        this.brandType = brandType;
    }

    public String getProductBrandName () {
        return super.getBrandName() + brandType;
    }
}
