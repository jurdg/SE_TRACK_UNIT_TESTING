package com.capgemini.se_track.model;

public class CashRegister {

    private int id;

    public double checkout(ShoppingCart shoppingCart, double moneyInEuro) {
        System.out.println("\nBegin checkout: \n");
        double totalPrice = 0;

        for (Product product : shoppingCart.getProducts()) {
            double productPrice = product.getPriceInEuro();

            System.out.println("-> " + product.getName() + " (" + product.getAmount() + "x) " + ": €" + productPrice + "\n");
            totalPrice += productPrice;
        }

        if (totalPrice > moneyInEuro) {
            throw new InsufficientFundsException(moneyInEuro, totalPrice);
        } else {
            System.out.println("Total price: €" + totalPrice);
            System.out.println("You have payed: €" + moneyInEuro);
            System.out.println("Your change: €" + (moneyInEuro - totalPrice));
        }

        return totalPrice;
    }
}
