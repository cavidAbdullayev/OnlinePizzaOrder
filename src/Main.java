import management.ManagementService;
import management.impl.ManagementServiceImpl;

public class Main {
    public static void main(String[] args) {

        ManagementService managementService=new ManagementServiceImpl();
        managementService.mainMenu();
    }
}