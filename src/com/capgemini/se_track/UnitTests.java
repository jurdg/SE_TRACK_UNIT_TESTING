package com.capgemini.se_track;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.*;


public class UnitTests {
    Calculator calculator = null;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void addPositivePositiveShouldReturnPositive() {
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    public void addNegativeNegativeShouldReturnNegative() {
        assertEquals(-2, calculator.add(-1, -1));
    }

    @Test
    public void addNegativePositiveShouldReturnPositive() {
        assertEquals(1, calculator.add(-1, 2));
    }

    @Test
    public void addPositiveNegativeShouldReturnNegative() {
        assertEquals(-1, calculator.add(1, -2));
    }

    @Test
    public void subtractPositivePositiveShouldReturnPositive() {
        assertEquals(1, calculator.subtract(2, 1));
    }

    @Test
    public void subtractNegativeNegativeShouldReturnPositive() {
        assertEquals(0, calculator.subtract(-3, -3));
    }

    @Test
    public void subtractNegativePositiveShouldReturnPositive() {
        assertEquals(-11, calculator.subtract(-10, 1));
    }

    @Test
    public void subtractPositiveNegativeShouldReturnTrue() {
        assertEquals(11, calculator.subtract(1, -10));
    }

    @Test
    public void multiplyPositivePositiveShouldReturnTrue() {
        assertEquals(56, calculator.multiple(7, 8));
    }

    @Test
    public void multiplyNegativeNegativeShouldReturnTrue() {
        assertEquals(100, calculator.multiple(-10, -10));
    }

    @Test
    public void multiplyPositiveNegativeShouldReturnTrue() {
        assertEquals(-100, calculator.multiple(10, -10));
    }

    @Test
    public void multiplyNegativePositiveShouldReturnTrue() {
        assertEquals(-100, calculator.multiple(-10, 10));
    }

    @Test
    public void multiplyZeroNegativeShouldReturnZero() {
        assertEquals(0, calculator.multiple(0, -1));
    }
}
