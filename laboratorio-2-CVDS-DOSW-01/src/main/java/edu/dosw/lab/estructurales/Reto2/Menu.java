package edu.dosw.lab.estructurales.Reto2;

import java.util.List;

class Menu {
    private static final List<Ingrediente> INGREDIENTES_BASE = List.of(
            new Ingrediente("Pan", 3000),
            new Ingrediente("Carne", 10000),
            new Ingrediente("Queso", 5000),
            new Ingrediente("Lechuga", 2000),
            new Ingrediente("Tomate", 2000),
            new Ingrediente("Salsa especial", 3000)
    );

    public void mostrarMenu() {
        System.out.println("\nSeleccione ingredientes para su hamburguesa:");
        for (int i = 0; i < INGREDIENTES_BASE.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, INGREDIENTES_BASE.get(i));
        }
        System.out.println((INGREDIENTES_BASE.size() + 1) + ". Agregar un nuevo ingrediente");
        System.out.print("Ingrese los números separados por coma: ");
    }

    public List<Ingrediente> getIngredientesBase() {
        return INGREDIENTES_BASE;
    }
}
