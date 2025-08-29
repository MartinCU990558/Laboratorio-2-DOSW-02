package edu.dosw.lab.estructurales.reto5;

import java.util.*;

public class Reto5 {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<Integer, String> extrasDisponibles = new HashMap<>();
    private static final Map<Integer, Double> preciosExtras = new HashMap<>();

    static {
        extrasDisponibles.put(1, "leche");
        preciosExtras.put(1, 1000.0);

        extrasDisponibles.put(2, "chocolate");
        preciosExtras.put(2, 1500.0);

        extrasDisponibles.put(3, "caramelo");
        preciosExtras.put(3, 1200.0);

        extrasDisponibles.put(4, "crema Batida");
        preciosExtras.put(4, 2000.0);

        extrasDisponibles.put(5, "menta");
        preciosExtras.put(5, 1300.0);

        extrasDisponibles.put(6, "agregar contenido extra");
        preciosExtras.put(6, 0.0);
    }

    public static void iniciarPrograma() {
        System.out.println("Bienvenido a la cafeteria tojuma!");
        System.out.print("¿cuantos cafes quieres personalizar?: ");
        int cantidadCafes = Integer.parseInt(scanner.nextLine());
        List<Cafe> pedidos = new ArrayList<>();
        for (int i = 1; i <= cantidadCafes; i++) {
            System.out.println("\n--- cafe " + i + " ---");
            mostrarMenuExtras();
            System.out.print("selecciona el contenido extra (numeros separados por coma): ");
            String[] seleccion = scanner.nextLine().split(",");
            Cafe cafe = new CafeSimple();
            for (String opcionStr : seleccion) {
                int opcion = Integer.parseInt(opcionStr.trim());
                if (opcion == 6) {
                    System.out.print("ingresa el nombre del nuevo toppping ");
                    String nombre = scanner.nextLine();
                    System.out.print("agrega el precio del nuevo topping ");
                    double precio = Double.parseDouble(scanner.nextLine());
                    cafe = new ExtraPersonalizado(cafe, nombre, precio);
                } else if (extrasDisponibles.containsKey(opcion)) {
                    cafe = new ExtraPersonalizado(cafe, extrasDisponibles.get(opcion), preciosExtras.get(opcion));
                }
            }
            pedidos.add(cafe);
        }
        mostrarResumen(pedidos);
    }

    private static void mostrarMenuExtras() {
        System.out.println("\nLista de los contenidos extra que estan disponibles ");
        extrasDisponibles.forEach((k, v) -> {
            if (k == 6) {
                System.out.println(k + ". " + v + " -> precio personalizado");
            } else {
                System.out.println(k + ". " + v + " -> $" + preciosExtras.get(k).intValue());
            }
        });
    }

    private static void mostrarResumen(List<Cafe> pedidos) {
        System.out.println("\n--- RESUMEN DE LOS CAFES PERSONALIZADOS ---");
        double total = 0;
        for (int i = 0; i < pedidos.size(); i++) {
            Cafe cafe = pedidos.get(i);
            System.out.println("cafe " + (i + 1) + ":");
            System.out.println("ingredientes: " + cafe.getDescripcion());
            System.out.println("precio total: $" + (int)cafe.getPrecio());
            System.out.println();
            total += cafe.getPrecio();
        }
        System.out.println("___________________________");
        System.out.println("total a pagar: $" + (int)total);
        System.out.println("¡disfruta tu cafe!");
    }
}
