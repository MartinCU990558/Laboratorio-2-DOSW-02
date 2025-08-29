package edu.dosw.lab.estructurales.Reto1;

import java.util.Scanner;

public class reto1 {

    public static void iniciarPrograma() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Bienvenido a la Tienda de Don Pepe ===");
       

        System.out.print("Ingrese el tipo de cliente: ");
        String tipoCliente = scanner.nextLine().trim();

        Cliente cliente = new Cliente(tipoCliente);
        CarritoCompras carrito = new CarritoCompras();

        boolean seguirComprando = true;

        while (seguirComprando) {
            System.out.print("\nIngrese el nombre del producto: ");
            String nombreProducto = scanner.nextLine();

            System.out.print("Ingrese el precio unitario del producto: ");
            double precioUnitario = scanner.nextDouble();

            System.out.print("Ingrese la cantidad: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine();

            Producto producto = new Producto(nombreProducto, precioUnitario);

            carrito.agregarProducto(producto, cantidad);
            System.out.println(nombreProducto + " agregado al carrito de compras.");

            System.out.print("\n¿Desea agregar otro producto? (si/no): ");
            String respuesta = scanner.nextLine().trim();
            seguirComprando = respuesta.equalsIgnoreCase("si");
        }

        Recibo recibo = new Recibo(cliente, carrito.getItems());
        recibo.imprimirRecibo();
    }

}
