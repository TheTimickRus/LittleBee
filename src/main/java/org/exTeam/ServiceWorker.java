package org.exTeam;

import org.exTeam.business.*;
import org.exTeam.business.products.Product;
import org.exTeam.business.products.hive.Hive;
import org.exTeam.business.products.hive.сomponents.*;
import org.exTeam.business.products.remedies.*;
import org.exTeam.business.utils.Address;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Аналог БД */
public class ServiceWorker {
    // Товары
    public static List<Product> products = new ArrayList<>(Arrays.asList(
            // Маски
            new Mesh(10, "Маска #1", new BigDecimal(1999), 99),
            new Mesh(11, "Маска #2", new BigDecimal(2999), 99),
            new Mesh(12, "Маска #3", new BigDecimal(1499), 99),
            new Mesh(13, "Маска #4", new BigDecimal(1099), 99),

            // Костюмы
            new Costume(14, "Костюм #1", new BigDecimal(4999), 99),
            new Costume(15, "Костюм #2", new BigDecimal(5999), 99),
            new Costume(16, "Костюм #3", new BigDecimal(8999), 99),
            new Costume(17, "Костюм #4", new BigDecimal(3999), 99),

            // Комплектующие улея
            new HiveBody(18,   "Корпус Улея #1",  new BigDecimal(1999), 99),
            new HiveBody(19,   "Корпус Улея #2",  new BigDecimal(2999), 99),
            new HiveBody(20,   "Корпус Улея #3",  new BigDecimal(7999), 99),
            new HiveBottom(21, "Дно Улея #1",     new BigDecimal(1999), 99),
            new HiveBottom(22, "Дно Улея #2",     new BigDecimal(3999), 99),
            new HiveBottom(23, "Дно Улея #3",     new BigDecimal(7999), 99),
            new HiveRoof(24,   "Крышка Улея #1",  new BigDecimal(1999), 99),
            new HiveRoof(25,   "Крышка Улея #2",  new BigDecimal(2999), 99),
            new HiveRoof(26,   "Крышка Улея #3",  new BigDecimal(7999), 99),
            new HiveShop(27,   "Магазин Улея #1", new BigDecimal(1999), 99),
            new HiveShop(28,   "Магазин Улея #2", new BigDecimal(4999), 99),
            new HiveShop(29,   "Магазин Улея #3", new BigDecimal(7999), 99),

            //Готовый улей
            new Hive(30, "Улей ППУ Нижегородец", new BigDecimal(9999), 99)
    ));

    // Покупатели
    public static List<Buyer> buyers = new ArrayList<>();

    // Корзины покупателей
    public static List<Cart> carts = new ArrayList<>();

    // Заказы покупателей
    public static List<Order> orders = new ArrayList<>();

    /* Методы */
    // Добавление стандартных покупателей
    public static void initBuyers() {
        Buyer buyer;
        Cart cart;

        buyer = new Buyer("Алексей Навальный", "fbk@gmail.com", "+7-099-036-00-00", new Address());
        cart = new Cart(buyer.getId());
        buyer.setCartId(cart.getId());
        buyers.add(buyer);
        carts.add(cart);

        buyer = new Buyer("Юлия Навальная",     "fbk@gmail.com", "+7-099-036-00-00", new Address());
        cart = new Cart(buyer.getId());
        buyer.setCartId(cart.getId());
        buyers.add(buyer);
        carts.add(cart);

        buyer = new Buyer("Дарья Навальная",    "fbk@gmail.com", "+7-099-036-00-00", new Address());
        cart = new Cart(buyer.getId());
        buyer.setCartId(cart.getId());
        buyers.add(buyer);
        carts.add(cart);

        buyer = new Buyer("Захар Навальный",    "fbk@gmail.com", "+7-099-036-00-00", new Address());
        cart = new Cart(buyer.getId());
        buyer.setCartId(cart.getId());
        buyers.add(buyer);
        carts.add(cart);
    }
}
