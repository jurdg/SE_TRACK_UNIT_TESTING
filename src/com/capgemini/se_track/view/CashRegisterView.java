package com.capgemini.se_track.view;

import com.capgemini.se_track.controller.CashRegisterController;

import java.util.Scanner;

public class CashRegisterView {
    public static void showCheckoutView() {
        System.out.println(String.format("The total amount in your shopping cart is %s", CashRegisterController.checkout()));
        System.out.println("With how much money would you like to pay this amount?");

        Scanner scanner = new Scanner(System.in);
        double userInput = scanner.nextDouble();

        if (userInput < CashRegisterController.checkout()) {
            System.out.println("Your due amount is higher!");
        } else {
            double change = CashRegisterController.calculateChange(CashRegisterController.checkout(), userInput);
            System.out.println(String.format("Your total change is %s.", change));
        }
    }
}
