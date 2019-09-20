package com.capgemini.se_track.model;

public class Soap extends Product {

    private static final double price = 3;

    public Soap(int amount) {
        super("Soap", price, amount);
    }

    @Override
    public double getPriceInEuro() {
        return price;
    }
}
