package org.exTeam.controller;

import org.aspectj.weaver.ast.Or;
import org.exTeam.business.Address;
import org.exTeam.business.Cart;
import org.exTeam.business.Buyer;
import org.exTeam.business.order.Order;
import org.exTeam.dto.BuyerDTO;
import org.exTeam.dto.CartDTO;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class Controller {
    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello, " + name + "!";
    }


    @PostMapping("/registerBuyer")
    public Buyer registerBuyer(@RequestBody BuyerDTO buyerDTO) {
        //TODO здесь мы должны описать логику поиска покупателя по его уникального идентифкатору в БД
        return new Buyer();
    }

    @PostMapping("/findBuyer")
    public Buyer getBuyerById(@RequestParam(value = "id") UUID id) {
        //TODO здесь мы должны описать логику поиска покупателя по его уникального идентифкатору в БД
        return new Buyer();
    }


    @PostMapping("/addToCart")
    public Cart addToCart(@RequestBody CartDTO cartDTO) {
        //TODO здесь будет метод, который отдает корзину после добавления в нее товара
        return new Cart();
    }

    @PostMapping("/removeFromCart")
    public Cart removeFromCart(@RequestBody CartDTO cartDTO) {
        //TODO здесь будет метод, который отдает карзину после удаления из нее товара
        return new Cart();
    }


    @PostMapping("/findOrder")
    public Order getOrderById(@RequestParam(value = "id") UUID id) {
        //TODO логика поиска заказа
        return new Order();
    }
}
