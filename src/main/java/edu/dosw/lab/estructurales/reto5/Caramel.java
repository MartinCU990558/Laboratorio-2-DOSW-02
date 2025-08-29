package main.java.edu.dosw.lab.estructurales.reto5;

public class Caramel implements Coffee {
    private Coffee coffee;

    public Caramel(Coffee coffee) {
        this.coffee = coffee;
    }

    public double getPrice() {
        return coffee.getPrice() + 1200;
    }

    public String getDescription() {
        return coffee.getDescription() + "+ Caramel";
    }
}
