package edu.dosw.lab.creacionales.reto3.vehicle;

class Airplane extends Vehicle {
    public Airplane(String category) {
        type = "Aéreo";
        model = "Avión";
        this.category = category;
        equipment = "Completo";
        price = switch (category) {
            case "Económico" -> 80000;
            case "Lujo" -> 120000;
            case "Usado" -> 50000;
            default -> 0;
        };
    }
}
