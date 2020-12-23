package org.exTeam.business.products.remedies;

import java.awt.*;
import java.math.BigDecimal;

/* Сетка лицевая */
public class Mesh extends Remedies {
    private String type; // Тип
    private Color color; // Цвет

    /* Конструктор */
    // Стандартный конструктор
    public Mesh(int article, String name, BigDecimal price, int inStoke) {
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
