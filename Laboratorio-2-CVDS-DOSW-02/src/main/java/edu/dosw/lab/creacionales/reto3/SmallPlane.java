package edu.dosw.lab.creacionales.reto3;
public class SmallPlane extends AbstractVehicle {
    public SmallPlane(Category category) {
        super("Avioneta", category);
        this.baseSpeed = 300.0;
        this.baseComfort = 6;
        this.basePrice = 500000.0;
        this.baseEquipment = "Hélice, Cabina pequeña";
    }
}