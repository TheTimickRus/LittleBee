package org.exTeam.controller;

import org.exTeam.Core.Basket;
import org.exTeam.Core.Buyer;
import org.exTeam.dto.BasketDTO;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class SampleController {

    //Мы используем методы помеченные GetMapping когда хотим получить информацию
    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello, " + name + "!";
    }

    @PostMapping("/findBuyer")
    public Buyer getBuyerById(@RequestParam(value = "id") UUID id) {
        //TODO здесь мы должныы опиать логику поиска покупателя по его уникального идентифкатору в БД
        return new Buyer();
    }

    //Мы используем методы помеченные PostMapping когда хотим добавить или сохранить информацию
    @PostMapping("/addToCart")
    public Basket addToBasket(@RequestBody BasketDTO basketDTO) {
        //TODO здесь будет метод, который отдает корзину после добавления в нее товара
        return new Basket();
    }
}
