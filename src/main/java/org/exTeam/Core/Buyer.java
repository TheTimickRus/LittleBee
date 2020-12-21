package org.exTeam.Core;

import java.util.UUID;

public class Buyer {
    private UUID buyerId;
    private String fullName;
    private String email;
    private String phone;
    private Address address;

    public Buyer() {
        this.buyerId = UUID.randomUUID();
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

    public UUID getBuyerId() {
        return buyerId;
    }
    //==============================================================

    public boolean Register() {
        return true;
    }
}
