package com.capgemini.se_track.model;

public class ChineseVegetables extends Product {

    private static final double price = 5;

    public ChineseVegetables(int amount) {
        super("Chinese vegetables", price, amount);
    }

    @Override
    public double getPriceInEuro() {
        return price;
    }
}
