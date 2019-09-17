package com.capgemini.se_track;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestClass {

    Calculator calculator;

    @Before
    public void before() {
        this.calculator = new Calculator();
    }

    @Test
    public void add_number2AndNumber5_returns7() {
        int number1 = 2;
        int number2 = 5;
        int expectedResult = 7;

        int actualResult = this.calculator.add(number1, number2);

        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void add_numberMinus3AndNumber5_returns2() {
        int number1 = -3;
        int number2 = 5;
        int expectedResult = 2;

        int actualResult = this.calculator.add(number1, number2);

        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void add_number7AndNumberMinus10_returnsMinus3() {
        int number1 = 7;
        int number2 = -10;
        int expectedResult = -3;

        int actualResult = this.calculator.add(number1, number2);

        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void add_numberMinus7AndNumberMinus10_returnsMinus17() {
        int number1 = -7;
        int number2 = -10;
        int expectedResult = -17;

        int actualResult = this.calculator.add(number1, number2);

        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void subtract_number10AndNumber11_returnsMinus1() {
        int number1 = 10;
        int number2 = 11;
        int expectedResult = -1;

        int actualResult = this.calculator.subtract(number1, number2);

        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void subtract_number11AndNumber10_returns1() {
        int number1 = 11;
        int number2 = 10;
        int expectedResult = 1;

        int actualResult = this.calculator.subtract(number1, number2);

        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void subtract_numberMinus5AndNumberMinus10_returns5() {
        int number1 = -5;
        int number2 = -10;
        int expectedResult = 5;

        int actualResult = this.calculator.subtract(number1, number2);

        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void subtract_numberMinus5AndNumber10_returnsMinus15() {
        int number1 = -5;
        int number2 = 10;
        int expectedResult = -15;

        int actualResult = this.calculator.subtract(number1, number2);

        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void subtract_number5AndNumberMinus10_returns15() {
        int number1 = 5;
        int number2 = -10;
        int expectedResult = 15;

        int actualResult = this.calculator.subtract(number1, number2);

        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void multiply_numberMinus3AndNumber5_returnsMinus15() {
        int number1 = -3;
        int number2 = 5;
        int expectedResult = -15;

        int actualResult = this.calculator.multiple(number1, number2);

        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void multiply_numberMinus3AndNumberMinus5_returns15() {
        int number1 = -3;
        int number2 = -5;
        int expectedResult = 15;

        int actualResult = this.calculator.multiple(number1, number2);

        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void multiply_number3AndNumber5_returns15() {
        int number1 = 3;
        int number2 = 5;
        int expectedResult = 15;

        int actualResult = this.calculator.multiple(number1, number2);

        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void multiply_number0AndNumber5_returns0() {
        int number1 = 0;
        int number2 = 5;
        int expectedResult = 0;

        int actualResult = this.calculator.multiple(number1, number2);

        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void multiply_number0AndNumber0_returns0() {
        int number1 = 0;
        int number2 = 0;
        int expectedResult = 0;

        int actualResult = this.calculator.multiple(number1, number2);

        assertEquals(actualResult, expectedResult);
    }

}
