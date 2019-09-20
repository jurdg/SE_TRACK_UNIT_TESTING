package com.capgemini.se_track;

import com.capgemini.se_track.model.ShoppingCart;
import com.capgemini.se_track.view.ShoppingCartView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while(true) {
            System.out.println("\n Type '1' to add an item to your shopping cart. \n" +
                    "Type '2' to remove an item from your shopping cart. \n" +
                    "Type '3' to show your shopping cart.");

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
            }
        }
    }
}
