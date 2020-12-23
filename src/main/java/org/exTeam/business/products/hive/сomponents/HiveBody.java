package org.exTeam.business.products.hive.сomponents;

import java.math.BigDecimal;

/* Корпус улея */
public class HiveBody extends HiveComponents {
    /* Конструктор */
    // Стандартный конструктор
    public HiveBody(int article, String name, BigDecimal price, int inStoke) {
        super(article, name, price, inStoke);
    }

    /* Методы */
    @Override
    public String toString() {
        return "HiveBody{} " + super.toString();
    }
}
