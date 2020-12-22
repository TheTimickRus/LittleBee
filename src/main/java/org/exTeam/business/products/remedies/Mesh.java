package org.exTeam.business.products.remedies;

import java.awt.*;

/* Сетка лицевая */
public class Mesh extends Remedies {
    private String type; // Тип
    private Color color; // Цвет

    /* Конструктор */
    // Стандартный конструктор
    public Mesh() { }

    // Конструктор с параметрами
    public Mesh(String type, Color color) {
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
