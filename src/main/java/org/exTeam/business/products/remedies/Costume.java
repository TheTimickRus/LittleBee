package org.exTeam.business.products.remedies;

import java.awt.*;
import java.math.BigDecimal;

/* Костюмы */
public class Costume extends Remedies {
    private String type;
    private Color color;

    /* Конструктор */
    // Стандартный конструктор
    public Costume(int article, String name, BigDecimal price, int inStoke) {
        super(article, name, price, inStoke);

        this.type = "0";
        this.color = Color.BLACK;
    }

    /* Свойства */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
