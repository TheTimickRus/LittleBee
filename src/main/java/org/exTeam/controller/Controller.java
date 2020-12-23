package org.exTeam.controller;

import org.exTeam.ServiceWorker;
import org.exTeam.business.Buyer;
import org.exTeam.business.Cart;
import org.exTeam.business.Order;
import org.exTeam.business.products.Product;
import org.exTeam.business.utils.Address;
import org.exTeam.business.utils.OrderStatus;
import org.exTeam.dto.BuyerDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
public class Controller {
    /* Работа с покупателями */
    // Регистрация покупателя
    @PostMapping("/registerBuyer")
    public Buyer registerBuyer(@RequestParam("fullName") String fullName, @RequestParam("phone") String phone) {
        Buyer buyer = new Buyer(fullName, "", phone, new Address());
        Cart cart = new Cart();

        buyer.setCartId(cart.getId());
        cart.setBuyerId(buyer.getId());

        ServiceWorker.buyers.add(buyer);
        ServiceWorker.carts.add(cart);

        return buyer;
    }

    // Получить всех покупателей
    @GetMapping("/getAllBuyers")
    public List<Buyer> getAllBuyers() {
        return ServiceWorker.buyers;
    }

    // Вывод покупателя по ID
    @GetMapping("/getBuyerById")
    public List<Buyer> getBuyerById(@RequestParam(value = "buyerId") UUID id) {
        return ServiceWorker.buyers.stream()
                .filter(buyer -> buyer.getId().equals(id))
                .collect(Collectors.toList());
    }

    /* Работа с товарами */
    // Получить все товары
    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts() {
        return ServiceWorker.products;
    }

    /* Работа с корзиной */
    // Добавить товар в корзину по артиклу
    @PostMapping("/addProductInCart")
    public Cart addProductInCart(@RequestParam(value = "article") int article, @RequestParam(value = "id") UUID id) {
        Product tmpProduct = ServiceWorker.products.stream()
                .filter(product -> product.getArticle() == article)
                .findFirst()
                .get();

        Cart tmpCart = ServiceWorker.carts.stream()
                .filter(cart -> cart.getId().equals(id))
                .findFirst()
                .get();

        ServiceWorker.carts.remove(tmpCart);
        tmpCart.addProduct(tmpProduct);
        ServiceWorker.carts.add(tmpCart);

        return tmpCart;
    }

    // Удалить товар из корзины по артиклу
    @PostMapping("/removeProductInCart")
    public Cart removeProductInCart(@RequestParam(value = "article") int article, @RequestParam(value = "id") UUID id) {
        Cart tmpCart = ServiceWorker.carts.stream()
                .filter(cart -> cart.getId().equals(id))
                .findFirst()
                .get();

        Product tmpProduct = tmpCart.getProducts().stream()
                .filter(product -> product.getArticle() == article)
                .findFirst()
                .get();

        ServiceWorker.carts.remove(tmpCart);
        tmpCart.removeProduct(tmpProduct);
        ServiceWorker.carts.add(tmpCart);

        return tmpCart;
    }

    // Получить корзину по ID
    @GetMapping("/getCartById")
    public List<Cart> getCartById(@RequestParam(value = "cartId") UUID cartId) {
        return ServiceWorker.carts.stream()
                .filter(cart -> cart.getId().equals(cartId))
                .collect(Collectors.toList());
    }

    /* Работа с заказом */
    // Оформление заказа
    @PostMapping("/createOrder")
    public Order createOrder(@RequestParam(value = "cartId") UUID cartId) {
        Cart tmpCart = ServiceWorker.carts.stream()
                .filter(cart -> cart.getId().equals(cartId))
                .findFirst()
                .get();

        Order order = new Order(tmpCart.getProducts());
        ServiceWorker.orders.add(order);

        return order;
    }

    // Получить все заказы
    @GetMapping("/getAllOrders")
    public List<Order> getAllOrders() {
        return ServiceWorker.orders;
    }

    // Получение статуса заказа
    @GetMapping("/getOrderStatusById")
    public OrderStatus getOrderStatusById(@RequestParam(value = "orderId") UUID orderId) {
        return ServiceWorker.orders.stream()
                .filter(order -> order.getId().equals(orderId))
                .findFirst()
                .get()
                .getStatus();
    }
}
