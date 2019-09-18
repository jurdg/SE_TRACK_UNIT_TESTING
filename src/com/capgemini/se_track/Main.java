package com.capgemini.se_track;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
	    createObject();
	} 
	catch (NullPointerException npe) {
	    npe.printStackTrace();
	}

	try {
            getCharacter(25);
	}
	catch (IndexOutOfBoundsException iob) {
	    iob.printStackTrace();
	}

        try {
	    formatInteger();
	}
	catch (NumberFormatException nfe) {
	    nfe.printStackTrace();
	}

	try {
            division();
	}
	catch (InputMismatchException ime) {
	    ime.printStackTrace();
	}

	try {
            loopOverArray();
	}
	catch (ArrayIndexOutOfBoundsException aob) {
	    aob.printStackTrace();
	}

        waitForInput();
    }

    private static void createObject() {
        String a;
        String b = "b";
        String c = "c";
        int i = 10;
	
	//String a is null. Null + b gaat probleem veroorzaken. Nullpointerexception?	

        String result = a + b;
        result += c;

        System.out.println(result + Integer.toString(i));
    }

    private static void getCharacter(int index) {
        String a = "This is a test string ";
        char c = a.charAt(24);

	//indexoutofboundsexception

        System.out.println(c);
    }

    private static void division() {
        int a, b, result;

        Scanner input = new Scanner(System.in);
        System.out.println("Input two integers");

        a = input.nextInt();
        b = input.nextInt();
	//inputmismatchexception if a double is entered?

        result = a / b;

	//kan zijn dat int/int uit komt op een komma getal. result moet double zijn.
	//illegalargumentexception in geval dat je door 0 deelt?

        System.out.println("Result = " + result);
    }

    private static void formatInteger() {
        
	//numberformatexception

	String str = "1;";
        int num = Integer.parseInt (str) ;

        System.out.println(num);
    }

    private static String languages[] = { "C", "C++", "Java", "Perl", "Python" };
    private static void loopOverArray() {

	//arrayindexoutofboundsexception

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

    //EIGEN METHODE CHECKED EXCEPTION

    public static String colors[] = {"Red", "Blue", "Green", "Yellow"};

    public static void stringLoop() throws ArrayIndexOutOfBoundsException {
	
	try {
	    for (int i = 0; i > 5; i++) {
		System.out.println(colors[i]);
	    }
	}
	catch (ArrayIndexOutOfBoundsException aob) {
	    aob.printStackTrace();
	}
    }

    //EIGEN METHOD MEERDERE EXCEPTIONS

    public void ditGaatFout() {

    

    }



}












