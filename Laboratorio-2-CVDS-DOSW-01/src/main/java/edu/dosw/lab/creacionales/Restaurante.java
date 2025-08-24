package edu.dosw.lab.creacionales;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.*;

public class Restaurante {
    private HashMap<Integer,Ingrediente> ingredientes = new HashMap<>();
    private Cajero cajero = new Cajero();
    private final Scanner sc = new Scanner(System.in);

    public Restaurante(){
        ingredientes.put( ingredientes.size()+1,new Ingrediente("Pan",3000));
        ingredientes.put( ingredientes.size()+1,new Ingrediente("Carne",10000));
        ingredientes.put( ingredientes.size()+1,new Ingrediente("Queso",5000));
        ingredientes.put( ingredientes.size()+1,new Ingrediente("Lechuga",2000));
        ingredientes.put( ingredientes.size()+1,new Ingrediente("Tomate",2000));
        ingredientes.put( ingredientes.size()+1,new Ingrediente("Salsa especial",3000));
    }
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
                .collect(Collectors.joining(",")));
        System.out.printf("Precio total: $%d%n",cajero.obtenerRecibo().getPrecioTotal());
        System.out.println("-----------------------------");
        System.out.println("Disfrute su Hamburguesa!!! :D");
    }

    public void printSaludo(){
        System.out.printf("Bienvenido!%nSeleccione ingredientes para su Hamburguesa%n");
    }

    public void agregarNuevoIngrediente(){
        System.out.println("Ingrese el nombre del nuevo ingrediente:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el precio del ingrediente");
        int precio = Integer.parseInt(sc.nextLine());
        ingredientes.put( ingredientes.size()+1,new Ingrediente(nombre,precio));
        cajero.colocarIngrediente(ingredientes.get(ingredientes.size()));
    }

    public void elegirOpcion(){
        System.out.println("Ingrese sus opcones separadas por coma:");
        List<Integer> opciones= Arrays.stream(sc.nextLine().split(",")).map(Integer::parseInt).toList();
        for (Integer opcion : opciones) {
            if (opcion < ingredientes.size() && opcion >= 0) {
                cajero.colocarIngrediente(ingredientes.get(opcion));
            } else {
                agregarNuevoIngrediente();
            }
        }
    }

    public void iniciarPedido(){
        printSaludo();
        printOpciones();
        elegirOpcion();
    }

    public void finalizarPedido(){
        printRecibo();
    }

}
