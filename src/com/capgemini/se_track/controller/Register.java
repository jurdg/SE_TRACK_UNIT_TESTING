package com.capgemini.se_track.controller;

import com.capgemini.se_track.model.*;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class Register {
    private double priceAfterDiscount;
    private double totalPrice = 0;
    private double discount = 0;
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
            priceAfterDiscount = totalPrice - discount;
            System.out.println("Your total comes to €" + priceAfterDiscount);
        }
    }

    private void calculateTotalPrice() {
        for(Product p : shoppingCart.getContents())
            totalPrice += p.getPrice();
    }

    private void calculateDiscount() {
        ShoppingCart sortedCart = shoppingCart;
        sortedCart.getContents().sort(Comparator.comparing(Product::getName));
        getTypeAndCount(sortedCart);

    }

    //TODO: Fix
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
                    discount += new Soap().getPrice() * 0.31;
                break;
            case DIAPERS:
                for(int i = 0; i < count/4; i++)
                    discount += new Diapers().getPrice();
                break;
            case YOGURT:
                Date now = new Date();
                if (new SimpleDateFormat("EEEE").format(now).equals("woensdag")) {
                    for(int i = 0; i < count; i++)
                        discount += 1;
                }
                break;
        }
    }

    public void pay(double money) {
        if (priceAfterDiscount > money)
            System.out.println("Not enough money to pay!");
        else {
            double change = money - priceAfterDiscount;
            System.out.println("Your change is €" + change);
        }
    }

    public void printReceipt() {
        System.out.println("Receipt:");
        for(Product p : shoppingCart.getContents())
            System.out.printf("%s - €%.2f \n", p.getName(), p.getPrice());
        System.out.printf("Total amount: €%.2f \nTotal discount: €%.2f \nAmount to pay: €%.2f %n",
                totalPrice, discount, priceAfterDiscount);
    }
}
