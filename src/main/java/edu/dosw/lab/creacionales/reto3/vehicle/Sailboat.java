package edu.dosw.lab.creacionales.reto3.vehicle;

class Sailboat extends Vehicle {
    public Sailboat(String category) {
        type = "Acuático";
        model = "Velero";
        this.category = category;
        equipment = "Navegación";
        price = switch (category) {
            case "Económico" -> 12000;
            case "Lujo" -> 30000;
            case "Usado" -> 7000;
            default -> 0;
        };
    }
}

