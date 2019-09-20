package com.capgemini.se_track.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> products;
    private final ProductFactory productFactory = ProductFactory.getInstance();

    public ShoppingCart() {
        System.out.println("Created a new shopping cart\n");
        this.products = new ArrayList<>();
    }

    public void addProduct(Products products, int amount) {
        this.products.add(this.productFactory.getProduct(products, amount));
        System.out.println("Add " + products.name().toLowerCase().toLowerCase() + " (" + amount + "x) to the shopping cart");
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}
