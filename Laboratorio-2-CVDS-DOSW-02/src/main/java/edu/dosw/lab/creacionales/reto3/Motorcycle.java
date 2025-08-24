package edu.dosw.lab.creacionales.reto3;
public class Motorcycle extends AbstractVehicle {
    public Motorcycle(Category category) {
        super("Moto", category);
        this.baseSpeed = 180.0;
        this.baseComfort = 4;
        this.basePrice = 8000.0;
        this.baseEquipment = "2 ruedas, Motor, Frenos de disco";
    }
}
