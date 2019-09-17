package test;

import com.capgemini.se_track.Calculator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void correctAdditionTest() {
        int expected = 5;
        assertEquals(expected, calculator.add(3, 2));
        assertEquals(-1, calculator.add(-3, 2));
        assertEquals(1, calculator.add(3, -2));
        assertEquals(-5, calculator.add(-3, -2));
    }

    @Test
    public void correctSubtractionTest() {
        int expected = -2;
        assertEquals(expected, 2, 4);
        assertEquals(-6, calculator.subtract(-2, 4));
        assertEquals(6, calculator.subtract(2, -4));
        assertEquals(2, calculator.subtract(-2, -4));
    }

    @Test
    public void correctMultiplicationTest() {
        int expected = 72;
        assertEquals(expected, calculator.multiple(8, 9));

        expected = -50;
        assertEquals(expected, calculator.multiple(5, -10));
        assertEquals(expected, calculator.multiple(-5, 10));

        assertEquals(50, calculator.multiple(-5, -10));

        assertEquals(0, calculator.multiple(41, 0));
        assertEquals(0, calculator.multiple(0, 999));
        assertEquals(0, calculator.multiple(0, 0));
    }
}
