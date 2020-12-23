package org.exTeam.business.products.hive.сomponents;

import java.math.BigDecimal;

/* Дно улея */
public class HiveBottom extends HiveComponents {
    /* Конструктор */
    // Стандартный конструктор
    public HiveBottom(int article, String name, BigDecimal price, int inStoke) {
        super(article, name, price, inStoke);
    }

    /* Методы */
    @Override
    public String toString() {
        return "HiveBottom{} " + super.toString();
    }
}
