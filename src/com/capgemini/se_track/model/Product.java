package com.capgemini.se_track.model;

import java.math.BigDecimal;

public abstract class Product {
    private ProductName name;
    private BigDecimal price;

    public Product(ProductName name, double price) {
        this.name = name;
        this.price = BigDecimal.valueOf(price);
    }

    public String getName() {
        return name.toString();
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        Product product = (Product) o;
        return this.getName().equals(product.getName());
    }
}
