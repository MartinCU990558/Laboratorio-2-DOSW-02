package edu.dosw.lab.creacionales.reto3.factory;

import edu.dosw.lab.creacionales.reto3.vehicle.Vehicle;

public abstract class VehicleFactory {
    public abstract Vehicle createVehicle(int modelOption, String category);
}
