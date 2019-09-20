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
        double totalPrice = this.product.getAmount() * this.product.getPriceInEuro();
        System.out.println("Total price of " + "'" + product.getName() + "': " + totalPrice);

        if (this.product.getAmount() >= amountRequired) {
            double discountedPrice = this.getAmount() * (this.product.getPriceInEuro() * discount);
            System.out.println("Total discount of " + "'" + product.getName() + "': " + (totalPrice - discountedPrice));

            return discountedPrice;
        } else {
            return totalPrice;
        }
    }
}
