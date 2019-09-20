package com.capgemini.se_track.model;

public class Yoghurt extends Product {

    private static final double price = 2;

    public Yoghurt(int amount) {
        super("Yoghurt", price, amount);
    }

    @Override
    public double getPriceInEuro() {
        return price;
    }
}
