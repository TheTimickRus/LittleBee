package org.exTeam.business.utils;

public class Address {
    private String country; // Страна
    private String region; // Область
    private String city; // Город
    private String street; // Улица
    private String houseNumber; // Номер дома
    private String apartmentNumber; // Номер квартиры

    /* Конструктор */
    // Стандартный конструктор
    public Address() {

    }

    // Конструктор с параметрами
    public Address(String country, String region, String city, String street, String houseNumber, String apartmentNumber) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
    }

    /* Свойства */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }
}
