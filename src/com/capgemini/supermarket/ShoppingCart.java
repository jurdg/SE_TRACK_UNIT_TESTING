package com.capgemini.supermarket;

import java.util.ArrayList;

public class ShoppingCart {

    ArrayList<Product> cart = new ArrayList<Product>();

    public void addItem(Product product) {
        cart.add(product);
    }

    public void removeItem(Product product) {
        cart.remove(product);
    }

    public ArrayList<Product> getCart() {
        return cart;
    }
}
