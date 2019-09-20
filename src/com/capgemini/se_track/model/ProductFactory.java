package com.capgemini.se_track.model;

public class ProductFactory {

    private static ProductFactory instance;

    private ProductFactory() {

    }

    public static ProductFactory getInstance() {
        if (instance == null) {
            instance = new ProductFactory();
        }

        return instance;
    }

    public Product getProduct(Products products, int amount) {
        switch (products) {
            case SOAP:
                return new SetAmountDiscountProductDecorator(new Soap(amount), 31, 2);
            case CEREAL:
                return new Cereal(amount);
            case CHINESE_VEGETABLES:
                return new ChineseVegetables(amount);
            case DIAPERS:
                return new FreeProductsWhenAmountProductDecorator(new Diapers(amount), 1, 4);
            case YOGHURT:
                return new DiscountOnDayOfWeekProductDecorator(new Yoghurt(amount), 3, 1);
            default:
                return null;
        }
    }
}
