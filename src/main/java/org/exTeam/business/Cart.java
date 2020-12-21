package org.exTeam.business;

import java.util.UUID;

public class Cart {
    private UUID uuid;
    private double totalCost;
    private String coupon;

    public Cart() {
        this.uuid = UUID.randomUUID();
    }

    public UUID getUuid() {
        return uuid;
    }

    public double getTotalCost() {
        return totalCost;
    }
    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public String getCoupon() {
        return coupon;
    }
    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    public void Add() {

    }

    public void Remove() {

    }

    public double TotalCostWithCoupon() {
        return -1;
    }
}
