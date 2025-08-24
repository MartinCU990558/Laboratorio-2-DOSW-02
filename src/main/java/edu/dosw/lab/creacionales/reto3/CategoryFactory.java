package main.java.edu.dosw.lab.creacionales.reto3;

public class CategoryFactory {
    public static Category createCategory(String category) {
        switch (category) {
            case "1":
                return new Category("Economico", 1.0, 1.0, "Equipo de mantenimiento");
            case "2":
                return new Category("Lujo", 2.0, 2.0, "GPS");
            case "3":
                return new Category("Usado", 0.5, 0.5, null);
            default:
                throw new IllegalArgumentException("Invalid category: " + category);
        }
    }
}
