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
        System.out.println("Tu hamburguesa contiene:");
        ingredients.forEach(i -> System.out.println("- " + i.getName() + " ($" + i.getPrice() + ")"));
        System.out.println("Precio Total: $" + getPrice());
        System.out.println("-------------------------------------------");
        System.out.println("¡Disfrute su hamburguesa!");
    }
}

