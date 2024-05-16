package enums;

public enum Sous {
    KETCHUP(1, "Ketchup", 0.7),
    BARBECUE(2, "Barbecue", 0.7),
    MAYONNAISE(3, "Mayonnaise", 0.7);

    private final String name;
    private final Integer id;
    private final Double price;

    Sous(Integer id, String name, Double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public static String getById(Byte id) {
        return id == 1 ? KETCHUP.name : id == 2 ? BARBECUE.name : MAYONNAISE.name;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Double getPrice() {
        return price;
    }
}