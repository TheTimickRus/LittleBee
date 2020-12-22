package org.exTeam;

import org.exTeam.business.Buyer;
import org.exTeam.business.Cart;
import org.exTeam.business.Order;
import org.exTeam.business.products.Product;
import org.exTeam.business.products.hive.Hive;
import org.exTeam.business.products.hive.сomponents.Body;
import org.exTeam.business.products.hive.сomponents.Bottom;
import org.exTeam.business.products.hive.сomponents.Roof;
import org.exTeam.business.products.hive.сomponents.Shop;
import org.exTeam.business.products.remedies.Costume;
import org.exTeam.business.products.remedies.Mesh;
import org.exTeam.business.utils.Address;

import java.awt.*;
import java.util.ArrayList;

public class ServiceWorker {
    public static ArrayList<Buyer> buyers = new ArrayList<>(); {
        new Buyer("Алексаей Навальный", "fbk@gmail.com", "+7-099-036-00-00", new Address());
        new Buyer("Юлия Навальная",     "fbk@gmail.com", "+7-099-036-00-00", new Address());
        new Buyer("Дарья Навальная",    "fbk@gmail.com", "+7-099-036-00-00", new Address());
        new Buyer("Захар Навальный",    "fbk@gmail.com", "+7-099-036-00-00", new Address());
    }

    public static ArrayList<Product> products = new ArrayList<>(); {
        new Costume("", Color.BLACK);
        new Costume("", Color.BLACK);
        new Costume("", Color.BLACK);
        new Costume("", Color.BLACK);

        new Mesh("", Color.BLACK);
        new Mesh("", Color.BLACK);
        new Mesh("", Color.BLACK);
        new Mesh("", Color.BLACK);

        new Body();
        new Bottom();
        new Roof();
        new Shop();

        new Hive();
    }

    public static ArrayList<Order> orders = new ArrayList<>(); {
        new Order(new ArrayList<>());
        new Order(new ArrayList<>());
        new Order(new ArrayList<>());
        new Order(new ArrayList<>());
    }

    public static ArrayList<Cart> carts = new ArrayList<>(); {
        new Cart();
        new Cart();
        new Cart();
        new Cart();
    }
}
