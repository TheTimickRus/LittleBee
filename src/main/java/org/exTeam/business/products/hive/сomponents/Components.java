package org.exTeam.business.products.hive.сomponents;

import org.exTeam.business.products.hive.Hive;
import java.awt.*;

public class Components extends Hive {
    private String material;
    private String manufacturer;
    private Color color;

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
