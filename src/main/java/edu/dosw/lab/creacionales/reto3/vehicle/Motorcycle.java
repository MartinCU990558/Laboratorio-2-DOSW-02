package edu.dosw.lab.creacionales.reto3.vehicle;

public class Motorcycle extends Vehicle {
    public Motorcycle(String category) {
        type = "Tierra";
        model = "Moto";
        this.category = category;
        equipment = "Estándar";
        price = switch (category) {
            case "Económico" -> 5000;
            case "Lujo" -> 12000;
            case "Usado" -> 3000;
            default -> 0;
        };
    }
}
