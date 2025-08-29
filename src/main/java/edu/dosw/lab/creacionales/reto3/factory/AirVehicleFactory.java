package edu.dosw.lab.creacionales.reto3.factory;

import edu.dosw.lab.creacionales.reto3.vehicle.Vehicle;

class AirVehicleFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle(int modelOption, String category) {
        return switch (modelOption) {
            case 1 -> new Airplane(category);
            case 2 -> new LightPlane(category);
            case 3 -> new Helicopter(category);
            default -> throw new IllegalArgumentException("Modelo inválido para Aéreo");
        };
    }
}
