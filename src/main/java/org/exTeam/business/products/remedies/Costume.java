package org.exTeam.business.products.remedies;

import java.awt.*;

/* Костюмы */
public class Costume extends Remedies {
    private String type;
    private Color color;

    /* Конструктор */
    // Стандартный конструктор
    public Costume() { }

    // Конструктор с параметрами
    public Costume(String type, Color color) {
        this.type = type;
        this.color = color;
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
