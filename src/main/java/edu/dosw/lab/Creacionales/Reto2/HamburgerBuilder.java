package edu.dosw.lab.Creacionales.Reto2;
import java.util.ArrayList;
import java.util.List;

public class HamburgerBuilder {
    private List<Ingredient> ingredients = new ArrayList<>();

    public HamburgerBuilder addIngredient(String name, double price) {
        ingredients.add(new Ingredient(name, price));
        return this;
    }

    public Hamburger build() {
        return new Hamburger(ingredients);
    }
}
