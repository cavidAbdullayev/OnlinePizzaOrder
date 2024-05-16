package management.impl;

import enums.ErrorEnum;
import errors.GeneralException;
import management.ManagementService;
import model.Customer;
import service.AdminMenu;
import service.CustomerMenu;
import service.LoginCustomerMenu;
import service.MenuService;
import service.impl.AdminMenuImpl;
import service.impl.CustomerMenuImpl;
import service.impl.LoginCustomerMenuImpl;
import service.impl.MenuServiceImpl;
import util.MenuUtil;

public class ManagementServiceImpl implements ManagementService {
    private static final AdminMenu adminMenu = new AdminMenuImpl();
    private static final CustomerMenu customerMenu = new CustomerMenuImpl();
    private static final LoginCustomerMenu loginCustomerMenu = new LoginCustomerMenuImpl();
    private static final MenuService menuService = new MenuServiceImpl();

    @Override
    public void adminMenu() {
        Byte option = MenuUtil.adminMenu();
        switch (option) {
            case 0 -> adminMenu.exit();
            case 1 -> adminMenu.back();
            case 2 -> adminMenu.addCourier();
            case 3 -> adminMenu.trackOrder();
            case 4 -> adminMenu.viewCouriers();
            case 5 -> adminMenu.viewCustomers();
            default -> throw new GeneralException(ErrorEnum.INVALID_INPUT);
        }
    }

    @Override
    public void customerMenu() {
        Byte option = MenuUtil.customerMenu();
        switch (option) {
            case 0 -> customerMenu.exit();
            case 1 -> customerMenu.login();
            case 2 -> customerMenu.signUp();
            case 3 -> customerMenu.back();
            default -> throw new GeneralException(ErrorEnum.INVALID_INPUT);
        }
    }

    @Override
    public void loginCustomerMenu(Customer customer) {
        Byte option = MenuUtil.loginCustomerMenu();
        switch (option) {
            case 0 -> loginCustomerMenu.exit();
            case 1 -> loginCustomerMenu.back();
            case 2 -> loginCustomerMenu.placeOrder(customer);
            case 3 -> adminMenu.trackOrder();
            case 4 -> customerMenu.back();
            default -> throw new GeneralException(ErrorEnum.INVALID_INPUT);
        }
    }

    @Override
    public void mainMenu() {
        while (true) {
            try {
                while (true) {
                    Byte option = MenuUtil.mainMenu();
                    switch (option) {
                        case 0 -> menuService.exit();
                        case 1 -> menuService.admin();
                        case 2 -> menuService.customer();
                        default -> throw new GeneralException(ErrorEnum.INVALID_INPUT);
                    }
                }
            } catch (GeneralException exception) {
                System.err.println(exception.getMessage());
            }
        }
    }
}