package com.capgemini.se_track.model;

public class FreeProductsWhenAmountProductDecorator extends Product {

    private Product product;
    private int amountFree;
    private int amountRequired;

    public FreeProductsWhenAmountProductDecorator(Product product, int amountFree, int amountRequired) {
        super(product.getName(), product.getPriceInEuro(), product.getAmount());

        this.product = product;
        this.amountFree = amountFree;
        this.amountRequired = amountRequired;
    }

    @Override
    public double getPriceInEuro() {
        if (product.getAmount() == amountRequired) {
            return (this.product.getAmount() - amountFree) * product.getPriceInEuro();
        } else {
            return this.product.getAmount() * this.product.getPriceInEuro();
        }
    }
}
