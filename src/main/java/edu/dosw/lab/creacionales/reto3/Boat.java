package main.java.edu.dosw.lab.creacionales.reto3;

public class Boat extends Vehicle{
    public Boat(Category categoria) {
        super("Barco",
        50 * categoria.getSpeedMultiplier(),
        8000000 * categoria.getPriceMultiplier(),
        "Set de flotantes "+categoria.getEquipment());
    }
}
