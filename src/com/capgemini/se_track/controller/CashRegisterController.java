package com.capgemini.se_track.controller;

import com.capgemini.se_track.enums.ItemEnum;
import com.capgemini.se_track.view.CashRegisterView;

import java.util.ArrayList;

public class CashRegisterController {
    private CashRegisterView view;

    private static CashRegisterController instance = null;

    private CashRegisterController(){
        view = new CashRegisterView();
    }

    public static CashRegisterController getInstance() {
        if (instance == null) {
            instance = new CashRegisterController();
        }
        return instance;
    }

//    public static calculateChange(ArrayList<ItemEnum> items) {
//
//    }
//
//    public static calculateDiscount(ArrayList<ItemEnum> items) {
//
//    }
//
//    public static checkout(ArrayList<ItemEnum> items) {
//
//    }
}
