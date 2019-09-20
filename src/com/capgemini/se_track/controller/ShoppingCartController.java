package com.capgemini.se_track.controller;

import com.capgemini.se_track.model.Item;
import com.capgemini.se_track.model.ShoppingCart;
import com.capgemini.se_track.view.ShoppingCartView;

import java.util.ArrayList;

public class ShoppingCartController {
    private static ShoppingCart model;
    private ShoppingCartView view;

    private static ShoppingCartController instance = null;

    private ShoppingCartController(){
        view = new ShoppingCartView();
        model = new ShoppingCart();
    }

    public static ShoppingCartController getInstance() {
        if (instance == null) {
            instance = new ShoppingCartController();
        }
        return instance;
    }

    public static void addItem(Item item) {
        model.setItems(item);
    }

    public static ArrayList<Item> getCart() {
        return model.getItems();
    }

//    public static removeItem(Item item) {
//
//    }
}
