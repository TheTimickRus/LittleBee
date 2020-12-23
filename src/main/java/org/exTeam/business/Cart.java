package org.exTeam.business;

import org.exTeam.business.products.Product;
import org.exTeam.business.utils.Coupon;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.UUID;

public class Cart {
    private UUID id; // ID корзины
    private BigDecimal totalCost; // Стоимость товаров в корзине
    private BigDecimal totalCostWithCoupon; // Стоимость товаров в корзине со скидкой по купону
    private Coupon coupon; // Купон
    private UUID buyerId; // ID покупателя

    private ArrayList<Product> products = new ArrayList<>(); // Коллекция товаров в корзине

    /* Конструктор */
    // Стандартный конструктор
    public Cart() {
        this.id = UUID.randomUUID();
        coupon = Coupon.SALE00;
    }

    // Конструктор с параметрами №1
    public Cart(ArrayList<Product> products) {
        this.id = UUID.randomUUID();
        coupon = Coupon.SALE00;
        this.products = products;
    }

    // Конструктор с параметрами №2
    public Cart(UUID buyerId) {
        this.id = UUID.randomUUID();
        coupon = Coupon.SALE00;
        this.buyerId = buyerId;
    }

    /* Методы */
    // Добавляем новый продукт в корзину
    public void addProduct(Product product) {
        products.add(product);
        totalCost.add(product.getPrice());
    }

    // Удаляем продукт из корзины
    public void removeProduct(Product product) {
        products.remove(product);
        totalCost.remainder(product.getPrice());
    }

    // Применяем купон
    public void applyCoupon(Coupon coupon) {
        if (this.coupon != coupon) {
            this.coupon = coupon;
            totalCostWithCoupon = totalCost
                    .multiply(BigDecimal.valueOf(coupon.getValue()))
                    .divide(new BigDecimal(100));
        }
    }

    // Тестовый вывод
    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", totalCost=" + totalCost +
                ", totalCostWithCoupon=" + totalCostWithCoupon +
                ", coupon=" + coupon +
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

    public BigDecimal getTotalCostWithCoupon() {
        return totalCostWithCoupon;
    }

    public Coupon getCoupon() {
        return coupon;
    }

    public UUID getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(UUID buyerId) {
        this.buyerId = buyerId;
    }
}
