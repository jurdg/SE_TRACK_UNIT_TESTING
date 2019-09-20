package com.capgemini.se_track;

import com.capgemini.se_track.controller.ShoppingCartController;
import com.capgemini.se_track.model.ShoppingCart;
import com.capgemini.se_track.view.CashRegisterView;
import com.capgemini.se_track.view.ShoppingCartView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while(true) {
            System.out.println("\nType '1' to add an item to your shopping cart. \n" +
                    "Type '2' to remove an item from your shopping cart. \n" +
                    "Type '3' to show your shopping cart. \n" +
                    "Type '4' to checkout.");

            Scanner scanner =  new Scanner(System.in);
            int userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    ShoppingCartView.showAddView();
                    break;
                case 2:
                    ShoppingCartView.showRemoveView();
                case 3:
                    ShoppingCartView.showShoppingCart();
                    break;
                case 4:
                    try {
                        CashRegisterView.showCheckoutView();
                        break;
                    } catch (NullPointerException npe) {
                        System.out.println("No items in your shopping cart!");
                        break;
                    }
            }
        }
    }
}
