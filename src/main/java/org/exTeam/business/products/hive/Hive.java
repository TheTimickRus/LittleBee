package org.exTeam.business.products.hive;

import org.exTeam.business.products.Product;

/* Улей */
public class Hive extends Product {
    private int size; // Размер
    private int framesCount; // Количество рамок
    private int framesSystem; // Система рамок

    /* Свойства */
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getFramesCount() {
        return framesCount;
    }

    public void setFramesCount(int framesCount) {
        this.framesCount = framesCount;
    }

    public int getFramesSystem() {
        return framesSystem;
    }

    public void setFramesSystem(int framesSystem) {
        this.framesSystem = framesSystem;
    }
}
