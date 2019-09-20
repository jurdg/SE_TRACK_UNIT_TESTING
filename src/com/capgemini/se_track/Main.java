package com.capgemini.se_track;

import com.capgemini.se_track.model.*;

public class Main {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        CashRegister cashRegister = new CashRegister();
        Supermarket jumbo = new Supermarket(shoppingCart, cashRegister);

        Product soap = new SetAmountDiscountProductDecorator(new Soap(2), 31, 2);
        shoppingCart.addProduct(soap);

        Product diapers = new FreeProductsWhenAmountProductDecorator(new Diapers(4), 1, 4);
        shoppingCart.addProduct(diapers);

        System.out.println(soap.getPriceInEuro());
        System.out.println(diapers.getPriceInEuro());
    }
}
