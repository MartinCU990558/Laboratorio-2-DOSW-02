package edu.dosw.lab.Creacionales.Reto2;

import java.util.List;

public class Hamburger {
    private List<Ingredient> ingredients;

    public Hamburger(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public double getTotalPrice() {
        return ingredients.stream()
                .mapToDouble(Ingredient::getPrice)
                .sum();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("--- HAMBURGUESA PERSONALIZADA ---\n");
        sb.append("Ingredientes seleccionados: ");
        sb.append(String.join(", ",
                ingredients.stream().map(Ingredient::getName).toList()));
        sb.append("\nPrecio total: $" + String.format("%.0f", getTotalPrice()));
        sb.append("\n-------------------------------");
        sb.append("\n¡Disfrute su hamburguesa!");
        return sb.toString();
    }
}