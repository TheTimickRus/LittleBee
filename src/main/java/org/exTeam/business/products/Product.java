package org.exTeam.business.products;

public class Product {
    private int vendorCode;
    private String Name;
    private int Price;
    private int inStoke;

    public int getVendorCode() {
        return vendorCode;
    }
    public void setVendorCode(int vendorCode) {
        this.vendorCode = vendorCode;
    }

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return Price;
    }
    public void setPrice(int price) {
        Price = price;
    }

    public int getInStoke() {
        return inStoke;
    }
    public void setInStoke(int inStoke) {
        this.inStoke = inStoke;
    }
}
