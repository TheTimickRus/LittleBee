package org.exTeam.business.products.hive.сomponents;

import org.exTeam.business.products.hive.Hive;
import java.awt.*;

/* Компоненты улея */
public abstract class Components extends Hive {
    private String material; // Материал
    private String manufacturer; // Мануфактура
    private Color color; // Цвет

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
