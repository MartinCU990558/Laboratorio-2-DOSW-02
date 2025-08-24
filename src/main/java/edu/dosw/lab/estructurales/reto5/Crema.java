package main.java.edu.dosw.lab.estructurales.reto5;

public class Crema implements Coffee {
    private Coffee coffee;
    public Crema(Coffee coffee) {
        this.coffee = coffee;
    }

    public double getPrice() {
        return coffee.getPrice() + 1200;
    }

    public String getDescription() {
        return coffee.getDescription() + "+ Crema";
    }
}
