package main.java.edu.dosw.lab.creacionales.reto1;

public class Product {
    private String name;
    private int price;

    public Product(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
