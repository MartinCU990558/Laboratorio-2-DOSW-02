package edu.dosw.lab.estructurales.reto5;

import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Reto5 {
    private static List<Cafe> cafes;
    private static List<Topping> toppingDisponibles;
    public static void main(String[] args) {
        preparation();
        Scanner input = new Scanner(System.in);
        System.out.println("Numero de cafes a personalizar:");
        Integer cantidadCafes = input.nextInt();
        input.nextLine();
        for (int i = 1; i <= cantidadCafes; i++) {
            ArrayList<Topping> toppingElegidos = new ArrayList<Topping>();
            System.out.println("---"+"Cafe "+i+"---");
            System.out.println("Seleccione toppings (numeros separados por coma):");
            int[] selections = Arrays.stream(input.nextLine().split(","))
                    .map(String::trim)
                    .filter(s -> !s.isEmpty())
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for(int s : selections){
                if(s <= toppingDisponibles.size()){
                    toppingElegidos.add(toppingDisponibles.get(s-1));
                }
                else{
                    System.out.println("Ingrese nombre del nuevo topping:");
                    String nuevoTopping = input.nextLine();
                    System.out.println("Ingrese precio del topping:");
                    Integer precioTopping = input.nextInt();
                    toppingElegidos.add(new NuevoTopping(nuevoTopping, precioTopping));
                }
            }
            cafes.add(new Cafe(toppingElegidos));
        }
        imprimirMensaje();
    }

    public static void preparation() {
        cafes = new ArrayList<>();
        toppingDisponibles = Arrays.asList(
                new Leche("Leche",1000),
                new Chocolate("Chocolate",1500),
                new Caramelo("Caramelo",1200),
                new CremaBatida("Crema Batida", 2000),
                new Menta("Menta",1300)
        );
    }

    public static void imprimirMensaje(){
        System.out.println("--- RESUMEN DE CAFE PERZONALIZADO ---\n");
        for (Cafe cafe : cafes) {

            Integer precioCafe = cafe.getPrecio();
            System.out.println("Cafe "+(cafes.indexOf(cafe)+1)+":");
            String toppingsList = cafe.getToppingsElegidos().stream()
                    .map(Topping:: getNombre)
                    .collect(Collectors.joining(" + "));
            System.out.println("Ingredientes: Cafe base + "+toppingsList);
            System.out.println("precio total: $"+precioCafe+"\n");
        }
        Integer precioTotal = cafes.stream().mapToInt(Cafe::getPrecio).sum();
        System.out.println("Total a pagar por todos los cafes: "+precioTotal);
        System.out.println("Disfrute su cafe!");
    }
}
