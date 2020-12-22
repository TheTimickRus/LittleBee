package org.exTeam.business.utils;

public enum Coupon {
    SALE00(0),
    SALE10(10),
    SALE20(20),
    SALE30(30);

    private int value;

    /* Конструктор */
    Coupon(int value) {
        this.value = value;
    }

    /* Свойства */
    public int getValue() {
        return value;
    }
}
