package com.capgemini.se_track.models;

import com.capgemini.se_track.enums.ContentUnit;

/**
 * Product class containing information about a specific product
 */
public class Product {
    private String name;
    private ProductBrand brand;
    private Category category;
    private double price;
    private Content contents;

    public Product () {}

    public Product(ProductBrand brand, Category category, double price, Content contents) {
        this.name = brand.getProductBrandName();
        this.category = category;
        this.price = price;
        this.contents = contents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductBrand getBrand() {
        return brand;
    }

    public void setBrand(ProductBrand brand) {
        this.brand = brand;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Content getContents() {
        return contents;
    }

    public void setContents (Content contents) {
        this.contents = contents;
    }
}
