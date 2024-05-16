package management;

import model.Customer;

public interface ManagementService {
    void adminMenu();

    void customerMenu();

    void loginCustomerMenu(Customer customer);

    void mainMenu();
}