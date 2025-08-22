package edu.dosw.lab.creacionales.reto1;

public abstract class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getDiscountRate();
}