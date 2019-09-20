package com.capgemini.se_track.model;

public abstract class Product {

    private String name;
    private double priceInEuro;
    private int amount;

    public Product() {

    }

    public Product(String name, double priceInEuro, int amount) {
        this.name = name;
        this.priceInEuro = priceInEuro;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getPriceInEuro();

    public void setPriceInEuro(double priceInEuro) {
        this.priceInEuro = priceInEuro;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
