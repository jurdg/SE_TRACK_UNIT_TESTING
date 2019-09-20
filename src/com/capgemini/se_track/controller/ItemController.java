package com.capgemini.se_track.controller;

import com.capgemini.se_track.model.Item;

import java.util.ArrayList;

public class ItemController {


    public static ArrayList<Item> getItemsFromDatabase() {
        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(new Item("Soap", 3.00));
        itemList.add(new Item("Cereals", 2.50));
        return itemList;
    }
}
