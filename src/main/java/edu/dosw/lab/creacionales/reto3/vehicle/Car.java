package edu.dosw.lab.creacionales.reto3.vehicle;

class Car extends Vehicle {
    public Car(String category) {
        type = "Tierra";
        model = "Auto";
        this.category = category;
        equipment = "Básico";
        price = switch (category) {
            case "Económico" -> 20000;
            case "Lujo" -> 40000;
            case "Usado" -> 12000;
            default -> 0;
        };
    }
}
