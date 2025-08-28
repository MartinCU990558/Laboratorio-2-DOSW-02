package edu.dosw.lab.creacionales.reto3;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Reto3 {

    public static void iniciarPrograma() {
        Scanner scanner = new Scanner(System.in);
        List<Vehiculo> listaVehiculos = new ArrayList<>();
        boolean seguirComprando = true;

        System.out.println("Bienvenido al Reino de los Vehiculos!");

        while (seguirComprando) {
            int opcionTipo = mostrarMenuTipo(scanner);
            int opcionCategoria = mostrarMenuCategorias(scanner);
            VehiculoFactory fabrica = obtenerFabrica(opcionCategoria);

            int opcionModelo = mostrarMenuModelos(scanner, opcionTipo);
            Vehiculo vehiculoSeleccionado = crearVehiculo(fabrica, opcionTipo, opcionModelo);

            if (vehiculoSeleccionado != null) {
                listaVehiculos.add(vehiculoSeleccionado);
                System.out.println("\n" + vehiculoSeleccionado.getTipo() + " ("
                        + vehiculoSeleccionado.getCategoria() + ") agregado al carrito.");
            } else {
                System.out.println("\nEsa opcion no esta, intenta de nuevo ");
            }

            System.out.print("\nDesea agregar otro vehiculo? (si/no): ");
            String respuesta = scanner.nextLine().trim();
            seguirComprando = respuesta.equalsIgnoreCase("si");
        }

        mostrarRecibo(listaVehiculos);
    }

    private static int mostrarMenuTipo(Scanner scanner) {
        System.out.println("\nSeleccione el tipo de vehiculo:");
        System.out.println("1. Tierra");
        System.out.println("2. Acuatico");
        System.out.println("3. Aereo");
        System.out.print("Ingrese la opcion que le interese ");
        return leerNumero(scanner);
    }

    private static int mostrarMenuCategorias(Scanner scanner) {
        System.out.println("\nSeleccione la categoria del vehiculo:");
        System.out.println("1. Economico");
        System.out.println("2. Lujo");
        System.out.println("3. Usado");
        System.out.print("Ingrese la opcion que le interese ");
        return leerNumero(scanner);
    }

    private static int mostrarMenuModelos(Scanner scanner, int opcionTipo) {
        System.out.println("\nSeleccione el modelo de vehiculo que quiere guardar en el carrito ");
        switch (opcionTipo) {
            case 1:
                System.out.println("1. Auto");
                System.out.println("2. Bicicleta");
                System.out.println("3. Moto");
                break;
            case 2:
                System.out.println("1. Lancha");
                System.out.println("2. Velero");
                System.out.println("3. Jet Ski");
                break;
            case 3:
                System.out.println("1. Avion");
                System.out.println("2. Avioneta");
                System.out.println("3. Helicoptero");
                break;
        }
        System.out.print("Ingrese la opcion que le interese ");
        return leerNumero(scanner);
    }

    private static int leerNumero(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine().trim();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.print("Ese numero no esta, ingresa otro ");
            }
        }
    }

    private static VehiculoFactory obtenerFabrica(int opcionCategoria) {
        switch (opcionCategoria) {
            case 1: return new VehiculoEconomicoFactory();
            case 2: return new VehiculoLujoFactory();
            case 3: return new VehiculoUsadoFactory();
            default: return new VehiculoEconomicoFactory();
        }
    }

    private static Vehiculo crearVehiculo(VehiculoFactory fabrica, int opcionTipo, int opcionModelo) {
        switch (opcionTipo) {
            case 1:
                switch (opcionModelo) {
                    case 1: return fabrica.crearAuto();
                    case 2: return fabrica.crearBicicleta();
                    case 3: return fabrica.crearMoto();
                }
                break;
            case 2:
                switch (opcionModelo) {
                    case 1: return fabrica.crearLancha();
                    case 2: return fabrica.crearVelero();
                    case 3: return fabrica.crearJetSki();
                }
                break;
            case 3:
                switch (opcionModelo) {
                    case 1: return fabrica.crearAvion();
                    case 2: return fabrica.crearAvioneta();
                    case 3: return fabrica.crearHelicoptero();
                }
                break;
        }
        return null;
    }

    private static void mostrarRecibo(List<Vehiculo> listaVehiculos) {
        System.out.println("\n--- RESUMEN DE SU COMPRA ---");
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));

        int contador = 1;
        for (Vehiculo vehiculo : listaVehiculos) {
            System.out.println("\nVehiculo " + (contador++) + ":");
            System.out.println("Tipo: " + vehiculo.getTipo());
            System.out.println("Categoria: " + vehiculo.getCategoria());
            System.out.println("Velocidad maxima: " + vehiculo.getVelocidadMaxima() + " km/h");
            System.out.println("Precio: " + formatoMoneda.format(vehiculo.getPrecio()));
            System.out.println("Equipamiento: " + vehiculo.getEquipamiento());
        }

        double subtotal = listaVehiculos.stream().mapToDouble(Vehiculo::getPrecio).sum();
        double descuento = 0.0;
        double total = subtotal - descuento;

        System.out.println("\nSubtotal: " + formatoMoneda.format(subtotal));
        System.out.println("Descuento aplicado: " + formatoMoneda.format(descuento));
        System.out.println("Total a pagar: " + formatoMoneda.format(total));
        System.out.println("\nGracias por su compra en el Reino de los Vehiculos!");
    }
}
