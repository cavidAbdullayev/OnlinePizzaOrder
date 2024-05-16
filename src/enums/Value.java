package enums;

public enum Value {
    SMALL(1, "Small", 0.0),
    MEDIUM(2, "Medium", 6.99),
    BIG(3, "Big", 13.99);
    private final Integer id;
    private final String name;
    private final Double exPrice;

    Value(Integer id, String name, Double exPrice) {
        this.id = id;
        this.name = name;
        this.exPrice = exPrice;
    }

    public String getName() {
        return name;
    }

    public Double getExPrice() {
        return exPrice;
    }

    public static String getSizeById(Byte id) {
        return id == 1 ? SMALL.getName() : id == 2 ? MEDIUM.getName() : BIG.getName();
    }
}