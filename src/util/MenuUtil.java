package util;

public class MenuUtil {
    public static Byte mainMenu() {
        return InputUtil.inputByte("""
                [0] - > Exit
                [1] - > Admin
                [2] - > Customer
                """);
    }

    public static Byte adminMenu() {
        return InputUtil.inputByte("""
                [0] - > Exit\s
                [1] - > Back\s
                [2] - > Add Courier\s
                [3] - > Track Orders\s
                [4] - > View Couriers\s
                [5] - > View Customers
                """);
    }

    public static Byte customerMenu() {
        return InputUtil.inputByte("""
                  [0] - > Exit\s
                  [1] - > Login\s
                  [2] - > Sing up
                  [3] - > Back\s
                """);
    }

    public static Byte loginCustomerMenu() {
        return InputUtil.inputByte("""
                [0] - > Exit\s
                 [1] - > Back\s
                 [2] - > Place Order\s
                 [3] - > Track Orders\s
                 [4] - > Cancel Order
                """);
    }

    public static Byte pizzaMenu() {
        return InputUtil.inputByte("""
                [1] -> Italiano \s
                [2] -> Americano
                [3] -> Mexicano
                [4] -> Chicken Kickers
                [5] -> Margherita
                """);
    }

    public static Byte sousMenu() {
        return InputUtil.inputByte("""
                [1] -> Ketcup\s
                [2] -> Barbecu
                [3] -> Mayonnaise
                [4] -> Cancel
                """);
    }
    public static Byte sizeMenu() {
        return InputUtil.inputByte("""
                [1] -> Small \s
                [2] -> Medium
                [3] -> Large
                """);
    }

    public static Byte paymentMenu() {
        return InputUtil.inputByte("""
                [1] - > Make the payment
                [2] - > Cancel order
                """);
    }
}