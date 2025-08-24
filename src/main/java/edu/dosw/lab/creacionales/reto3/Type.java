package main.java.edu.dosw.lab.creacionales.reto3;

public class Type {
    private final String name;
    private final double speedMultiplier;
    private final double priceMultiplier;

    public Type(String type, double speedMultiplier, double priceMultiplier) {
        this.name = type;
        this.speedMultiplier = speedMultiplier;
        this.priceMultiplier = priceMultiplier;
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

}
