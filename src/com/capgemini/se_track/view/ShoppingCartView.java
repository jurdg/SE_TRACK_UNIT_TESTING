package com.capgemini.se_track.view;

import com.capgemini.se_track.controller.ItemController;
import com.capgemini.se_track.controller.ShoppingCartController;
import com.capgemini.se_track.enums.ItemEnum;
import com.capgemini.se_track.model.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCartView {
    public static void showAddView() {
        System.out.println("Which item would you like to add to your Shopping Cart?");
        ArrayList<Item> itemList = ItemController.getItemsFromDatabase();

        for (Item item : ItemController.getItemsFromDatabase()) {
            System.out.println(String.format("%s %s", item.getName(), Double.toString(item.getPrice())));
        }

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        for (Item item : itemList) {
            if (item.getName().equals(userInput)) {
                ShoppingCartController.getInstance().addItem(item);

                System.out.println(String.format("Added %s to your shopping cart!", item.getName()));
            }
        }
    }

    public static void showRemoveView() {
        System.out.println("Which item would you like to remove from your Shopping Cart?");
        showShoppingCart();

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        for (Item item : ShoppingCartController.getInstance().getCart()) {
            if (item.getName().equals(userInput)) {
                ShoppingCartController.getInstance().removeItem(item);

                System.out.println(String.format("Removed %s from your shopping cart!", item.getName()));
            }
        }
    }

    public static void showShoppingCart() {
        for (Item item : ShoppingCartController.getInstance().getCart()) {
            System.out.println(item.getName());
        }
    }
}
