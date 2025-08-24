package main.java.edu.dosw.lab.estructurales.reto5;

public class Chocolate implements Coffee {
    private Coffee coffee;

    public Chocolate(Coffee coffee) {
        this.coffee = coffee;
    }

    public double getPrice() {
        return coffee.getPrice() + 1500;
    }

    public String getDescription() {
        return coffee.getDescription() + "+ Chocolate";
    }
}
