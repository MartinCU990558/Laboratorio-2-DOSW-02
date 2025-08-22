package edu.dosw.lab.estructurales.reto2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Ingredient> menu = new ArrayList<>();
        menu.add(new Bread("pan"));
        menu.add(new Meat("carne"));
        menu.add(new Cheese("queso"));
        menu.add(new Vegetable("lechuga"));
        menu.add(new Vegetable("tomate"));
        menu.add(new Vegetable("cebolla"));
        menu.add(new Sauce("especial"));
        menu.add(new Extra());

        System.out.println("Seleccione ingredientes para su hamburguesa");
        System.out.println("Elige tus ingredientes escribiendo los números separados por coma:");
        for (int i = 0; i < menu.size(); i++) {
            Ingredient ing = menu.get(i);
            System.out.println((i + 1) + ". " + ing.getName() + " ($" + ing.getPrice() + ")");
        }

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] selections = input.split(",");

        Burger burger = new Burger();
        for (String sel : selections) {
            try {
                int index = Integer.parseInt(sel.trim()) - 1;
                if (index >= 0 && index < menu.size()) {
                    burger.addIngredient(menu.get(index));
                }
            } catch (NumberFormatException ignored) {}
        }

        burger.printBurger();
    }
}
