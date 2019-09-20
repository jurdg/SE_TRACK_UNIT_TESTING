package com.capgemini.se_track.model;

public class Cereal extends Product {

    private static final double price = 2.50;

    public Cereal(int amount) {
        super("Cereal", price, amount);
    }

    @Override
    public double getPriceInEuro() {
        return price;
    }
}
