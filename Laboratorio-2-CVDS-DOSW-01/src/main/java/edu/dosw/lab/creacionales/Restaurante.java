package edu.dosw.lab.creacionales;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.*;

public class Restaurante {
    private HashMap<Integer,Ingrediente> ingredientes;
    private Cajero cajero;
    private final Scanner sc = new Scanner(System.in);

    public void printOpciones(){
        System.out.println(
                ingredientes.entrySet().stream()
                        .map(e -> String.format("%d. %s ($ %d)",
                                e.getKey(),
                                e.getValue().getNombre(),
                                e.getValue().getPrecio()))
                        .collect(Collectors.joining("\n"))
        );
        System.out.printf("%d. Agregar un nuevo Ingrediente%n", ingredientes.size() + 1);
    }

    public void printRecibo(){
        System.out.println("--HAMBURGUESA PERSONALIZADA--");
        System.out.println("~~Ingredientes Seleccionados:");
        System.out.println(cajero.obtenerRecibo().getIngredientesNombre().stream().
                map(s -> String.format("%s", s))
                .collect(Collectors.joining(" ,")));
        System.out.println("-----------------------------");
        System.out.println("Disfrute su Hamburguesa!!! :D");
    }

    public void printSaludo(){
        System.out.println("Bienvenido!%n Seleccione ingredientes para su Hamburguesa%n");
    }

    public void agregarNuevoIngrediente(){
        String nombre = sc.nextLine();
        Integer precio = sc.nextInt();
        ingredientes.put( ingredientes.size()+1,new Ingrediente(nombre,precio));
    }

    public void elegirOpcion(){
        int opcion = sc.nextInt();
        if (opcion < ingredientes.size() && opcion >= 0) {
            cajero.colocarIngrediente(ingredientes.get(opcion));
        } else {
            agregarNuevoIngrediente();
        }
    }

}
