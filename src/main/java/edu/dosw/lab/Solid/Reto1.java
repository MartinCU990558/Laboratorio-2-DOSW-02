package edu.dosw.lab.Solid;

import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bienvenido a la tienda Don Pepe!");

        System.out.println("Seleccione el tipo de cliente:");
        System.out.println("1. Cliente Nuevo");
        System.out.println("2. Cliente Frecuente");
        System.out.print("Opción: ");
        int opcionCliente = Integer.parseInt(scan.nextLine());

        Cliente cliente;
        if (opcionCliente == 1) {
            cliente = new ClienteNuevo();
        } else {
            cliente = new ClienteFrecuente();
        }

        System.out.println("Productos disponibles:");
        System.out.println("1. Camiseta - $20.000");
        System.out.println("2. Pantalón - $50.000");
        System.out.println("3. Galletas - $500");
        System.out.println("4. Jugo Natural - $3.000");

        Producto camiseta = new Producto("Camiseta", 20000);
        Producto pantalon = new Producto("Pantalón", 50000);
        Producto galletas = new Producto("Galletas", 500);
        Producto jugo = new Producto("Jugo Natural", 3000);

        System.out.println("Ingrese su compra:");
        System.out.print("Camiseta: ");
        int cantidadCamiseta = Integer.parseInt(scan.nextLine());
        System.out.print("Pantalon: ");
        int cantidadPantalon = Integer.parseInt(scan.nextLine());
        System.out.print("Galletas: ");
        int cantidadGalletas = Integer.parseInt(scan.nextLine());
        System.out.print("Jugo Natural: ");
        int cantidadJugo = Integer.parseInt(scan.nextLine());

        CarritoDeCompras carrito = new CarritoDeCompras();
        carrito.añadirProducto(camiseta, cantidadCamiseta);
        carrito.añadirProducto(galletas, cantidadGalletas);
        carrito.añadirProducto(jugo, cantidadJugo);
        carrito.añadirProducto(pantalon, cantidadPantalon);

        Recibo.imprimirRecibo(carrito, cliente);

        scan.close();
    }
}