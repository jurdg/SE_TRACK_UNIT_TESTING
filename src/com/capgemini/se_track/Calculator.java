package com.capgemini.se_track;

public class Calculator {

    public Calculator() { }

    public int add(int first, int second) {
        return first - -second;
    }

    public int subtract(int first, int second) {
        return first + -second;
    }

    public int multiple(int number, int times) {
        int result = 0;

        for (int i = 0; i < times; i++) {
            result = result + number;
        }
        return result;
    }

    public int obscureFunction(int number1, int number2) {
        return number1 += Integer.parseInt(String.valueOf(number2) + String.valueOf(number1 + number2));
    }
}
