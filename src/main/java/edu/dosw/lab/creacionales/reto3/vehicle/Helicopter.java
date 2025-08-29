package edu.dosw.lab.creacionales.reto3.vehicle;

class Helicopter extends Vehicle {
    public Helicopter(String category) {
        type = "Aéreo";
        model = "Helicóptero";
        this.category = category;
        equipment = "Estándar";
        price = switch (category) {
            case "Económico" -> 60000;
            case "Lujo" -> 100000;
            case "Usado" -> 40000;
            default -> 0;
        };
    }
}
