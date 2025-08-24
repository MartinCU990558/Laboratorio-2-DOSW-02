package edu.dosw.lab.creacionales.reto3;

public class Bike extends AbstractVehicle {
    public Bike(Category category) {
        super("Bicicleta", category);
        this.baseSpeed = 30.0;
        this.baseComfort = 2;
        this.basePrice = 500.0;
        this.baseEquipment = "2 ruedas, Pedales";
    }
}