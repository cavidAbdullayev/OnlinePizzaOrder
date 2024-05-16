package model;

import java.time.LocalDateTime;

public class Customer {
    private Integer customerId;
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
    private String password;
    private Integer orderId;
    private Double moneyAccount;
    private LocalDateTime registrationDate;
    private Boolean status;

    @Override
    public String toString() {
        return "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", orderId=" + orderId +
                ", moneyAccount='" + moneyAccount + '\'' +
                ", registrationDate=" + registrationDate +
                ", status=" + status;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Double getMoneyAccount() {
        return moneyAccount;
    }

    public void setMoneyAccount(Double moneyAccount) {
        this.moneyAccount = moneyAccount;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public Customer(Integer customerId, String name, String surname, String phoneNumber, String email, String password, Integer orderId, Double moneyAccount, LocalDateTime registrationDate, Boolean status) {
        this.customerId = customerId;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.orderId = orderId;
        this.moneyAccount = moneyAccount;
        this.registrationDate = registrationDate;
        this.status = status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}