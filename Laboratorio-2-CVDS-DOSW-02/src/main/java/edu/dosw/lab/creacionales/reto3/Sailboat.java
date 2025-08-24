package edu.dosw.lab.creacionales.reto3;
public class Sailboat extends AbstractVehicle {
    public Sailboat(Category category) {
        super("Velero", category);
        this.baseSpeed = 20.0;
        this.baseComfort = 7;
        this.basePrice = 60000.0;
        this.baseEquipment = "Velas, Casco, Cabina básica";
    }
}