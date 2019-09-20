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

        if (currentDayOfWeek == dayOfWeekRequired) {
            return product.getAmount() * (product.getPriceInEuro() - discountInEuro);
        } else {
            return product.getAmount() * product.getPriceInEuro();
        }
    }
}
