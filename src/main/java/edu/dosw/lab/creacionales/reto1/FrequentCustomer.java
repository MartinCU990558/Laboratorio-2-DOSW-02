package edu.dosw.lab.creacionales.reto1;

public class FrequentCustomer extends Customer {
    public FrequentCustomer(String name) {
        super(name);
    }

    @Override
    public double getDiscountRate() {
        return 0.10;
    }
}