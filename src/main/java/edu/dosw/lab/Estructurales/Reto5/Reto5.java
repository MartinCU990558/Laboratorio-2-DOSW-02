package edu.dosw.lab.Estructurales.Reto5;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;



public class Reto5 {
    private static final int PRECIO_BASE = 2000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de cafés a personalizar: ");
        int n = leerEntero(sc);

        List<Cafe> pedido = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("\n--- Café " + i + " ---");
            mostrarMenu();
            System.out.print("Seleccione toppings (números separados por coma): ");
            String linea = sc.nextLine().trim();
            List<Integer> opciones = parsearLista(linea);

            Cafe cafe = new CafeBase(PRECIO_BASE);

            for (int opcion : opciones) {
                cafe = aplicarTopping(sc, cafe, opcion);
            }

            pedido.add(cafe);
        }

        System.out.println("\n--- RESUMEN DE CAFÉ PERSONALIZADO ---\n");
        for (int i = 0; i < pedido.size(); i++) {
            Cafe cafe = pedido.get(i);
            String descripcion = cafe.obtenerDescripcion();
            int costo = cafe.calcularCosto();

            System.out.println("Café " + (i + 1) + ":");
            System.out.println("Ingredientes: " + descripcion);
            System.out.println("Precio total: " + formatearPesos(costo));
            System.out.println();
        }

        int total = pedido.stream().mapToInt(Cafe::calcularCosto).sum();
        System.out.println("------------------------------");
        System.out.println("Total a pagar por todos los cafés: " + formatearPesos(total));
        System.out.println("¡Disfrute su café!");
    }

    private static void mostrarMenu() {
        System.out.println("Lista de toppings disponibles");
        System.out.println("1) Leche " + formatearPesos(Leche.PRECIO));
        System.out.println("2) Chocolate " + formatearPesos(Chocolate.PRECIO));
        System.out.println("3) Caramelo " + formatearPesos(Caramelo.PRECIO));
        System.out.println("4) Crema Batida " + formatearPesos(CremaBatida.PRECIO));
        System.out.println("5) Menta " + formatearPesos(Menta.PRECIO));
        System.out.println("6) Agregar nuevo topping (precio personalizado)");
    }

    private static Cafe aplicarTopping(Scanner sc, Cafe cafe, int opcion) {
        switch (opcion) {
            case 1: {
                Leche leche = new Leche(cafe);
                return leche;
            }
            case 2: {
                Chocolate chocolate = new Chocolate(cafe);
                return chocolate;
            }
            case 3: {
                Caramelo caramelo = new Caramelo(cafe);
                return caramelo;
            }
            case 4: {
                CremaBatida crema = new CremaBatida(cafe);
                return crema;
            }
            case 5: {
                Menta menta = new Menta(cafe);
                return menta;
            }
            case 6: {
                System.out.print("Ingrese nombre del nuevo topping: ");
                String nombre = sc.nextLine().trim();
                System.out.print("Ingrese precio del topping: ");
                int precio = leerEntero(sc);
                ToppingPersonalizado custom = new ToppingPersonalizado(cafe, nombre, precio);
                return custom;
            }
            default: {
                System.out.println("Opción inválida, se ignora.");
                return cafe;
            }
        }
    }

    private static List<Integer> parsearLista(String linea) {
        if (linea.isEmpty()) {
            return List.of();
        }
        List<String> partes = Arrays.asList(linea.split(","));
        List<Integer> numeros = partes.stream()
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        return numeros;
    }

    private static int leerEntero(Scanner sc) {
        while (true) {
            String texto = sc.nextLine().trim();
            try {
                int numero = Integer.parseInt(texto);
                return numero;
            } catch (NumberFormatException e) {
                System.out.print("Número inválido, intente de nuevo: ");
            }
        }
    }

    private static String formatearPesos(int valor) {
        String s = Integer.toString(valor);
        StringBuilder sb = new StringBuilder();
        int contador = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            sb.append(c);
            contador++;
            if (contador == 3 && i != 0) {
                sb.append('.');
                contador = 0;
            }
        }
        String invertido = sb.reverse().toString();
        return "$" + invertido;
    }
}