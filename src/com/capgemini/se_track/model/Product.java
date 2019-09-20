package com.capgemini.se_track.model;

public abstract class Product {
    private ProductName name;
    private double price;

    public Product(ProductName name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name.toString();
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        Product product = (Product) o;
        return this.getName().equals(product.getName());
    }
}
