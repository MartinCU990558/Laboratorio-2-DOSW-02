package edu.dosw.lab.creacionales.reto3;
public class Helicopter extends AbstractVehicle {
    public Helicopter(Category category) {
        super("Helicóptero", category);
        this.baseSpeed = 250.0;
        this.baseComfort = 7;
        this.basePrice = 1000000.0;
        this.baseEquipment = "Rotores, Cabina, Aire acondicionado";
    }
}
