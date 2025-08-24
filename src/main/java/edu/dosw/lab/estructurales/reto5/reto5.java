package main.java.edu.dosw.lab.estructurales.reto5;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class reto5 {
    private static Scanner input = new Scanner(System.in);
    private static Hashtable<String,String> availableToppings = new Hashtable<>();
    private static ArrayList<Coffee> coffees = new ArrayList<>();

    public static void run() {
        setAvailableToppings();
        printMenu();
        System.out.print("Numero de cafes a personalizar: ");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("========= Cafe " + (i + 1) + "=========");
            Coffee coffee = new BaseCoffee();

            System.out.print("Ingrese los toppings (separados por comas): ");
            String toppings = input.nextLine();

            String[] toppingsArray = toppings.split(",");
            for (String topping : toppingsArray) {
                coffee = ToppingFactory.addTopping(topping.trim(), coffee);
            }
            coffees.add(coffee);
        }
        printBill();
    }

    private static void printMenu() {
        System.out.println("Menu de toppings disponibles:");
        int i = 1;
        for (String topping : availableToppings.keySet()) {
            System.out.println( i + ". " + topping + " - " + availableToppings.get(topping));
            i++;
        }
        System.out.println("6. Agregar nuevo topping \n");
    }

    private static void printBill() {
        System.out.println("========= Resumen Cafe Personalizado =========");
        for (int i = 0; i != coffees.size(); i++) {
            System.out.println("Cafe " + (i + 1) + "\nIngredientes: " + coffees.get(i).getDescription() + "\nPrecio total: $" + coffees.get(i).getPrice() + "\n");
        }

        System.out.println("============================================");
        System.out.println("Total a pagar por todos los cafess: $" + coffees.stream().mapToDouble(Coffee::getPrice).sum()+"\nDisfrute su cafe.");


    }

    private static void setAvailableToppings() {
        availableToppings.put("Leche","$1.000");
        availableToppings.put("Chocolate","$2.000");
        availableToppings.put("Caramelo","$3.000");
        availableToppings.put("Crema","$4.000");
        availableToppings.put("Menta","$5.000");
    }
}
