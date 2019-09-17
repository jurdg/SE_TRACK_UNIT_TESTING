package com.capgemini.se_track;

public class Calculator {

    public Calculator() { }

    public int add(int first, int second) {
        return first - ( second * -1 );
    }

    public int subtract(int first, int second) {
        return first + ( second * -1 );
    }

    public int multiple(int number, int times) {
        int result = 0;
        if (times > 0) {
            for (int i = 0; i < times; i++) {
                result += number;
            }
            return result;
        } else if (times < 0 ){
            for (int i = 0; i < -times; i++) {
                result += number;
            }
            return -result;
        } else return 0;
    }

    public int obscureFunction(int number1, int number2) {
        return number1 += Integer.parseInt(String.valueOf(number2) + String.valueOf(number1 + number2));
    }

    public int lessObscureFunction(int number1, int number2) {
        int number3 = this.add(number1, number2);

        String string1 = String.valueOf(number2);

        String string2 = String.valueOf(number3);

        int number4 = Integer.parseInt(string1 + string2);

        return number1 + number4;
    }
}
