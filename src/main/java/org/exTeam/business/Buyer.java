package org.exTeam.business;

import org.exTeam.business.utils.Address;

import java.util.UUID;

public class Buyer {
    private UUID id; // ID пользователя
    private String fullName; // ФИО
    private String email; // EMAIL
    private String phone; // Номер телефона
    private Address address; // Адрес

    /* Конструктор */
    // Стандартный конструктор
    public Buyer() {
        this.id = UUID.randomUUID();
    }

    // Конструктор с параметрами
    public Buyer(String fullName, String email, String phone, Address address) {
        this.id = UUID.randomUUID();
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    /* Методы */
    public void Register() throws Exception {
        throw new Exception("Метод не реализован :(");
    }

    /* Свойства */
    public UUID getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
