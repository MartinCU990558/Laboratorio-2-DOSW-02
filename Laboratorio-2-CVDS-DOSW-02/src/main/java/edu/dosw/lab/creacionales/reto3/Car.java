package edu.dosw.lab.creacionales.reto3;
public class Car extends AbstractVehicle {
    public Car(Category category) {
        super("Auto", category);
        this.baseSpeed = 200.0;
        this.baseComfort = 5;
        this.basePrice = 30000.0;
        this.baseEquipment = "4 ruedas, Motor gasolina, Aire acondicionado";
    }
}