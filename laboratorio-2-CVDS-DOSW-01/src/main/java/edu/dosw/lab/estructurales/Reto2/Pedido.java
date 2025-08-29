package edu.dosw.lab.estructurales.Reto2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pedido {
    private final List<Ingrediente> ingredientes = new ArrayList<>();

    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public void seleccionar(String seleccion, Scanner scanner, Menu menu) {
        String[] opciones = seleccion.split(",");
        for (String opcion : opciones) {
            int numero = Integer.parseInt(opcion.trim());
            if (numero == menu.getIngredientesBase().size() + 1) {
                System.out.print("Ingrese el nombre del nuevo ingrediente: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese el precio del ingrediente: ");
                int precio = Integer.parseInt(scanner.nextLine());
                agregarIngrediente(new Ingrediente(nombre, precio));
            } else if (numero >= 1 && numero <= menu.getIngredientesBase().size()) {
                agregarIngrediente(menu.getIngredientesBase().get(numero - 1));
            }
        }
    }

    public String resumenPedido() {
        if (ingredientes.isEmpty()) {
            return "No se han seleccionado ingredientes.";
        }
        int total = ingredientes.stream().mapToInt(ing -> ing.precio).sum();
        String lista = String.join(", ", ingredientes.stream().map(ing -> ing.nombre).toList());
        return "Ingredientes seleccionados: " + lista + "\nPrecio total: $" + String.format("%,d", total);
    }

    public boolean estaVacio() {
        return ingredientes.isEmpty();
    }
}