package com.capgemini.se_track.model;

import java.time.LocalDateTime;

public class DiscountOnDayOfWeekProductDecorator extends Product {

    private Product product;
    private int dayOfWeekRequired;
    private double discountInEuro;

    public DiscountOnDayOfWeekProductDecorator(Product product, int dayOfWeekRequired, double discountInEuro) {
        super(product.getName(), product.getPriceInEuro(), product.getAmount());

        this.product = product;
        this.dayOfWeekRequired = dayOfWeekRequired;
        this.discountInEuro = discountInEuro;
    }

    @Override
    public double getPriceInEuro() {
        int currentDayOfWeek = LocalDateTime.now().getDayOfWeek().getValue();
        double totalPrice = this.product.getAmount() * this.product.getPriceInEuro();
        System.out.println("Total price of " + "'" + product.getName() + "': " + totalPrice);

        if (currentDayOfWeek == dayOfWeekRequired) {
            double discountedPrice = product.getAmount() * (product.getPriceInEuro() - discountInEuro);
            System.out.println("Total discount of " + "'" + product.getName() + "': " + (totalPrice - discountedPrice));

            return discountedPrice;
        } else {
            return totalPrice;
        }
    }
}
