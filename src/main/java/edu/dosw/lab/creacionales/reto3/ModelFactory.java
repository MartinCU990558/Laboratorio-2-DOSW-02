package main.java.edu.dosw.lab.creacionales.reto3;

public class ModelFactory {
    public static Model createModel(String type, String model) {
        switch (type) {
            case "1":
                switch (model) {
                    case "1": return new Model("Auto", 80, 60000000, "Aire Acondicionado");
                    case "2": return new Model("Moto", 80, 10000000, "Casco");
                    case "3": return new Model("Bicicleta", 20, 1000000, "Campanilla");
                }
            case "2":
                switch (model) {
                    case "1": return new Model("Lancha", 50, 20000000, "Kit herramientas");
                    case "2": return new Model("Velero", 30, 50000000, "Kit de seguridad");
                    case "3": return new Model("JetSki", 45, 5000000, "Flotador");
                }
            case "3":
                switch (model) {
                    case "1": return new Model("Avion", 800, 70000000, "Instrumentos basicos de vuelo.");
                    case "2": return new Model("Avioneta", 150, 30000000, "Instrumentos basicos de vuelo.");
                    case "3": return new Model("Helicoptero", 200, 50000000, "Instrumentos basicos de vuelo.");
                }
            default: return null;
        }
    }
}
