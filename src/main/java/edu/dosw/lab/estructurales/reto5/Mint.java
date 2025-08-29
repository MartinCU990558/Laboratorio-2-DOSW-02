package main.java.edu.dosw.lab.estructurales.reto5;

public class Mint implements Coffee {
    private Coffee coffee;

    public Mint(Coffee coffee) {
        this.coffee = coffee;
    }

    public double getPrice() {
        return coffee.getPrice() + 1300;
    }

    public String getDescription() {
        return coffee.getDescription() + "+ Menta";
    }
}
