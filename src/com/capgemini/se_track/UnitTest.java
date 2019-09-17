package com.capgemini.se_track;
import static org.junit.Assert.assertEquals;
import org.junit.*;

public class UnitTest {

    Calculator calculator = null;

    @Before
    public void before(){
        calculator = new Calculator();

    }

    @Test

    public void addShouldReturnTruePositive(){
        assertEquals(5, calculator.add(2,3));
    }

    @Test

    public void addShouldReturnTrueNegative(){
        assertEquals(-10, calculator.add(-15,5));
    }

    @Test
    public void addShouldReturnTrueNegpos(){
        assertEquals(10, calculator.add(-20,30));
    }

    @Test
    public void addShouldReturnTrueNeg(){
        assertEquals(-5, calculator.add(-3,-2));
    }



    @Test
    public void subtractShouldReturnTrue(){
        assertEquals(5, calculator.subtract(10,5));

    }

    @Test
    public void subtractNegativeShouldReturnTrue(){
        assertEquals(-10, calculator.subtract(-11,-1));

    }

    @Test
    public void subtractNegativePosShouldReturnTrue(){
        assertEquals(-2, calculator.subtract(8,10));

    }

    @Test
    public void subtractNegativeNegShouldReturnTrue(){
        assertEquals(-2, calculator.subtract(-4,-2));

    }




    @Test
    public void multipleShouldReturnTrue(){
        assertEquals(10, calculator.multiple(2,5));
    }

    @Test
    public void multiplePosShouldReturnTrue(){
        assertEquals(-10, calculator.multiple(-5,2));
    }

    @Test
    public void multipleNegShouldReturnTrue(){
        assertEquals(20, calculator.multiple(-2,-10));
    }

    @Test
    public void multipleNegShouldReturn(){
        assertEquals(-20, calculator.multiple(2,-10));
    }

    @Test
    public void multipleNegShouldNull(){
        assertEquals(0, calculator.multiple(-1,0));
    }

    @Test
    public void obscureTest(){
        assertEquals(40, calculator.obscureFunction(2, 0));

    }


}
