package edu.dosw.lab.creacionales.reto3.factory;

import edu.dosw.lab.creacionales.reto3.vehicle.*;

public class LandVehicleFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle(int modelOption, String category) {
        return switch (modelOption) {
            case 1 -> new Car(category);
            case 2 -> new Bike(category);
            case 3 -> new Motorcycle(category);
            default -> throw new IllegalArgumentException("Modelo inválido para Tierra");
        };
    }
}