package edu.dosw.lab.creacionales.reto3;

import edu.dosw.lab.creacionales.reto3.factory.*;
import edu.dosw.lab.creacionales.reto3.vehicle.*;

import java.util.*;

public class Reto3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Vehicle> cart = new ArrayList<>();
        boolean addMore = true;

        System.out.println("¡Bienvenido al Reino de los Vehículos!");

        while (addMore) {

            System.out.println("\nSeleccione el tipo de vehículo:");
            System.out.println("1. Tierra");
            System.out.println("2. Acuático");
            System.out.println("3. Aéreo");
            System.out.print("Ingrese opción: ");
            int typeOption = sc.nextInt();


            System.out.println("\nSeleccione la categoría del vehículo:");
            System.out.println("1. Económico");
            System.out.println("2. Lujo");
            System.out.println("3. Usado");
            System.out.print("Ingrese opción: ");
            int catOption = sc.nextInt();
            String category = switch (catOption) {
                case 1 -> "Económico";
                case 2 -> "Lujo";
                case 3 -> "Usado";
                default -> "Desconocido";
            };

            VehicleFactory factory = switch (typeOption) {
                case 1 -> new LandVehicleFactory();
                case 2 -> new WaterVehicleFactory();
                case 3 -> new AirVehicleFactory();
                default -> throw new IllegalArgumentException("Tipo inválido");
            };

            if (typeOption == 1) {
                System.out.println("\nSeleccione el modelo de vehículo:");
                System.out.println("1. Auto");
                System.out.println("2. Bicicleta");
                System.out.println("3. Moto");
            } else if (typeOption == 2) {
                System.out.println("\nSeleccione el modelo de vehículo:");
                System.out.println("1. Lancha");
                System.out.println("2. Velero");
                System.out.println("3. Jet Ski");
            } else {
                System.out.println("\nSeleccione el modelo de vehículo:");
                System.out.println("1. Avión");
                System.out.println("2. Avioneta");
                System.out.println("3. Helicóptero");
            }

            System.out.print("Ingrese opción: ");
            int modelOption = sc.nextInt();

            Vehicle v = factory.createVehicle(modelOption, category);
            cart.add(v);

            System.out.print("\n¿Desea agregar otro vehículo? (si/no): ");
            addMore = sc.next().equalsIgnoreCase("si");
        }

        System.out.println("\n===== RESUMEN DE COMPRA =====");

        for (int i = 0; i < cart.size(); i++) {
            Vehicle v = cart.get(i);
            System.out.println("\nVehículo " + (i + 1) + ":");
            v.showInfo();
        }
        double subtotal = cart.stream()
                .mapToDouble(Vehicle::getPrice)
                .sum();

        double discount = (cart.size() >= 3) ? subtotal * 0.1 : 0;
        double total = subtotal - discount;

        System.out.println("\n-----------------------------");
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + discount);
        System.out.println("TOTAL A PAGAR: $" + total);
    }
}