package edu.dosw.lab.creacionales.reto1;

import java.util.*;

public class Reto1 {
    public static void ejecutar() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido a la tienda Don Pepe!\n");


        List<Product> productos = Arrays.asList(
                new Camiseta(),
                new Pantalon(),
                new Galletas(),
                new JugoNatural()
        );

        System.out.print("Tipo de cliente (Frequent/New): ");
        String clienteNombre = scan.nextLine().trim();

        Customer cliente = clienteNombre.equalsIgnoreCase("Frequent")
                ? new FrequentCustomer("Frequent")
                : new NewCustomer("NewCustomer");

        ShoppingCart carrito = new ShoppingCart(cliente);

        System.out.println("\nCliente: " + cliente.getName());
        System.out.println("Productos disponibles:");
        for (int i = 0; i < productos.size(); i++) {
            Product p = productos.get(i);
            System.out.println("  " + (i + 1) + ". " + p.getClass().getSimpleName() + " - $" + p.getPrice());
        }

        System.out.println("\nIngrese su compra (0 si no desea el producto):");
        for (Product p : productos) {
            System.out.print("  o " + p.getClass().getSimpleName() + " (unidades): ");
            int cantidad = scan.nextInt();
            if (cantidad > 0) {
                carrito.addItem(p, cantidad);
            }
        }

        carrito.printReceipt();

        scan.close();
    }
}
