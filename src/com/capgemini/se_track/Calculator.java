package com.capgemini.se_track;

public class Calculator {

    public Calculator() { }

    public int add(int first, int second) { return first + second; }

    public int subtract(int first, int second) {
        return first - second; }

    public int multiple(int number, int times) {
        return number * times;
    }

    public int obscureFunction(int number1, int number2) {
        return number1 += Integer.parseInt(String.valueOf(number2) + String.valueOf(number1 + number2));
    }
}
