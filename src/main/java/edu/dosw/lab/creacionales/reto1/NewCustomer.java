package edu.dosw.lab.creacionales.reto1;

public class NewCustomer extends Customer {
    public NewCustomer(String name) {
        super(name);
    }

    @Override
    public double getDiscountRate() {
        return 0.05;
    }
}