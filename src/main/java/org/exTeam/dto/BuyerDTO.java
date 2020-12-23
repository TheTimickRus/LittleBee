package org.exTeam.dto;

import java.util.UUID;

/* Упрощенный вариант покупателя */
public class BuyerDTO {
    private UUID id; // ID покупателя
    private String fullName; // Полное имя
    private UUID cartId; // ID корзины покупателя

    /* Конструктор */
    // Конструктор с параметрами
    public BuyerDTO(UUID id, String fullName, UUID cartId) {
        this.id = id;
        this.fullName = fullName;
        this.cartId = cartId;
    }

    /* Свойства */
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public UUID getCartId() {
        return cartId;
    }

    public void setCartId(UUID cartId) {
        this.cartId = cartId;
    }
}
