package com.capgemini.se_track;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(1,2));
        System.out.println(calc.add(2,4));

        System.out.println(calc.subtract(2,1));
        System.out.println(calc.subtract(4,2));

        System.out.println(calc.multiple(1,2));
        System.out.println(calc.multiple(2,4));

        System.out.println(calc.obscureFunction(1,2));
        System.out.println(calc.obscureFunction(2,4));

        waitForInput();
    }

    private static void waitForInput() {
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
