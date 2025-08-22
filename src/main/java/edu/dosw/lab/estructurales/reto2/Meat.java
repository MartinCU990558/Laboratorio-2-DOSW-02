package edu.dosw.lab.estructurales.reto2;

public class Meat implements Ingredient {
    private final String name;
    private final double price;

    public Meat(String name) {
        this.name = name;
        this.price = 10000;
    }

    @Override
    public String getName() {
        return "Carne de " + name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
