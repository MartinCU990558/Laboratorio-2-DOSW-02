package main.java.edu.dosw.lab.creacionales.reto3;

public class VehicleFactory {

    public Vehicle createVehicle(String type, Category categoria) {
        switch (type) {
            case "Bike":
                return new Bike(categoria);
            case "Airplane":
                return new Airplane(categoria);
            case "Car":
                return new Car(categoria);
            case "Boat":
                return new Boat(categoria);
            default:
                throw new IllegalArgumentException("Invalid vehicle type: " + type);
        }
    }
}
