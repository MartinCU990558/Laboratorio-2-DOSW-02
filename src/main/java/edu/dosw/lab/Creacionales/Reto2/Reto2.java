package edu.dosw.lab.Creacionales.Reto2;
import java.util.*;

public class Reto2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HamburgerBuilder builder = new HamburgerBuilder();

        List<Ingredient> menu = Arrays.asList(
                new Ingredient("Pan", 3000),
                new Ingredient("Carne", 10000),
                new Ingredient("Queso", 5000),
                new Ingredient("Lechuga", 2000),
                new Ingredient("Tomate", 2000),
                new Ingredient("Salsa especial", 3000)
        );

        System.out.println("Seleccione ingredientes para su hamburguesa:");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + ". " + menu.get(i).getName() +
                    " ($" + String.format("%.0f", menu.get(i).getPrice()) + ")");
        }
        System.out.println("7. Agregar un nuevo ingrediente");

        System.out.print("Ingrese los números separados por coma: ");
        String[] selections = scanner.nextLine().split(",");

        for (String selection : selections) {
            int optionNumber = Integer.parseInt(selection.trim());
            if (optionNumber >= 1 && optionNumber <= 6) {
                Ingredient selectedIngredient = menu.get(optionNumber - 1);
                builder.addIngredient(selectedIngredient.getName(), selectedIngredient.getPrice());
            } else if (optionNumber == 7) {
                System.out.print("Ingrese el nombre del nuevo ingrediente: ");
                String newIngredientName = scanner.nextLine();
                System.out.print("Ingrese el precio del ingrediente: ");
                double newIngredientPrice = scanner.nextDouble();
                scanner.nextLine();
                builder.addIngredient(newIngredientName, newIngredientPrice);
            }
        }

        Hamburger hamburger = builder.build();

        System.out.println();
        System.out.println(hamburger);

        scanner.close();
    }
}