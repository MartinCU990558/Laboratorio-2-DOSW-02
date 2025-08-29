package edu.dosw.lab.creacionales.reto3.vehicle;

public class Bike extends Vehicle {
    public Bike(String category) {
        type = "Tierra";
        model = "Bicicleta";
        this.category = category;
        equipment = "Ligero";
        price = switch (category) {
            case "Económico" -> 500;
            case "Lujo" -> 1200;
            case "Usado" -> 300;
            default -> 0;
        };
    }
}
