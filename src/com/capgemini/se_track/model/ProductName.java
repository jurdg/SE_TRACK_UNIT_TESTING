package com.capgemini.se_track.model;

public enum ProductName {
    SOAP("Soap"),
    CEREAL("Cereal"),
    VEGGIES("Chinese Vegetables"),
    YOGURT("Yogurt"),
    DIAPERS("Diapers");

    private String productName;

    ProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return this.productName;
    }
}
