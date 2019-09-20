package com.capgemini.se_track;

import com.capgemini.se_track.model.Item;
import com.capgemini.se_track.model.ShoppingCart;
import com.capgemini.se_track.view.ShoppingCartView;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ShoppingCart shopping = new ShoppingCart();

        ShoppingCartView.showAddView();
        ShoppingCartView.showShoppingCart();

        ShoppingCartView.showShoppingCart();
        System.out.println(shopping.getItems());
    }
}
