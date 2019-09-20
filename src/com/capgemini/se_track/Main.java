package com.capgemini.se_track;

import com.capgemini.se_track.model.CashRegister;
import com.capgemini.se_track.model.Products;
import com.capgemini.se_track.model.ShoppingCart;
import com.capgemini.se_track.model.Supermarket;

public class Main {

    public static void main(String[] args) {
        Supermarket jumbo = new Supermarket(new ShoppingCart(), new CashRegister());

        jumbo.getShoppingCart().addProduct(Products.SOAP, 2);

        jumbo.getShoppingCart().addProduct(Products.DIAPERS, 4);

        jumbo.getShoppingCart().addProduct(Products.CEREAL, 3);

        jumbo.getShoppingCart().addProduct(Products.YOGHURT, 1);

        jumbo.getShoppingCart().addProduct(Products.CHINESE_VEGETABLES, 1);

        System.out.println("Total price: " + jumbo.getCashRegister().getTotalPrice(jumbo.getShoppingCart()));
    }
}
