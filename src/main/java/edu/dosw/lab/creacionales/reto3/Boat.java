package main.java.edu.dosw.lab.creacionales.reto3;

public class Boat extends Vehicle{
    public Boat(Category categoria, Type type) {
        super("Barco",
        categoria,
        type,
        50 * categoria.getSpeedMultiplier()*type.getSpeedMultiplier(),
        8000000 * categoria.getPriceMultiplier()*type.getPriceMultiplier(),
        "Set de flotantes "+categoria.getEquipment());
    }
}
