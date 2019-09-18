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
//EXCEPTION
		try{
			String result = a + b;
        }catch (NullPointerException e ){
			System.out.println("Cannot add nul");	
		}
			
		result += c;
		
        System.out.println(result + Integer.toString(i));
    }

    private static void getCharacter(int index) {
        String a = "This is a test string ";
//EXCEPTION		
		try{
			char c = a.charAt(24);
		}catch IndexOutOfBoundsException e{
			System.out.println("No character at this index");
		}
			
		
        System.out.println(c);
    }
//EXCEPTION
    private static void division() {
        int a, b, result;

        Scanner input = new Scanner(System.in);
        System.out.println("Input two integers");
		
		try{
			a = input.nextInt();
			
		}catch (Exception e){
			throw new Exception("Enter a valid entry");
		}

		try{
			b = input.nextInt();
			
		}catch (Exception e){
			throw new Exception("Enter a valid entry");
		}
        result = a / b;

        System.out.println("Result = " + result);
    }

    private static void formatInteger() {
 //EXCEPTION
		String str = "1;";
		try{
        int num = Integer.parseInt (str) ;
		}catch (Error e){
			System.out.prinln("Cannot convert to int");
		}

        System.out.println(num);
    }

    private static String languages[] = { "C", "C++", "Java", "Perl", "Python" };
    private static void loopOverArray() {
//EXCEPTION
        for (int c = 1; c <= 5; c++) {
			try{
            System.out.println(languages[c]);
        } catch ArrayIndexOutOfBoundsException e {
			System.out.println("Array out of bounds");
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
