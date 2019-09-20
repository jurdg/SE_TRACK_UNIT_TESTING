package com.capgemini.se_track.controller;

import com.capgemini.se_track.model.*;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class Register {
    private BigDecimal totalPrice = new BigDecimal("0");
    private BigDecimal discount = new BigDecimal("0");
    private ShoppingCart shoppingCart;

    public Register(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void calculatePrice() {
        if (shoppingCart.getContents().size() == 0)
            System.out.println("No products, free passage!");
        else {
            calculateTotalPrice();
            calculateDiscount();
            System.out.println("Price is : €" + totalPrice.subtract(discount));
        }
    }

    private void calculateTotalPrice() {
        for(Product p : shoppingCart.getContents())
            totalPrice = totalPrice.add(p.getPrice());
    }

    private void calculateDiscount() {
        ShoppingCart sortedCart = shoppingCart;
        sortedCart.getContents().sort(Comparator.comparing(Product::getName));
        getTypeAndCount(sortedCart);
    }

    private void getTypeAndCount(ShoppingCart cart) {
        String productName = cart.getContents().get(0).getName();
        int count = 1;
        for(int i = 1; i < cart.getContents().size(); i++) {
            if(cart.getContents().get(i).getName().equals(productName))
                count++;
            typeDiscount(count, productName);
            productName = cart.getContents().get(i).getName();
            count = 1;
        }
    }

    private void typeDiscount(int count, String productName) {
        switch (ProductName.valueOf(productName.toUpperCase())) {
            case SOAP:
                for(int i = 0; i < count/2; i++)
                    discount = discount.add(new Soap().getPrice().multiply(BigDecimal.valueOf(0.31)));
                break;
            case DIAPERS:
                for(int i = 0; i < count/4; i++)
                    discount = discount.add(new Diapers().getPrice());
                break;
            case YOGURT:
                Date now = new Date();
                if (new SimpleDateFormat("EEEE").format(now).equals("woensdag")) {
                    for(int i = 0; i < count; i++)
                        discount = discount.add(BigDecimal.valueOf(1));
                }
                break;
        }
    }

    public void pay(BigDecimal money) {
        if (totalPrice.doubleValue() > money.doubleValue())
            System.out.println("Not enough money to pay!");
        else {
            BigDecimal change = money.subtract(totalPrice);
            System.out.println("Your change is :€" + change);
        }
    }
}
