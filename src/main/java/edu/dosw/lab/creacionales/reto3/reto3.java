package main.java.edu.dosw.lab.creacionales.reto3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.HashMap;
import java.util.Map;

public class reto3 {
    private static ArrayList<Vehicle> vehicles = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);
    private static Map<String, String> vehicleType = new HashMap<>();

    public static void run() {
        System.out.println("Bienvenido al Reino de los Vehiculos!");
        vehicleCatalog();
        printInput();
        System.out.println("¿Desea agregar otro vehículo? (si/no): ");
        String continuar = input.nextLine();
        while (continuar.toLowerCase().equals("si")) {
            printInput();
            System.out.println("¿Desea agregar otro vehículo? (si/no): ");
            continuar = input.nextLine();
        }

        printBill();
    }

    private static void vehicleCatalog() {
        vehicleType.put("1", "1. Auto\n2. Bicicleta\n 3. Moto");
        vehicleType.put("2", "1. Lanchas\n2. Veleros\n 3. Jet Skis");
        vehicleType.put("3", "1. Aviones\n2. Avionetas\n 3. Helicópteros");
    }

    private static void printBill() {
        IntStream.range(0, vehicles.size()).forEach(i -> {
            System.out.println((i + 1) + ". " + "vehicle" + "\nTipo:"+vehicles.get(i).getType()+"\nCategoria:"+vehicles.get(i).getCategory()+"\nModelo:"+vehicles.get(i).getType()
            + "Velocidad: "+ vehicles.get(i).getBaseSpeed()+"km/h\nPrecio: "+ vehicles.get(i).getBasePrice() +"\nEquipo Base: "+ vehicles.get(i).getBaseEquipment() );
        });
    }

    public static void printInput() {
        System.out.println("Seleccione el tipo de ");
        System.out.println("1. Tierra\n2. Acuático\n 3. Aéreo");
        System.out.println("Ingrese opción: ");
        String type = input.nextLine();

        System.out.println("Seleccione la categoría del vehiculo:");
        System.out.println("1. Económico\n2. Lujo\n 3. Usado");
        System.out.println("Ingrese opción: ");
        String category = input.nextLine();

        System.out.println("Seleccione el modelo del vehiculo:");
        System.out.println(vehicleType.get(type.strip()));
        System.out.println("Ingrese opción: ");
        String model = input.nextLine();

        vehicles.add(ModelFactory.createModel(type, CategoryFactory.createCategory(category), TypeFactory.createModel(model) ));

    }
}