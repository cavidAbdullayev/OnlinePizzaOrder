import management.ManagementService;
import management.impl.ManagementServiceImpl;
import service.MenuService;
import service.impl.MenuServiceImpl;

public class Main {
    public static void main(String[] args) {

        ManagementService managementService=new ManagementServiceImpl();
        managementService.mainMenu();
    }
}