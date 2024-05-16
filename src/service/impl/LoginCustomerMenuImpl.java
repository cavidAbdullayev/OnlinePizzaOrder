package service.impl;

import enums.ErrorEnum;
import enums.Pizzas;
import enums.Sous;
import enums.Value;
import errors.GeneralException;
import global.GlobalData;
import management.ManagementService;
import management.impl.ManagementServiceImpl;
import model.Courier;
import model.Customer;
import model.Order;
import service.LoginCustomerMenu;
import util.MenuUtil;

import java.time.LocalDateTime;

public class LoginCustomerMenuImpl implements LoginCustomerMenu {
    private static final ManagementService managementService = new ManagementServiceImpl();

    @Override
    public void exit() {
        System.exit(-1);
    }

    @Override
    public void back() {
        managementService.mainMenu();
    }

    @Override
    public void placeOrder(Customer customer) {
        check();
        Double amount = 0.0;
        Byte pizzaOption = MenuUtil.pizzaMenu();
        switch (pizzaOption) {
            case 1 -> amount += Pizzas.ITALIANO.getPrice();
            case 2 -> amount += Pizzas.AMERICANO.getPrice();
            case 3 -> amount += Pizzas.MEXICANO.getPrice();
            case 4 -> amount += Pizzas.CHICKEN_KICKERS.getPrice();
            case 5 -> amount += Pizzas.MARGHERITA.getPrice();
            case 6 -> amount += Pizzas.PEPPERONI.getPrice();
        }
        Byte sizeOption = MenuUtil.sizeMenu();
        switch (sizeOption) {
            case 1 -> amount += Value.SMALL.getExPrice();
            case 2 -> amount += Value.MEDIUM.getExPrice();
            case 3 -> amount += Value.BIG.getExPrice();
        }
        Double pizzaAmount = amount;
        Byte sousOption = MenuUtil.sousMenu();
        switch (sousOption) {
            case 1 -> amount += Sous.KETCHUP.getPrice();
            case 2 -> amount += Sous.BARBECUE.getPrice();
            case 3 -> amount += Sous.MAYONNAISE.getPrice();
            case 4 -> amount += 0.0;
        }

        System.out.println("Order payment: " + amount);
        Byte paymentOption = MenuUtil.paymentMenu();
        switch (paymentOption) {
            case 1 -> {
                if (amount > customer.getMoneyAccount())
                    throw new GeneralException(ErrorEnum.NOT_ENOUGH_AMOUNT);
                customer.setMoneyAccount(customer.getMoneyAccount() - amount);
                System.out.println("Order successfully");
                Courier courier = GlobalData.couriers.stream()
                        .filter(Courier::getAvailabilityStatus)
                        .findFirst()
                        .orElseThrow(() ->
                                new GeneralException(ErrorEnum.NOT_FREE_COURIER));
                courier.setAvailabilityStatus(false);
                Order order = new Order(GlobalData.orders.size() + 1,
                        Pizzas.getById(pizzaOption),
                        Value.getSizeById(sizeOption),
                        Sous.getById(sousOption),
                        amount,
                        LocalDateTime.now().plusHours(1),
                        customer,
                        courier,
                        false);
                GlobalData.orders.add(order);
                GlobalData.restaurant.setTotalAmount(GlobalData.restaurant.getTotalAmount() + amount);
                GlobalData.restaurant.getOrders().add(order);
                String cashReceipt = "Start Date: "
                        + order.getDeliveryTime().minusHours(1) +
                        "\nEnd Date: " + order.getDeliveryTime() +
                        "\nUsername: " + customer.getEmail() +
                        " " + Pizzas.getById(pizzaOption) + " " +
                        Value.getSizeById(sizeOption) + " " + pizzaAmount +
                        "\n" + Sous.getById(sousOption) + " 0.7" +
                        "\nCourier name: " + courier.getName() +
                        "\nCourier Phone Number: " + courier.getPhoneNumber() +
                        "\nCourier Vehicle Type: " + courier.getVehicleType() +
                        "\nCourier Vehicle Plate: " + courier.getVehiclePlate() +
                        "\nCash: " + amount;
                System.out.println(cashReceipt);
            }
            case 2 -> managementService.mainMenu();
        }
    }

    public static void check() {
        GlobalData.orders.stream().filter(order1 ->
                order1.getDeliveryTime().getSecond() - LocalDateTime.now().getSecond() < 0).forEach(order1 ->
                order1.getCourier().setAvailabilityStatus(true));
    }
}