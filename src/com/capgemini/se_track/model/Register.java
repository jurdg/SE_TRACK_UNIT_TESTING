package com.capgemini.se_track.model;

import java.math.BigDecimal;

public class Register {
    private BigDecimal totalPrice;
    private BigDecimal discount;
    private ShoppingCart shoppingCart;

    public Register(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void getTotalPrice() {
    }

    public void getDiscount() {
    }

    public void calculatePrice() {
    }

    public void calculateDiscount() {
    }

    public void pay(int money) {
    }
}
