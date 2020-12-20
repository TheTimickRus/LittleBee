package org.exTeam.Core.Order;

import java.util.Date;

public class Order {
    private int number;
    private double cost;
    private Date date;
    private Status status;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    //==============================================================

    public boolean Pay(){
        return true;
    }

    public Date TravelTime() {
        return null;
    }
}
