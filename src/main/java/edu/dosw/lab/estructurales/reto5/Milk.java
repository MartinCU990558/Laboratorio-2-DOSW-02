package main.java.edu.dosw.lab.estructurales.reto5;

public class Milk implements Coffee {
    private Coffee coffee;

    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    public double getPrice() {
        return coffee.getPrice() + 1000;
    }

    public String getDescription() {
        return coffee.getDescription() + "+ Leche";
    }
}
