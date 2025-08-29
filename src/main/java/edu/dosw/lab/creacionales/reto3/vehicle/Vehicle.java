package edu.dosw.lab.creacionales.reto3.vehicle;

public abstract class Vehicle {
    protected String type;
    protected String category;
    protected String model;
    protected double price;
    protected String equipment;

    public String getType() { return type; }
    public String getCategory() { return category; }
    public String getModel() { return model; }
    public double getPrice() { return price; }
    public String getEquipment() { return equipment; }

    public void showInfo() {
        System.out.println("Tipo: " + type +
                " | Categoría: " + category +
                " | Modelo: " + model +
                " | Precio: $" + price +
                " | Equipamiento: " + equipment);
    }
}
