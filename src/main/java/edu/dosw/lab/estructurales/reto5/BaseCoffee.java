package main.java.edu.dosw.lab.estructurales.reto5;

public class BaseCoffee implements Coffee{
    private double price;
    private String description;

    public BaseCoffee() {
        this.price = 4000;
        this.description = "Cafe base";
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

}
