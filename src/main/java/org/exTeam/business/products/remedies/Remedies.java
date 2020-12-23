package org.exTeam.business.products.remedies;

import org.exTeam.business.products.Product;

import java.math.BigDecimal;

/* Средства защиты */
public abstract class Remedies extends Product {
    private String manufacturer; // Мануфактура
    private String material; // Материал
    private String size; // Размер

    /* Конструктор */
    // Стандартный конструктор
    public Remedies(int article, String name, BigDecimal price, int inStoke) {
        super(article, name, price, inStoke);
    }

    /* Свойства */
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
