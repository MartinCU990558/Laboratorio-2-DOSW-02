package main.java.edu.dosw.lab.creacionales.reto3;

public class ModelFactory {

    public static Vehicle createModel(String type, Category categoria, Type model) {
        switch (type) {
            case "Bike":
                return new Bike(categoria, model);
            case "Airplane":
                return new Airplane(categoria, model);
            case "Car":
                return new Car(categoria, model);
            case "Boat":
                return new Boat(categoria, model);
            default:
                throw new IllegalArgumentException("Invalid vehicle type: " + type);
        }
    }
}
