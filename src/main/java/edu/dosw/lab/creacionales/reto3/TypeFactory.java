package main.java.edu.dosw.lab.creacionales.reto3;

public class TypeFactory {
    public static Type createModel(String type) {
        switch (type) {
            case "1":
                return new Type("Terrestrial", 1, 1);
            case "2":
                return new Type("Aquatic", 1.5, 2);
            case "3":
                return new Type("Aircraft", 2, 3);
            default:
                throw new IllegalArgumentException("Invalid vehicle type option: " + type);
        }
    }
}
