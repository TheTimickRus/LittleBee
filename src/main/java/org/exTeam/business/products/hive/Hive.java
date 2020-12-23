package org.exTeam.business.products.hive;

import org.exTeam.business.products.Product;
import org.exTeam.business.products.hive.сomponents.*;

import java.math.BigDecimal;

/* Улей */
public class Hive extends Product {
    private int size; // Размер
    private int framesCount; // Количество рамок
    private int framesSystem; // Система рамок
    private HiveComponents body; // Корпус улея
    private HiveComponents bottom; // Дно улея
    private HiveComponents roof; // Крышка улея
    private HiveComponents shop; // Магазин улея

    /* Конструктор */
    // Стандартный конструктор
    public Hive(int article, String name, BigDecimal price, int inStoke) {
        super(article, name, price, inStoke);
    }

    /* Методы */

    @Override
    public String toString() {
        return "Hive{" +
                "size=" + size +
                ", framesCount=" + framesCount +
                ", framesSystem=" + framesSystem +
                ", body=" + body +
                ", bottom=" + bottom +
                ", roof=" + roof +
                ", shop=" + shop +
                "} " + super.toString();
    }

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

    public HiveComponents getBody() {
        return body;
    }

    public void setBody(HiveComponents body) {
        this.body = body;
    }

    public HiveComponents getBottom() {
        return bottom;
    }

    public void setBottom(HiveComponents bottom) {
        this.bottom = bottom;
    }

    public HiveComponents getRoof() {
        return roof;
    }

    public void setRoof(HiveComponents roof) {
        this.roof = roof;
    }

    public HiveComponents getShop() {
        return shop;
    }

    public void setShop(HiveComponents shop) {
        this.shop = shop;
    }
}
