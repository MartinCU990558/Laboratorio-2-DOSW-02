package edu.dosw.lab.estructurales.reto2;

public class Sauce implements Ingredient {
    private final String name;
    private final double price;

    public Sauce(String name) {
        this.name = name;
        this.price = 3000;
    }

    @Override
    public String getName() {
        return "Salsa de " + name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

