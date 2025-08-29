package edu.dosw.lab.creacionales.reto3.vehicle;

class JetSki extends Vehicle {
    public JetSki(String category) {
        type = "Acuático";
        model = "Jet Ski";
        this.category = category;
        equipment = "Deportivo";
        price = switch (category) {
            case "Económico" -> 8000;
            case "Lujo" -> 20000;
            case "Usado" -> 5000;
            default -> 0;
        };
    }
}
