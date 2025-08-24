package main.java.edu.dosw.lab.creacionales.reto3;

public class Category {
    private final String name;
    private final double speedMultiplier;
    private final double priceMultiplier;
    private final String equipment;

    public Category(String name, double speedMultiplier, double priceMultiplier, String equipment) {
        this.name = name;
        this.speedMultiplier = speedMultiplier;
        this.priceMultiplier = priceMultiplier;
        this.equipment = equipment;
    }

    public String getName() {
        return name;
    }

    public double getSpeedMultiplier() {
        return speedMultiplier;
    }

    public double getPriceMultiplier() {
        return priceMultiplier;
    }

    public String getEquipment() {
        return equipment;
    }
}
