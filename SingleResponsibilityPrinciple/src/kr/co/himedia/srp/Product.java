package kr.co.himedia.srp;

public class Product {
    private String name;
    private int price;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void updatePrice(int price){
        this.price = price;
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

