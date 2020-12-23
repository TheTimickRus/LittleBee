package org.exTeam.business.products.hive.сomponents;

import java.math.BigDecimal;

/* Крышка улея */
public class HiveRoof extends HiveComponents {
    /* Конструктор */
    // Стандартный конструктор
    public HiveRoof(int article, String name, BigDecimal price, int inStoke) {
        super(article, name, price, inStoke);
    }

    /* Методы */
    @Override
    public String toString() {
        return "HiveRoof{} " + super.toString();
    }
}
