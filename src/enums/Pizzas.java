package enums;

public enum Pizzas {
    ITALIANO(1, "Italiano", 11.99),
    AMERICANO(2, "Americano", 10.99),
    MEXICANO(3, "Mexicano", 12.99),
    CHICKEN_KICKERS(4, "Chicken Kickers", 9.99),
    MARGHERITA(5, "Margherita", 13.99),
    PEPPERONI(6, "Pepperoni", 14.99);

    Pizzas(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }



    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    private final Integer id;
    private final String name;
    private final Double price;

    public static String getById(Byte id) {
        return id == 1 ? ITALIANO.name : id == 2 ? AMERICANO.name : id == 3 ? MEXICANO.name : id == 4 ? CHICKEN_KICKERS.name :
                id == 5 ? MARGHERITA.name : PEPPERONI.name;
    }
}