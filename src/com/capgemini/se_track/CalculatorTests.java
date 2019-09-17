package com.capgemini.se_track;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class CalculatorTests {
    public static Calculator calc = null;

    @Before
    public void before() {
        calc = new Calculator();
    }

    @Test
    public void addsIntFirst1IntSecond2ReturnInteger3 () {
        assertEquals(3,calc.add(1,2));
    }

    @Test
    public void addsIntFirst0IntSecond0ReturnInteger0 () {
        assertEquals(0,calc.add(0,0));
    }

    @Test
    public void subtractIntFirst4IntSecond1ReturnInteger3 () {
        assertEquals(3,calc.subtract(4,1));
    }

    @Test
    public void subtractIntFirstMinus1IntSecondMinus1ReturnInteger0 () {
        assertEquals(0,calc.subtract(-1,-1));
    }

    @Test
    public void multipleIntFirst4IntSecond7ReturnInteger28 () {
        assertEquals(28,calc.multiple(4,7));
    }

    @Test
    public void multipleIntFirstMinus1IntSecond1ReturnsIntegerMinus1 () {
        assertEquals(-1, calc.multiple(-1,1));
    }

    @Test
    public void multipleIntFirst3IntSecondMinus2ReturnsIntegerMinus6 () {
        assertEquals(-6, calc.multiple(3,-2));
    }

    @Test
    public void multipleIntFirstMinus1IntSecondMinus2ReturnInteger2 () {
        assertEquals(2,calc.multiple(-1,-2));
    }

    @Test
    public void multipleIntFirst0IntSecondMinus0ReturnInteger0 () {
        assertEquals(0,calc.multiple(0,0));
    }

    @Test
    public void multipleIntFirst5IntSecond0ReturnInteger0 () {
        assertEquals(0,calc.multiple(5,0));
    }

    @Test
    public void multipleIntFirst0IntSecond4ReturnsInteger0 () {
        assertEquals(0, calc.multiple(0,4));
    }

    @Test
    public void obscureFunctionIntFirstIntSecondReturnsInteger () {

    }

}
