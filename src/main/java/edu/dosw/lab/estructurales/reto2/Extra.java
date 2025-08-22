package edu.dosw.lab.estructurales.reto2;

public class Extra implements Ingredient{
    private String name;
    private double price;

    public Extra() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
