package model;

import global.GlobalData;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    String name;
    String location;
    Double totalAmount;
    List<Order> orders;

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", totalAmount=" + totalAmount +
                ", orders=" + orders +
                '}';
    }

    private Restaurant() {
        this.name = "My Restaurant";
        this.location = "Ganja";
        this.totalAmount = 0.0;
        this.orders = new ArrayList<>();
    }

    private static Restaurant instance;

    public static Restaurant getInstance() {
        return instance == null ? instance = new Restaurant() : instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}