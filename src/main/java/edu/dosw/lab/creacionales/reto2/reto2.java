package main.java.edu.dosw.lab.creacionales.reto2;

import java.util.*;

import java.util.concurrent.atomic.AtomicInteger;

import java.util.stream.Collectors;

import java.util.stream.Stream;

public class reto2 {

    private static final Map<String, String> availableIngredients = new LinkedHashMap<>();

    private static Scanner input = new Scanner(System.in);

    private static AtomicInteger index = new AtomicInteger(1);

    public static void run() {

        addIngredient();

        availableIngredients.forEach((key, value) -> System.out.println(index.getAndIncrement() + ". " + key + " (" + value + ")"));

        System.out.println("7. Agregar nuevo Ingrediente");

        System.out.println("Ingrese los numeros separados por comas:");

        ArrayList<String> ingredientes = new ArrayList<>(Stream.of(input.nextLine().split(",")).map(String::trim).collect(Collectors.toList()));

        Hamburguesa.Builder builder = new Hamburguesa.Builder();

        Hamburguesa hamburguesa = buildHamburguesa(builder, ingredientes);

        printFactura(hamburguesa);

    }

    private static void addIngredient() {

        availableIngredients.put("Pan", "$3.000");

        availableIngredients.put("Carne", "$2.000");

        availableIngredients.put("Queso", "$1.000");

        availableIngredients.put("Lechuga", "$500");

        availableIngredients.put("Salsa", "$500");

    }

    private static void printFactura(Hamburguesa hamburguesa) {

        System.out.println("========== Hamburguesa Personalizada ==========");

        System.out.println("Ingredientes: "+hamburguesa.getIngredientes().stream().map(Ingredient::getName).collect(Collectors.joining(", "))    );

        System.out.println("Precio Total: $"+hamburguesa.getIngredientes().stream().mapToDouble(Ingredient::getPrice).sum());

        System.out.println("============================================\n Disfrute su hamburguesa");

    }

    private static Hamburguesa buildHamburguesa(Hamburguesa.Builder builder, ArrayList<String> ingredientes) {

        for (String ingrediente : ingredientes) {

            switch (ingrediente) {

                case "1":

                    builder.setPan();

                    break;

                case "2":

                    builder.setCarne();

                    break;

                case "3":

                    builder.setQueso();

                    break;

                case "4":

                    builder.setLechuga();

                    break;

                case "5":

                    builder.setTomate();

                    break;

                case "6":

                    builder.setSalsa();

                    break;

                case "7":

                    System.out.println("Ingrese el nombre del ingrediente:");

                    String name = input.nextLine();

                    System.out.println("Ingrese el precio del ingrediente:");

                    double price = input.nextDouble();

                    builder.setCustomIngredient(name, price);

            }

        }

        return builder.build();

    }

}