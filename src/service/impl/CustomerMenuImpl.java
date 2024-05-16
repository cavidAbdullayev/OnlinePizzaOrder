package service.impl;

import enums.ErrorEnum;
import errors.GeneralException;
import global.GlobalData;
import management.ManagementService;
import management.impl.ManagementServiceImpl;
import model.Customer;
import service.CustomerMenu;
import util.InputUtil;

import java.time.LocalDateTime;
import java.util.Optional;

public class CustomerMenuImpl implements CustomerMenu {
    private static final ManagementService managementService = new ManagementServiceImpl();

    @Override
    public void exit() {
        System.exit(-1);
    }

    @Override
    public void login() {
        String name = InputUtil.inputString("Enter the name: ");
        String surname = InputUtil.inputString("Enter the surname: ");
        String phoneNumber = InputUtil.inputString("Enter the phone number: ");
        String email = InputUtil.inputString("Enter the email: ");
        Optional<Customer> customer = GlobalData.customers.stream().filter(customer1 -> customer1.getEmail().equals(email)).findFirst();
        if (customer.isPresent())
            throw new GeneralException(ErrorEnum.USER_EXISTS);
        String password = InputUtil.inputString("Enter the password: ");
        Double moneyAccount = InputUtil.inputDouble("Enter the money: ");
        GlobalData.customers.add(new Customer(GlobalData.customers.size() + 1, name, surname, phoneNumber, email, password, null, moneyAccount, LocalDateTime.now(), true));
    }

    @Override
    public void signUp() {
        String username = InputUtil.inputString("Enter the username: ");
        String password = InputUtil.inputString("Enter the password: ");
        Optional<Customer> customer = GlobalData.customers.stream().filter(customer1 -> customer1.getEmail().equals(username) &&
                customer1.getPassword().equals(password)).findFirst();
        if (customer.isEmpty())
            throw new GeneralException(ErrorEnum.USER_NOT_EXISTS);
        managementService.loginCustomerMenu(customer.get());
    }

    @Override
    public void back() {
        managementService.mainMenu();
    }
}