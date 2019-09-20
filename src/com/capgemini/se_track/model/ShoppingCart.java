package com.capgemini.se_track.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart {
    private List<Product> contents;

    public ShoppingCart() {
        contents = new ArrayList<>();
    }

    public void addToCart(Product product) {
        contents.add(product);
    }

    public void removeFromCart(Product product) {
        boolean hasDeleted = false;
        if(contents.contains(product)) {
            Iterator<Product> iterator = contents.iterator();
            while(!hasDeleted) {
                while (iterator.hasNext()){
                    Product next = iterator.next();
                    if(next.equals(product)) {
                        contents.remove(next);
                        hasDeleted = !hasDeleted;
                    }
                }
            }
        }
    }
}
