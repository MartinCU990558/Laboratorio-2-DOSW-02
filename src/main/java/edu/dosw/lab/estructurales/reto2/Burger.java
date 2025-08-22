package edu.dosw.lab.estructurales.reto2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Burger implements Ingredient {
    private final List<Ingredient> ingredients = new ArrayList<>();

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    @Override
    public String getName() {
        return "Hamburguesa con: " +
                ingredients.stream()
                        .map(Ingredient::getName)
                        .collect(Collectors.joining(", "));
    }

    @Override
    public double getPrice() {
        return ingredients.stream()
                .mapToDouble(Ingredient::getPrice)
                .sum();
    }

    public void printBurger() {
        System.out.println("------HAMBURGUESA PERSONALIZADA-----");
        System.out.print("Ingredientes seleccionados: ");
        String ingredientsList = ingredients.stream()
                .map(Ingredient::getName)
                .collect(java.util.stream.Collectors.joining(", "));
        System.out.println(ingredientsList);
        System.out.println("Precio Total: $" + getPrice());
        System.out.println("-------------------------------------------");
        System.out.println("¡Disfrute su hamburguesa!");
    }
}

