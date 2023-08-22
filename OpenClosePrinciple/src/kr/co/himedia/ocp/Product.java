package kr.co.himedia.ocp;

public class Product{

    private static final int MINIMUM_PRICE = 30000;
    private String name;
    private int price;
    private String option;

    public Product(String name, int price, String option) {
        this.name = name;
        this.price = price;
        this.option = option;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getOption() {
        return option;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", option='" + option + '\'' +
                '}';
    }
}
