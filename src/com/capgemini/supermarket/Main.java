package com.capgemini.supermarket;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();

        Inventory item = new Inventory();

        //adds items to the shopping cart
        shoppingCart.addItem(item.cereals);
        shoppingCart.addItem(item.diapers);

        //prints the contents of the shopping cart
        System.out.println(shoppingCart.cart);

        //diapers are removed from cart
        shoppingCart.removeItem(item.diapers);

        //prints the contents of the shopping cart
        System.out.println(shoppingCart.cart);

        System.out.println("Ik kreeg het niet geregeld om de prijs van alle items uit de array te halen en de kosten te berekenen..");


    }
}
