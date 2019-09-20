package com.capgemini.se_track.models;

import java.util.ArrayList;

/**
 * The CashRegister class manages all orders
 */
public class CashRegister {
    ArrayList<Cart> orders;

    public CashRegister() {}

    public static void checkout (Cart cart) {
        double totalPrice = calculateTotalPrice(cart);
        double totalDiscount = calculateTotalDiscount(cart);

    }

    public void showTotalPrice (Cart cart) {
        System.out.println("The total cost of the shopping cart is €" + calculateTotalPrice(cart));
    }

    public void showTotalDiscount (Cart cart) {
        System.out.println("The total discount of the shopping cart is €" + calculateTotalDiscount(cart));
    }

    private static double calculateTotalPrice (Cart cart) {
        int totalPrice = 0;
        for (CartLine cartLine : cart.getCartLines()) {
            double cartLineCost = cartLine.getCartLineCost() * 100; // Convert to integer for currency accuracy
            totalPrice += cartLineCost;
        }
        return (double)totalPrice / 100;
    }

    private static double calculateTotalDiscount (Cart cart) {
        int totalDiscount = 0;
        // TODO Get discount amount from all cartlines from cart
        return (double)totalDiscount / 100;
    }
}
