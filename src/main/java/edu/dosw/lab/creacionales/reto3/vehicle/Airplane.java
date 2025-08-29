package edu.dosw.lab.creacionales.reto3.vehicle;

public class Airplane extends Vehicle {
    public Airplane(String category) {
        type = "Aéreo";
        model = "Avión";
        this.category = category;
        equipment = "Instrumentos básicos de vuelo";
        price = switch (category) {
            case "Económico" -> 80000;
            case "Lujo" -> 120000;
            case "Usado" -> 50000;
            default -> 0;
        };
    }
}
