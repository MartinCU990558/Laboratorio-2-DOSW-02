package main.java.edu.dosw.lab.creacionales.reto3;

public class CategoryFactory {
    public static Category createCategory(String category) {
        switch (category) {
            case "1": return new Category("Económico", 1, 1,"");
            case "2": return new Category("Lujo", 2, 1.5, "GPS");
            case "3": return new Category("Usado", 0.5, 0.8, "Caja de herramientas");
            default: return null;
        }
    }
}
