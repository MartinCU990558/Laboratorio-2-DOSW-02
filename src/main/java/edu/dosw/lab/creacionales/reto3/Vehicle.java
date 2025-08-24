package main.java.edu.dosw.lab.creacionales.reto3;

public class Vehicle {
    private final String type;
    private final double baseSpeed;
    private final double basePrice;
    private final String baseEquipment;

    public Vehicle(String name, double baseSpeed, double basePrice, String baseEquipment) {
        this.type = name;
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
}
