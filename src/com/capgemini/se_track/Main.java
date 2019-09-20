package com.capgemini.se_track;

import com.capgemini.se_track.model.*;

public class Main {

    public static void main(String[] args) {
        Supermarket jumbo = new Supermarket(new ShoppingCart(), new CashRegister());

        jumbo.getShoppingCart().addProduct(Products.SOAP, 2);

        jumbo.getShoppingCart().addProduct(Products.DIAPERS, 4);

        jumbo.getShoppingCart().addProduct(Products.CEREAL, 3);

        jumbo.getShoppingCart().addProduct(Products.YOGHURT, 1);

        jumbo.getShoppingCart().addProduct(Products.CHINESE_VEGETABLES, 1);


        try {
            jumbo.getCashRegister().checkout(jumbo.getShoppingCart(), 25);
        } catch (InsufficientFundsException isfe) {
            isfe.printStackTrace();
            jumbo.getCashRegister().checkout(jumbo.getShoppingCart(), 50);
        }
    }
}
