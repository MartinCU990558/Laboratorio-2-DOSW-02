package edu.dosw.lab.creacionales.reto3;
import java.math.BigInteger;
import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Reto3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al Reino de los Vehículos!");
        ArrayList<ArrayList<Integer>> vehiclesToFind = new ArrayList<>();
        boolean stop = false;
        while (!stop) {
            ArrayList<Integer> toFind = menu();
            vehiclesToFind.add(toFind);
            System.out.println("¿Desea agregar otro vehículo? (si/no)");
            if (sc.nextLine().equals("no")){
                stop = true;
            }
        }
        ArrayList<Vehicle> finalVehicles = findingVehicle(vehiclesToFind);
        System.out.println(finalVehicles.stream().map(Vehicle::toString).collect(Collectors.joining("\n " + "\n")));
        System.out.println("Total a pagar: $" + finalVehicles.stream().map(Vehicle::getPrice).mapToDouble(Double::doubleValue).sum());
        System.out.println("¡Gracias por su compra en el Reino de los Vehículos!");
    }

    private static ArrayList<Integer> menu(){
        ArrayList<Integer> toFind = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione el tipo de vehiculo: ");
        System.out.println("1. Tierra");
        System.out.println("2. Acuático");
        System.out.println("3. Aéreo");
        System.out.println("Ingrese opción: ");
        int type = sc.nextInt();
        System.out.println("Seleccione la categoría del vehículo: ");
        System.out.println("1. Económico");
        System.out.println("2. Lujo");
        System.out.println("3. Usado");
        toFind.add(sc.nextInt());
        System.out.println("Seleccione el modelo del vehículo: ");
        if(type == 1){
            System.out.println("1. Auto");
            System.out.println("2. Bicicleta");
            System.out.println("3. Moto");
            toFind.add(sc.nextInt());
        } else if (type == 2){
            System.out.println("1. Lancha");
            System.out.println("2. JetSki");
            System.out.println("3. Velero");
            toFind.add(sc.nextInt()+3);
        } else if (type == 3){
            System.out.println("1. Avión");
            System.out.println("2. Avioneta");
            System.out.println("3. Helicóptero");
            toFind.add(sc.nextInt()+6);
        }
        return toFind;
    }

    private static ArrayList<Vehicle> findingVehicle(ArrayList<ArrayList<Integer>> toFind){
        VehicleFactory vehicleFactory = new VehicleFactory();
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        for (int i = 0; i < toFind.size(); i++){
            vehicles.add(vehicleFactory.createVehicle(getVehicle(toFind.get(i).get(1)), getCategory(toFind.get(i).get(0))));
        }
        return vehicles;
    }


    private static CategoryType getCategory(int c){
        CategoryType type = switch (c) {
            case 1 -> CategoryType.ECONOMIC;
            case 2 -> CategoryType.LUXURY;
            case 3 -> CategoryType.USED;
            default -> CategoryType.ECONOMIC;
        };
        return type;
    }

    private static VehicleType getVehicle(int c){
        VehicleType type = switch (c) {
            case 1 -> VehicleType.CAR;
            case 2 -> VehicleType.BIKE;
            case 3 -> VehicleType.MOTORCYCLE;
            case 4 -> VehicleType.BOAT;
            case 5 -> VehicleType.JET_SKI;
            case 6 -> VehicleType.SAILBOAT;
            case 7 -> VehicleType.PLANE;
            case 8 -> VehicleType.SMALL_PLANE;
            case 9 -> VehicleType.HELICOPTER;
            default -> VehicleType.CAR;
        };
        return type;
    }


}















