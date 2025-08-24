package edu.dosw.lab.creacionales.reto3;
public class Plane extends AbstractVehicle {
    public Plane(Category category) {
        super("Avión", category);
        this.baseSpeed = 900.0;
        this.baseComfort = 8;
        this.basePrice = 5000000.0;
        this.baseEquipment = "Alas, Motores a reacción, Aire acondicionado";
    }
}
