package service.impl;

import global.GlobalData;
import management.ManagementService;
import management.impl.ManagementServiceImpl;
import model.Courier;
import model.Customer;
import model.Order;
import service.AdminMenu;
import util.InputUtil;

public class AdminMenuImpl implements AdminMenu {
    private static final ManagementService management = new ManagementServiceImpl();

    @Override
    public void exit() {
        System.exit(-1);
    }

    @Override
    public void back() {
        management.mainMenu();
    }

    @Override
    public void addCourier() {
        String name = InputUtil.inputString("Enter the name: ");
        String phoneNumber = InputUtil.inputString("Enter the phone number: ");
        String vehicleType = InputUtil.inputString("Enter the vehicle type: ");
        String vehiclePlate = InputUtil.inputString("Enter the vehicle plate: ");
        GlobalData.couriers.add(new Courier(GlobalData.couriers.size() + 1, name, phoneNumber, vehicleType, vehiclePlate, null, null, true));
    }

    @Override
    public void trackOrder() {
        LoginCustomerMenuImpl.check();
        for (Order order : GlobalData.orders) {
            System.out.println(order.getOrderId() + ": " + order.getDeliveryStatus());
        }
    }

    @Override
    public void viewCouriers() {
        for (Courier courier : GlobalData.couriers) {
            System.out.println(courier.toString());
        }
    }

    @Override
    public void viewCustomers() {
        for (Customer customer : GlobalData.customers) {
            System.out.println(customer.toString());
        }
    }
}