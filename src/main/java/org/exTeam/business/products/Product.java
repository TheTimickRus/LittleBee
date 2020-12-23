package org.exTeam.business.products;

import java.math.BigDecimal;

/* Товары */
public abstract class Product {
    private int article; // Артикул
    private String name; // Название товара
    private BigDecimal price; // Цена товара (рубли)
    private int inStoke; // Осталось на складе (штук)

    /* Конструктор */
    public Product(int article, String name, BigDecimal price, int inStoke) {
        this.article = article;
        this.name = name;
        this.price = price;
        this.inStoke = inStoke;
    }

    /* Методы */
    @Override
    public String toString() {
        return "Product{" +
                "article=" + article +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", inStoke=" + inStoke +
                '}';
    }

    /* Свойства */
    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getInStoke() {
        return inStoke;
    }

    public void setInStoke(int inStoke) {
        this.inStoke = inStoke;
    }
}
