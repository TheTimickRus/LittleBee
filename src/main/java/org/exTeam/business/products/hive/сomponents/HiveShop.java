package org.exTeam.business.products.hive.сomponents;

import java.math.BigDecimal;

/* Магазин улея */
public class HiveShop extends HiveComponents {
    /* Конструктор */
    // Стандартный конструктор
    public HiveShop(int article, String name, BigDecimal price, int inStoke) {
        super(article, name, price, inStoke);
    }

    /* Методы */
    @Override
    public String toString() {
        return "HiveShop{} " + super.toString();
    }
}
