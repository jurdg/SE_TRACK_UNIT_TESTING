package com.capgemini.se_track.model;

public class SetAmountDiscountProductDecorator extends Product {

    private Product product;
    private double discount;
    private int amountRequired;

    public SetAmountDiscountProductDecorator(Product product, double discountPercentage, int amountRequired) {
        super(product.getName(), product.getPriceInEuro(), product.getAmount());

        this.product = product;
        this.discount = (1 - (discountPercentage / 100));
        this.amountRequired = amountRequired;
    }

    @Override
    public double getPriceInEuro() {
        if (this.product.getAmount() >= amountRequired) {
            return this.getAmount() * (this.product.getPriceInEuro() * discount);
        } else {
            return this.product.getAmount() * this.product.getPriceInEuro();
        }
    }
}
