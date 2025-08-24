package edu.dosw.lab.creacionales.reto3;
public class VehicleFactory {
    public static Vehicle createVehicle(VehicleType type, CategoryType catType) {
        Category category = switch (catType) {
            case ECONOMIC -> new EconomicCategory();
            case LUXURY -> new LuxuryCategory();
            case USED -> new UsedCategory();
        };

        return switch (type) {
            case CAR -> new Car(category);
            case BIKE -> new Bike(category);
            case MOTORCYCLE -> new Motorcycle(category);
            case BOAT -> new Boat(category);
            case SAILBOAT -> new Sailboat(category);
            case JET_SKI -> new JetSki(category);
            case PLANE -> new Plane(category);
            case SMALL_PLANE -> new SmallPlane(category);
            case HELICOPTER -> new Helicopter(category);
        };
    }
}
