package edu.dosw.lab.creacionales.reto3.vehicle;

public class Boat extends Vehicle {
    public Boat(String category) {
        type = "Acuático";
        model = "Lancha";
        this.category = category;
        equipment = "Deportivo";
        price = switch (category) {
            case "Económico" -> 15000;
            case "Lujo" -> 35000;
            case "Usado" -> 8000;
            default -> 0;
        };
    }
}
