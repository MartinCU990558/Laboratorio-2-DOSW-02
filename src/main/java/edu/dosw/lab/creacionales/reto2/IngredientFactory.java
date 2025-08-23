package main.java.edu.dosw.lab.creacionales.reto2;

import java.util.Scanner;

public class IngredientFactory {

    public Ingredient createIngredient(String type) {
        switch (type.toLowerCase()) {
            case "1":
                return new Pan(3000);
            case "2":
                return new Carne(5000);
            case "3":
                return new Queso(1500);
            case "4":
                return new Lechuga(1000);
            case "5":
                return new Tomate(1000);
            case "6":
                return new Salsa(500);
            default:
                return IngredientFactory.createCustomIngredient(type);
        }
    }

    private static Ingredient createCustomIngredient(String type) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio del ingrediente: ");
        double price = scanner.nextDouble();
        return new Ingredient(type, price);
    }
}
