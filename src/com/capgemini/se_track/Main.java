package com.capgemini.se_track;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        createObject();

        getCharacter(25);

        formatInteger();

        division();

        loopOverArray();

        waitForInput();
    }

    private static void createObject() {
        String a;
        String b = "b";
        String c = "c";
        int i = 10;

        String result = a + b;
        result += c;

        System.out.println(result + Integer.toString(i));
    }

    private static void getCharacter(int index) {
        String a = "This is a test string ";
        char c = a.charAt(24);
        System.out.println(c);
    }

    private static void division() {
        int a, b, result;

        Scanner input = new Scanner(System.in);
        System.out.println("Input two integers");

        a = input.nextInt();
        b = input.nextInt();

        result = a / b;

        System.out.println("Result = " + result);
    }

    private static void formatInteger() {
        String str = "1;";
        int num = Integer.parseInt (str) ;

        System.out.println(num);
    }

    private static String languages[] = { "C", "C++", "Java", "Perl", "Python" };
    private static void loopOverArray() {

        for (int c = 1; c <= 5; c++) {
            System.out.println(languages[c]);
        }
    }

    private static void waitForInput() {
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
