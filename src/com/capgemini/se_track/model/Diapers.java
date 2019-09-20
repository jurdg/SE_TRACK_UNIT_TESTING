package com.capgemini.se_track.model;

public class Diapers extends Product {

    private static final double price = 10;

    public Diapers(int amount) {
        super("Diapers", price, amount);
    }

    @Override
    public double getPriceInEuro() {
        return price;
    }
}
