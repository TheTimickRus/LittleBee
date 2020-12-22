package org.exTeam.business;

import org.exTeam.business.products.Product;
import org.exTeam.business.utils.OrderStatus;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Order {
    private UUID id; // ID заказа
    private BigDecimal totalCost; // Стоимость товаров в заказе
    private Date date; // Дата заказа
    private OrderStatus status; // Статус

    private ArrayList<Product> products; // Коллекция товаров в заказе

    /* Конструктор */
    // Стандартный конструктор
    public Order(ArrayList<Product> products) {
        this.products = products;

        this.id = UUID.randomUUID();
        this.totalCost = BigDecimal
                .valueOf(products.stream()
                .mapToDouble(product -> product.getPrice()
                .doubleValue()).sum());
        this.date = new Date();
        this.status = OrderStatus.THE_ORDER_IS_WAITING_FOR_PAYMENT;
    }

    /* Методы */
    // Тестовый вывод
    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", totalCost=" + totalCost +
                ", date=" + date +
                ", status=" + status +
                ", products=" + products +
                '}';
    }

    /* Свойства */
    public UUID getId() {
        return id;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public Date getDate() {
        return date;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
