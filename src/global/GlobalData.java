package global;

import model.Courier;
import model.Customer;
import model.Order;
import model.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class GlobalData {
    public static List<Courier> couriers = new ArrayList<>();
    public static List<Customer> customers = new ArrayList<>();
    public static List<Order> orders = new ArrayList<>();
    public static List<Restaurant> restaurants = new ArrayList<>();
    public static final String adminUsername = "root";
    public static final String adminPassword = "12345";
    public static Restaurant restaurant = Restaurant.getInstance();
}