package com.capgemini.se_track;

import com.capgemini.se_track.models.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cart cart = new Cart();

        switch(waitForInput()) {
            case "c":
                CashRegister.checkout(cart);
                break;
        }
    }

    private static String waitForInput() {
        System.out.println("Enter 'c' to checkout");
        Scanner scanner = new Scanner(System.in);
        String returnValue = null;

        while(returnValue == null || returnValue.matches("")){
            try {
                returnValue = scanner.nextLine();
            } catch (Exception nfe) {
                System.out.println("That's not valid, please enter some text");
            }
        }

        return returnValue;
    }
}
