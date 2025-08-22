package edu.dosw.lab.estructurales.reto2;

import java.util.*;
import java.util.stream.IntStream;

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

        IntStream.range(0, menu.size()).forEach(i -> {
            Ingredient ing = menu.get(i);
            if(i != menu.size()-1){
                System.out.println((i + 1) + ". " + ing.getName() + " ($" + ing.getPrice() + ")");
            }
            else{
                System.out.println("8. Agregar un nuevo ingrediente");
            }
        });

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] selections = input.split(",");

        long count8 = Arrays.stream(selections)
                .map(String::trim)
                .filter(s -> s.equals("8"))
                .count();

        if (count8 > 0) {
            IntStream.range(0, (int) count8).forEach(i -> {
                System.out.println("Ingrese el nombre del nuevo ingrediente:");
                String nameInput = scanner.nextLine();
                Ingredient extra = menu.get(menu.size() - 1);
                if(extra instanceof Extra){
                    Extra e = (Extra) extra;
                    e.setName(nameInput);
                    System.out.println("Ingrese el precio del ingrediente: ");
                    String priceInput = scanner.nextLine();
                    e.setPrice(Double.parseDouble(priceInput));
                }
            });
        }

        Burger burger = new Burger();
        Arrays.stream(selections)
                .map(String::trim)
                .forEach(sel -> {
                    try {
                        int index = Integer.parseInt(sel) - 1;
                        if (index >= 0 && index < menu.size()) {
                            burger.addIngredient(menu.get(index));
                        }
                    } catch (NumberFormatException ignored) {}
                });

        burger.printBurger();
    }
}