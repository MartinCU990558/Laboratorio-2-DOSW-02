package edu.dosw.lab.estructurales.reto2;

public class Vegetable implements Ingredient {
    private final String name;
    private final double price;

    public Vegetable(String name) {
        this.name = name;
        this.price = 2000;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

