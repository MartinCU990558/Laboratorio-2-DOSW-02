package main.java.edu.dosw.lab.creacionales.reto3;

public class Vehicle {
    private final String name;
    private final String type;
    private final Category category;
    private final double baseSpeed;
    private final double basePrice;
    private final String baseEquipment;

    public Vehicle(String name, Category category, Type type, double baseSpeed, double basePrice, String baseEquipment) {
        this.name = name;
        this.type = type.getName();
        this.category = category;
        this.baseSpeed = baseSpeed;
        this.basePrice = basePrice;
        this.baseEquipment = baseEquipment;
    }

    public String getType() {
        return type;
    }

    public double getBaseSpeed() {
        return baseSpeed;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getBaseEquipment() {
        return baseEquipment;
    }

    public String getCategory() {
        return category.getName();
    }
}
