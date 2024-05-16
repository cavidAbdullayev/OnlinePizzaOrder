package service;

import model.Customer;

public interface LoginCustomerMenu {
    void exit();

    void back();

    void placeOrder(Customer customer);
}