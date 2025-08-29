package main.java.edu.dosw.lab.creacionales.reto3;
import java.text.NumberFormat;
import java.util.Locale;

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
        vehicleType.put("1", "1. Auto\n2. Moto\n3. Bicicleta");
        vehicleType.put("2", "1. Lanchas\n2. Veleros\n3. Jet Skis");
        vehicleType.put("3", "1. Aviones\n2. Avionetas\n3. Helicópteros");
    }

    private static void printBill() {
        NumberFormat moneda = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));

        System.out.println("========= Factura =========");
        IntStream.range(0, vehicles.size()).forEach(i -> {
            System.out.println("Vehiculo"+ (i + 1) + ":\nTipo:"+vehicles.get(i).getType()+"\nCategoria:"+vehicles.get(i).getCategory()+"\nModelo:"+vehicles.get(i).getModel()
            + "\nVelocidad: "+ vehicles.get(i).getSpeed()+"km/h\nPrecio: "
            + moneda.format(vehicles.get(i).getPrice()) +"\nEquipo Base: "+ vehicles.get(i).getEquipment() );
        });

        String total = moneda.format(vehicles.stream().mapToDouble(Vehicle::getPrice).sum());
        System.out.println("\nSubtotal: " + total);
        System.out.println("Descuento: $0");
        System.out.println("Total: " + total);
    }

    public static void printInput() {
        System.out.println("Seleccione el tipo de ");
        System.out.println("1. Tierra\n2. Acuático\n3. Aéreo");
        System.out.print("Ingrese opción: ");
        String type = input.nextLine();

        System.out.println("Seleccione la categoría del vehiculo:");
        System.out.println("1. Económico\n2. Lujo\n3. Usado");
        System.out.print("Ingrese opción: ");
        String category = input.nextLine();

        System.out.println("Seleccione el modelo del vehiculo:");
        System.out.println(vehicleType.get(type.strip()));
        System.out.print("Ingrese opción: ");
        String model = input.nextLine();

        Vehicle vehicle = new Vehicle.Builder()
            .setType(TypeFactory.createType(type))
            .setCategory(CategoryFactory.createCategory(category))
            .setModel(ModelFactory.createModel(type, model))
            .build();

        vehicles.add(vehicle);
    }

}