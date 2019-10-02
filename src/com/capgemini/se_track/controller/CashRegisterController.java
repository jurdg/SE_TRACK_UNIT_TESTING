package com.capgemini.se_track.controller;

import com.capgemini.se_track.model.CashRegister;
import com.capgemini.se_track.model.Item;
import com.capgemini.se_track.view.CashRegisterView;

public class CashRegisterController {
    private CashRegisterView view;
    private CashRegister model;

    private static CashRegisterController instance = null;

    private CashRegisterController(){
        view = new CashRegisterView();
        model = new CashRegister();
    }

    public static CashRegisterController getInstance() {
        if (instance == null) {
            instance = new CashRegisterController();
        }
        return instance;
    }

    public static double calculateChange(double totalAmount, double customerAmount) {
        return customerAmount - totalAmount;
    }

    public static double checkout() {
        double totalAmount = 0;

        for (Item item : ShoppingCartController.getCart()) {
            totalAmount = totalAmount + item.getPrice();
        }

        return totalAmount;
    }
}
