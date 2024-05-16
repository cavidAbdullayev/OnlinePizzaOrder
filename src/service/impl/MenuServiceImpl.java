package service.impl;

import global.GlobalData;
import management.ManagementService;
import management.impl.ManagementServiceImpl;
import service.MenuService;
import util.InputUtil;

public class MenuServiceImpl implements MenuService {
    private static final ManagementService management = new ManagementServiceImpl();

    @Override
    public void exit() {
        System.exit(-1);
    }

    @Override
    public void admin() {
        String username = InputUtil.inputString("Enter the username: ");
        String password = InputUtil.inputString("Enter the password: ");
        if (username.equals(GlobalData.adminUsername) && password.equals(GlobalData.adminPassword)) {
            management.adminMenu();
        } else
            System.err.println("Invalid username or password!");
    }

    @Override
    public void customer() {
        management.customerMenu();
    }
}