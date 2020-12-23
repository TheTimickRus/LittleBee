package org.exTeam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ServiceWorker.initBuyers();

        SpringApplication.run(App.class, args);
    }
}
