package main.java.edu.dosw.lab.creacionales.reto3;

public class Model {
    private final String name;
    private final double baseSpeed;
    private final double basePrice;
    private final String equipment;

    public Model(String name, double baseSpeed, double basePrice, String equipment) {
        this.name = name;
        this.baseSpeed = baseSpeed;
        this.basePrice = basePrice;
        this.equipment = equipment;
    }

    public String getName() {
        return name;
    }

    public double getBaseSpeed() {
        return baseSpeed;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getEquipment() {
        return equipment;
    }
}
