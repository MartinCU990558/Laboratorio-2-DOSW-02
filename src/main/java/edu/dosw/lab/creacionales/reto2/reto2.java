package main.java.edu.dosw.lab.creacionales.reto2;

import java.util.Scanner;

public class reto2 {
    private static String[] availableIngredients = new String[] {"pan", "carne", "queso", "lechuga", "salsa"};
    public static void run() {
        IngredientFactory ingredientFactory = new IngredientFactory();

        Scanner input = new Scanner(System.in);
        String entry = input.nextLine();
        
        while (!entry.equals("")) {
            Ingredient ingredient = ingredientFactory.createIngredient(entry);
        }

    }
}
