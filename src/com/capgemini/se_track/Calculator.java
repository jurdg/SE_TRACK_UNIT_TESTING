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
        int solution = 0;
        if(number == 0 || times == 0) {
            return 0;
        }
        else {
            if (times > 0) {
                for (int i = times; i > 0; i--)
                    solution += number;
            }
            else {
                for (int i = number; i < 0; i++)
                    solution = solution + times;
            }
        }
        return solution;
    }

    public int obscureFunction(int number1, int number2) {
        return number1 += Integer.parseInt(String.valueOf(number2) + String.valueOf(number1 + number2));
    }
}
