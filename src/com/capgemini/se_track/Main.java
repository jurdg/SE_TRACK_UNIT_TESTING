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
        System.out.println(calc.obscureFunction(0,2));
        // System.out.println(calc.obscureFunction(-1,0)); NumberFormatException
        System.out.println(calc.obscureFunction(4,-1));
        // System.out.println(calc.obscureFunction(4,-8)); NumberFormatException
        System.out.println(calc.obscureFunction(-4,8));
        System.out.println(calc.obscureFunction(0,0));

        System.out.println(calc.lessObscureFunction(1,2));
        System.out.println(calc.lessObscureFunction(2,4));
        System.out.println(calc.lessObscureFunction(0,2));
        // System.out.println(calc.obscureFunction(-1,0)); NumberFormatException
        System.out.println(calc.lessObscureFunction(4,-1));
        // System.out.println(calc.obscureFunction(4,-8)); NumberFormatException
        System.out.println(calc.lessObscureFunction(-4,8));
        System.out.println(calc.lessObscureFunction(0,0));

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
