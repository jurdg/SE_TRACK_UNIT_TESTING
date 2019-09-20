package com.capgemini.se_track.model;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(Item item) {
        this.items.add(item);
    }

    public void removeItems(Item item) {
        this.items.removeIf(Item -> Item.equals(item));
    }
}
