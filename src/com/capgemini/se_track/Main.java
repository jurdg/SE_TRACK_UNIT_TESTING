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
		
		readFile();
		
		getFromArray();

        waitForInput();
    }

    private static void createObject() {
        String a; //a has not been initialized error
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
		}
		catch (IndexOutOfBoundsException ie) {
			System.out.println("No character located at the given index");
		}
        System.out.println(c);
    }

    private static void division() {
        int a, b, result;

        Scanner input = new Scanner(System.in);
        System.out.println("Input two integers");
		
		try {
			a = input.nextInt();
		}
		catch (InputMismatchException ime) {
			System.out.println("Value input is not an integer");
		}
		
		try {
			b = input.nextInt();
		}
		catch (InputMismatchException ime) {
			System.out.println("Value input is not an integer");
		}

		try {
			result = a / b;
			System.out.println("Result = " + result);
		}
		catch (ArithmeticException ae) {
			System.out.println("Divide by zero error");
		}
    }

    private static void formatInteger() {
        String str = "1;";
		try {
			int num = Integer.parseInt (str);
			System.out.println(num);
		}
		catch (NumberFormatException nfe) {
			System.out.println("Not a number");
		}        
    }

    private static String languages[] = { "C", "C++", "Java", "Perl", "Python" };
    private static void loopOverArray() {

        for (int c = 1; c <= 5; c++) {
			try {
				System.out.println(languages[c]);
			}
			catch (ArrayIndexOutOfBoundsException aie) {
				System.out.println("Index out of bounds");
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
	
	private static void readFile() {
		String file = "text.txt";
		
		try {
			Scanner scanner = new Scanner(new File(file));
			while (scanner.hasNext()) {
				System.out.println(scanner.next());
			}
		}
		catch (IOException ie) {
			System.out.println("File not found");
		}
		
		scanner.close();
	}
	
	private static void getFromArray() {
		Scanner input = new Scanner(System.in);		
		System.out.println("Get value from which index"):
		
		int index;
		try {
			index = input.nextInt();
			System.out.println(languages[index]);
		}
		catch (InputMismatchException ime) {
			System.out.println("Not a valid number");
		}
		catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println("Index out of bounds");
		}
	}

}
