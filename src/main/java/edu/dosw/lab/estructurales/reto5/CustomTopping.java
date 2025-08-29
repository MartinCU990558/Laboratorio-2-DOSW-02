package main.java.edu.dosw.lab.estructurales.reto5;

public class CustomTopping implements Coffee {
    private final Coffee coffee;
    private final String name;
    private final double price;

    public CustomTopping(Coffee coffee, String name, double price) {
        this.coffee = coffee;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return coffee.getPrice() + price;
    }

    public String getDescription() {
        return coffee.getDescription() + " + "+ name;
    }

}
