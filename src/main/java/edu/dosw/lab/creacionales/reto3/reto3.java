package main.java.edu.dosw.lab.creacionales.reto3;

import java.util.Scanner;

public class reto3 {

    private static Scanner input = new Scanner(System.in);

    public static void run() {
        System.out.println("Bienvenido al Reino de los Vehiculos!");
        printInput();
        System.out.println("¿Desea agregar otro vehículo? (si/no): ");
        String continuar = input.nextLine();
        while (continuar.toLowerCase().equals("si")) {
            printInput();
            System.out.println("¿Desea agregar otro vehículo? (si/no): ");
            continuar = input.nextLine();
        }
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
        System.out.println("1. Auto\n2. Bicicleta\n 3. Moto");
        System.out.println("Ingrese opción: ");
        String model = input.nextLine();
    }
}