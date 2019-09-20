package com.capgemini.se_track.controller;

import com.capgemini.se_track.model.Item;

import java.util.ArrayList;

public class ItemController {

    public static ArrayList<Item> getItemsFromDatabase() {
        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(new Item("Soap", 3.00));
        itemList.add(new Item("Cereals", 2.50));
        itemList.add(new Item("Chinese vegetables", 5.00));
        itemList.add(new Item("Yogurt", 2.00));
        itemList.add(new Item("Diapers", 10.00));
        return itemList;
    }
}
