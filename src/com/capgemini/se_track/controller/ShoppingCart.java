package com.capgemini.se_track.controller;

import com.capgemini.se_track.model.Product;

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
        if(contents.contains(product)) {
            boolean hasDeleted = false;
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
        else System.out.println("This product is not in your shopping cart!");
    }

    public List<Product> getContents() {
        return contents;
    }
}
