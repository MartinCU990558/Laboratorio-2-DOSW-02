package edu.dosw.lab.creacionales.reto3.factory;

import edu.dosw.lab.creacionales.reto3.vehicle.*;

public class WaterVehicleFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle(int modelOption, String category) {
        return switch (modelOption) {
            case 1 -> new Boat(category);
            case 2 -> new Sailboat(category);
            case 3 -> new JetSki(category);
            default -> throw new IllegalArgumentException("Modelo inválido para Acuático");
        };
    }
}
