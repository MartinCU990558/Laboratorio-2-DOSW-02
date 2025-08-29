package main.java.edu.dosw.lab.creacionales.reto3;

public class TypeFactory {
    public static Type createType(String type) {
        switch (type) {
            case "1": return new Type("Tierra", 1, 1);
            case "2": return new Type("Acuático", 2, 2);
            case "3": return new Type("Aéreo", 3, 2.5);
            default: return null;
        }
    }
}
