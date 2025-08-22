package main.java.edu.dosw.lab.Laboratorio_2_CVDS_DOSW_02.reto1;

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
