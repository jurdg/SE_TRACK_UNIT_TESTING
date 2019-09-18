package com.capgemini.se_track;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        createObject();

        getCharacter(25);

        division();

        formatInteger();

        loopOverArray();

        waitForInput();

        throwCustomUncheckedException(false);
        throwCustomUncheckedException(true);

        throwCustomCheckedException(false);
        throwCustomCheckedException(true);

        try {
            unexpectedErrorHandling();
        } catch (StackOverflowError soe) {
            System.out.println("Will the application still run?");
        }

        division(); // Is this code reachable?

        waitForInput();
    }

    private static void throwCustomUncheckedException(boolean withCustomMessage) throws MyUncheckedException {
        if(!withCustomMessage)
            throw new MyUncheckedException();

        throw new MyUncheckedException("custom unchecked error");
    }

    private static void throwCustomCheckedException(boolean withCustomMessage) throws MyCheckedException {
        if(!withCustomMessage)
            throw new MyCheckedException();

        throw new MyCheckedException("custom checked error");
    }

    private static void createObject() {
        String a = "a";
        String b = "b";
        String c = "c";
        int i = 10;

        String result = a + b;
        result += c;

        System.out.println(result + Integer.toString(i));
    }

    private static void getCharacter(int index) {
        String a = "This is a test string ";
        try {
            char c = a.charAt(24);
            System.out.println(c);
        } catch (StringIndexOutOfBoundsException sie) {
            System.out.println("Index out of bounds " + index);
        }
    }

    private static void division() {
        int a, b, result = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Input two integers");

        try {
            a = input.nextInt();
            b = input.nextInt();

            try {
                result = a / b;
            } catch (ArithmeticException ae) {
                System.out.println("Cannot divide " + a + "/" + b);
            }

            System.out.println(a +"/" + b + "=" + result);
        } catch(InputMismatchException ime) {
            System.out.println("Input is not an integer");
        }

    }

    private static void unexpectedErrorHandling() throws StackOverflowError {
        int a = 0;
        int b = 0;

        while(a == b) {
            a++;
            b++;

            System.out.println("a: " + a + " b: " + b);

            unexpectedErrorHandling();
        }
    }

    private static void formatInteger() {
        String str = "1;";

        int num = 0;
        try {
            Integer.parseInt (str) ;
        } catch (NumberFormatException nfe) {
            System.out.println("Improperly formatted number " + str);
        }

        System.out.println(num);
    }

    private static String languages[] = { "C", "C++", "Java", "Perl", "Python" };
    private static void loopOverArray() {

        for (int c = 1; c <= 5; c++) {
            try {
                System.out.println(languages[c]);
            } catch (ArrayIndexOutOfBoundsException aie) {
                System.out.println("Out of bounds: " + c);
            }
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
