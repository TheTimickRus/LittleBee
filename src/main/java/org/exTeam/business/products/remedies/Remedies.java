package org.exTeam.business.products.remedies;

/* Средства защиты */
public abstract class Remedies {
    private String manufacturer; // Мануфактура
    private String material; // Материал
    private String size; // Размер

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
