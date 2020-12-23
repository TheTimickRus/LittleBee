package org.exTeam.business.products.hive.сomponents;

import org.exTeam.business.products.hive.Hive;
import java.awt.*;
import java.math.BigDecimal;

/* Компоненты улея */
public abstract class HiveComponents extends Hive {
    private String material; // Материал
    private String manufacturer; // Мануфактура
    private Color color; // Цвет

    /* Конструктор */
    // Стандартный конструктор
    public HiveComponents(int article, String name, BigDecimal price, int inStoke) {
        super(article, name, price, inStoke);
    }

    /* Свойства */
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
