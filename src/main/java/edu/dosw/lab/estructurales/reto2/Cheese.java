package edu.dosw.lab.estructurales.reto2;

public class Cheese implements Ingredient {
    private final String name;
    private final double price;

    public Cheese(String name) {
        this.name = name;
        this.price = 5000;
    }

    @Override
    public String getName() {
        return "Queso " + name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

