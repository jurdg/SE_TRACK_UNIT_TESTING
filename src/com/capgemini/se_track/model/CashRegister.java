package com.capgemini.se_track.model;

public class CashRegister {

    private int id;

    public double getTotalPrice(ShoppingCart shoppingCart) {
        System.out.println("\nBegin checkout: \n");
        double totalPrice = 0;

        for (Product product : shoppingCart.getProducts()) {
            double productPrice = product.getPriceInEuro();

            System.out.println("-> " + product.getName() + " (" + product.getAmount() + "x) " + ": €" + productPrice);
            totalPrice += productPrice;
        }

        return totalPrice;
    }
}
