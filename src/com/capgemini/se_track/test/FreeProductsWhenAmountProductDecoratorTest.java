package com.capgemini.se_track.test;

import com.capgemini.se_track.model.Diapers;
import com.capgemini.se_track.model.FreeProductsWhenAmountProductDecorator;
import com.capgemini.se_track.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FreeProductsWhenAmountProductDecoratorTest {

    @BeforeEach
    public void setup() {

    }

    @Test
    void getPriceInEuro_diapers4x_returnsDiscountedPriceInEuro() {
        double expectedPrice = 30;
        Product inputProduct = new Diapers(4);

        double actualPrice = new FreeProductsWhenAmountProductDecorator(inputProduct, 1, 4).getPriceInEuro();

        assertEquals(expectedPrice, actualPrice);
    }

    @Test
    void getPriceInEuro_diapers4x_returnsFullPriceInEuro() {
        double expectedPrice = 40;
        Product inputProduct = new Diapers(4);

        double actualPrice = new FreeProductsWhenAmountProductDecorator(inputProduct, 1, 5).getPriceInEuro();

        assertEquals(expectedPrice, actualPrice);
    }
}
