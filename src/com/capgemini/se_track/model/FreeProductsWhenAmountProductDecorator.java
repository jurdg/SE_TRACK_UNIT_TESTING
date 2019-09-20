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
        double totalPrice = this.product.getAmount() * this.product.getPriceInEuro();
        System.out.println("Total price of " + "'" + product.getName() + "': " + totalPrice);


        if (product.getAmount() == amountRequired) {
            double discountedPrice = (this.product.getAmount() - amountFree) * product.getPriceInEuro();
            System.out.println("Total discount of " + "'" + product.getName() + "': " + (totalPrice - discountedPrice));

            return discountedPrice;
        } else {
            return totalPrice;
        }
    }
}
