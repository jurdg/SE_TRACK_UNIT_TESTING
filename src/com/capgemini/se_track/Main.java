package com.capgemini.se_track;

import java.io.IOException;
import java.util.Scanner;

//Checkout the repo
//Create a branch
//Do no open Intellij (or another IDE) to inspect the code
//Try to find out what kind of (Runtime) Exceptions need to be handled
public class Main {

    public static void main(String[] args) {

        createObject();

        getCharacter(25);

        formatInteger();

        division();

        loopOverArray();

        waitForInput();
    }

    private static void createObject() throws NullPointerException {
        String a;
        String b = "b";
        String c = "c";
        int i = 10;

		try {
			String result = a + b;
		} catch (NullPointerException npe) {
			System.out.println("NullPointerException occured: " + npe);
		}
		
        result += c;

        System.out.println(result + Integer.toString(i));
    }

    private static void getCharacter(int index) throws IndexOutOfBoundsException {
        String a = "This is a test string ";
		
		try {
			char c = a.charAt(24);
		} catch (IndexOutOfBoundsException ibe) {
			System.out.println("IndexOutOfBoundsException occured: " + ibe);
		}
		
        System.out.println(c);
    }

    private static void division() throws throwIOException2, Exception, ArithmeticException {
        int a, b, result;

        Scanner input = new Scanner(System.in);
        System.out.println("Input two integers");

		try {
			a = input.nextInt();
		} catch (Exception e) {
			//Implement and use your own checked exception
			throw new throwIOException2("Exception occured: " + e);
		}

		try {
			b = input.nextInt();
		} catch (Exception e) {
			throw new Exception("Exception occured: " + e);
		}

		try {
			result = a / b;
		} catch (ArithmeticException ae) {
			System.out.println("ArithmeticException occured: " + ae);
		}
		
		System.out.println("Result = " + result);
    }

    private static void formatInteger() throws Error2 {
        String str = "1;";
		
		try {
			int num = Integer.parseInt (str) ;
		} catch (throwSurpriseCheckedException e) {
			throwSurpriseCheckedException(5);
		}

        System.out.println(num);
    }

    private static String languages[] = { "C", "C++", "Java", "Perl", "Python" };
    private static void loopOverArray() throws ArrayIndexOutOfBoundsException {

        for (int c = 1; c <= 5; c++) {
			try {			
				System.out.println(languages[c]);
			} catch (ArrayIndexOutOfBoundsException aibe) {
				System.out.println("ArrayIndexOutOfBoundsException occured: " + aibe);
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
	
	//Write a method that throws a checked exception
	public static void throwIOException(IOException ie) {
		System.out.println("IOException occured: " + ie);
	}
	
	//Write ad method that can throw multiple exceptions
	private static void throwException(Exception e) {
		switch(e){
			case(ArrayIndexOutOfBoundsException):
				System.out.println("No more items in Array!");
			case(IOException):
				System.out.println("IOException!");
			case(NullPointerException):
				System.out.println("NullPointerException!");
			default:
				System.out.println("Error help me!");
		}
	}
	
	//Implement your own unchecked exception
	class throwIOException extends Exception {
		throwIOException() {}
	
		public static void throwIOException2(String errorMessage) {
			super(errorMessage);
		}
	}
	
	//Surprise me
	class Error2 extend Exception {
		int number;
		Random rand = new Random(number);
		
		throwSurprise(int number) {
			this.number = number;
		}
		
		public static void throwSurpriseCheckedException(String surpriseMessage) {
			switch(rand) {
				case 1:
					throw new FileNotFoundException(surpriseMessage);
				case 2:
					throw new IOException(surpriseMessage);
				case 3:
					throw new SQLException(surpriseMessage);
				case 4:
					throw new InvocationTargetException(surpriseMessage);
				case 5:
					throw new ClassNotFoundException(surpriseMessage);
				default:
					throw new Error(surpriseMessage);
			}
		}
		
		public static void throwSurpriseUncheckedException(String surpriseMessage) {
			switch(rand) {
				case 1:
					throw new NullPointerException(surpriseMessage);
				case 2:
					throw new ArrayIndexOutOfBoundsException(surpriseMessage);
				case 3:
					throw new ArithmeticException(surpriseMessage);
				case 4:
					throw new IllegalArgumentException(surpriseMessage);
				case 5:
					throw new NumberFormatException(surpriseMessage);
				default:
					throw new Error(surpriseMessage);
			}
		}
}




