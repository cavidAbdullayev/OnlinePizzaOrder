package model;

import java.time.LocalDateTime;

public class Order {
    private Integer orderId;
    private String pizzaName;
    private String pizzaSize;
    private String sous;
    private Double prize;
    private LocalDateTime deliveryTime;
    private Customer customer;
    private Courier courier;
    private Boolean deliveryStatus;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public String getSous() {
        return sous;
    }

    public void setSous(String sous) {
        this.sous = sous;
    }

    public Double getPrize() {
        return prize;
    }

    public void setPrize(Double prize) {
        this.prize = prize;
    }

    public LocalDateTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalDateTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Courier getCourier() {
        return courier;
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    public Boolean getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(Boolean deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public Order(Integer orderId, String pizzaName, String pizzaSize, String sous, Double prize, LocalDateTime deliveryTime, Customer customer, Courier courier, Boolean deliveryStatus) {
        this.orderId = orderId;
        this.pizzaName = pizzaName;
        this.pizzaSize = pizzaSize;
        this.sous = sous;
        this.prize = prize;
        this.deliveryTime = deliveryTime;
        this.customer = customer;
        this.courier = courier;
        this.deliveryStatus = deliveryStatus;
    }

    @Override
    public String toString() {
        return
                "orderId=" + orderId +
                        ", pizzaName='" + pizzaName + '\'' +
                        ", pizzaSize='" + pizzaSize + '\'' +
                        ", sous='" + sous + '\'' +
                        ", prize=" + prize +
                        ", deliveryTime=" + deliveryTime +
                        ", customer=" + customer +
                        ", courier=" + courier +
                        ", deliveryStatus=" + deliveryStatus;
    }
}