package edu.dosw.lab.estructurales.reto2;

public class Bread implements Ingredient {
    private final String name;
    private final double price;

    public Bread(String name) {
        this.name = name;
        this.price = 3000;
    }

    @Override
    public String getName() {
        return "Pan " + name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
