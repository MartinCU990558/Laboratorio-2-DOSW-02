package edu.dosw.lab.creacionales.reto3.vehicle;

public class Car extends Vehicle {
    public Car(String category) {
        type = "Tierra";
        model = "Auto";
        this.category = category;
        equipment = "Aire acondicionado + GPS";
        price = switch (category) {
            case "Económico" -> 20000;
            case "Lujo" -> 40000;
            case "Usado" -> 12000;
            default -> 0;
        };
    }
}
