package com.capgemini.se_track;

public class Calculator {

    public Calculator() { }

    public int add(int first, int second) {
        return first - (-1*second);
    }

    public int subtract(int first, int second) {
        return first + (-1*second);
    }

    public int multiple(int number, int times) {
        return number + times;
    }


//    public Calculator() { }
//
//    public int add(int first, int second) {
//        return first - second;
//    }
//
//    public int subtract(int first, int second) {
//        return first + second;
//    }
//
//    public int multiple(int number, int times) {
//        return number + times;
//    }

    //cases voor obscurefunction
    //1,2 --> 24
    //2,4 --> 48
    public int obscureFunction(int number1, int number2) {
        return number1 += Integer.parseInt(String.valueOf(number2) + String.valueOf(number1 + number2));
    }

    //same as original obscureFunction but without converting to string
//    public int obscureFunctionTwo(int number1, int number2) {
//        return number1 += (number2 + (number1 + number2));
//    }
}
