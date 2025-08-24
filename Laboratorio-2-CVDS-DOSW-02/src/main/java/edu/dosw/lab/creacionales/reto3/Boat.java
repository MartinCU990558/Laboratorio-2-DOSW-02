package edu.dosw.lab.creacionales.reto3;
public class Boat extends AbstractVehicle {
    public Boat(Category category) {
        super("Lancha", category);
        this.baseSpeed = 60.0;
        this.baseComfort = 6;
        this.basePrice = 50000.0;
        this.baseEquipment = "Motor fuera de borda, Casco, Aire acondicionado";
    }
}
