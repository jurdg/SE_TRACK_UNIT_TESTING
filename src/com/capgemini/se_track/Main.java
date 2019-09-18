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

    //NullPointerException
	private static void createObject() { 
        String a;
        String b = "b";
        String c = "c";
        int i = 10;

        String result = a + b;
        result += c;

        System.out.println(result + Integer.toString(i));
		
		try{ 
		String a;
		System.out.print(a.charAt(0));}
		catch (NullPointerException) {
		System.out.print("Null pointer exception");
		}
    }

    //StringIndexOutOfBoundsException
	private static void getCharacter(int index) { 
        String a = "This is a test string ";
        char c = a.charAt(24);
      	
	try (System.out.println(c)){
		catch(StringIndexOutOfBoundsException)
		System.out.print("Index out of bound");
		}
    }

    //ArithmeticException
	private static void division() { 
        int a, b, result;

        Scanner input = new Scanner(System.in);
        System.out.println("Input two integers");
 
		
		try { 
			a = input.nextInt();
			b = input.nextInt();
			
			result = a / b;

			
			System.out.println("Result = " + result);}
		catch (ArithmeticException ae){
			System.out.print("Can't divide by zero");
		}
    }

    //NumberFormatException
	private static void formatInteger() { 
        String str = "1;";
       		
		try { 
		int num = Integer.parseInt (str) ;
        System.out.println(num);
		} catch (NumberFormatException nfe) {
			System.out.println("Number format exception");
		}
    }

    //ArrayIndexOutOfBoundsException
	private static String languages[] = { "C", "C++", "Java", "Perl", "Python" };
    private static void loopOverArray() {

        for (int c = 1; c <= 5; c++) {
       		
		try {
			System.out.println(languages[c]);
        } catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println("Array index out of bound");
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
