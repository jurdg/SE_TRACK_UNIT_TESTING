package com.capgemini.se_track.enums;

public enum ItemEnum {
    SOAP(1,3.00, "Soap"),
    CEREALS(2,2.50, "Cereals"),
    CHINESE_VEGETABLES(3,5.00, "Chinese Vegetables"),
    YOGHURT(4,2.00, "Yoghurt"),
    DIAPERS(5,10.00, "Diapers");

    private int itemEnumNumber;
    private double itemEnumPrice;
    private String itemEnumName;

    public int getItemEnumNumber(){
        return itemEnumNumber;
    }

    public double getItemEnumPrice() {
        return itemEnumPrice;
    }

    public String getItemEnumName() {
        return itemEnumName;
    }

    ItemEnum(int i, double s, String n) {
        this.itemEnumNumber = i;
        this.itemEnumPrice = s;
        this.itemEnumName = n;
    }
}
