package com.capgemini.se_track.unittests;

import com.capgemini.se_track.enums.ContentUnit;
import com.capgemini.se_track.models.*;

import org.junit.*;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UtCartLine {
    public static CartLine cartLine
            = null;

    public UtCartLine() {}

    @Test
    public void newCartLineInstanceShouldReturnCorrectCartLineCost () {
        ProductBrand mockBrand = new ProductBrand("mockBrand","mockType");
        Category mockCategory = new Category("mockCategory");
        double mockPrice = 3.50d;
        Content mockContent = new Content(300f,ContentUnit.G);
        Product mockProduct = new Product(mockBrand, mockCategory, mockPrice, mockContent);
        CartLine mockLine = new CartLine(mockProduct, 3);

        assertEquals(10.5d, mockLine.getCartLineCost(),0.01);
    }

    @Test
    public void addValidInt3 () {
        CartLine lineToTest = new CartLine(new Product());
        lineToTest.add(3);
        assertEquals(4, lineToTest.getAmount());
    }

    @Test
    public void addInvalidIntMinus2 () {
        CartLine lineToTest = new CartLine(new Product());
        lineToTest.add(-2);
        assertEquals(1, lineToTest.getAmount());
    }

    @Test
    public void removeValidInt3 () {
        CartLine lineToTest = new CartLine(new Product(), 5);
        lineToTest.remove(3);
        assertEquals(2, lineToTest.getAmount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeInvalidIntMinus2 () {
        CartLine lineToTest = new CartLine(new Product(), 5);
        lineToTest.remove(-2);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void removeInvalidInt4LargerThanAmount () {
        CartLine lineToTest = new CartLine(new Product(), 2);
        lineToTest.remove(4);
    }
}
