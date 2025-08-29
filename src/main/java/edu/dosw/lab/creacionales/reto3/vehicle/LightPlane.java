package edu.dosw.lab.creacionales.reto3.vehicle;

class LightPlane extends Vehicle {
    public LightPlane(String category) {
        type = "Aéreo";
        model = "Avioneta";
        this.category = category;
        equipment = "Ligero";
        price = switch (category) {
            case "Económico" -> 40000;
            case "Lujo" -> 70000;
            case "Usado" -> 25000;
            default -> 0;
        };
    }
}
