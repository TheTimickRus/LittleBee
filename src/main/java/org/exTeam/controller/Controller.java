package org.exTeam.controller;

import org.exTeam.ServiceWorker;
import org.exTeam.business.Buyer;
import org.exTeam.business.Cart;
import org.exTeam.business.products.Product;
import org.exTeam.business.utils.Address;
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
    public List<Buyer> getBuyerById(@RequestParam(value = "id") UUID id) {
        return ServiceWorker.buyers.stream().filter(buyer -> buyer.getId().equals(id)).collect(Collectors.toList());
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
    public Cart addProductInCart(@RequestParam(value = "article") int article, @RequestParam(value = "id") String id) {
        try {
            Product tmpProduct = ServiceWorker.products.stream()
                    .filter(product -> product.getArticle() == article)
                    .collect(Collectors.toList()).get(0);

            Cart tmpCart = ServiceWorker.carts.stream()
                    .filter(cart -> cart.getId().equals(UUID.fromString(id)))
                    .collect(Collectors.toList()).get(0);

            int index = ServiceWorker.carts.indexOf(tmpCart);
            tmpCart.addProduct(tmpProduct);
            ServiceWorker.carts.set(index, tmpCart);

            return tmpCart;
        } catch (Exception ex) {
            return null;
        }
    }

    // Удалить товар из корзины по артиклу
    @PostMapping("/removeProductInCart")
    public Cart removeProductInCart(@RequestParam(value = "article") int article, @RequestParam(value = "id") String id) {
        try {
            Cart tmpCart = ServiceWorker.carts.stream()
                    .filter(cart -> cart.getId().equals(UUID.fromString(id)))
                    .collect(Collectors.toList()).get(0);

            Product tmpProduct = ServiceWorker.products.stream()
                    .filter(product -> product.getArticle() == article)
                    .collect(Collectors.toList()).get(0);

            int index = ServiceWorker.carts.indexOf(tmpCart);
            tmpCart.removeProduct(tmpProduct);
            ServiceWorker.carts.set(index, tmpCart);

            return tmpCart;
        } catch (Exception ex) {
            return null;
        }
    }

    // Получить корзину по ID
    @GetMapping("/getCartById")
    public List<Cart> getCartById(@RequestParam(value = "id") UUID id) {
        return ServiceWorker.carts.stream().filter(cart -> cart.getId().equals(id)).collect(Collectors.toList());
    }
}
