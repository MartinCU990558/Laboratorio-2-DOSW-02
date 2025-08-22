package edu.dosw.lab.creacionales.reto1;

import java.util.Scanner;

public class Reto1 {
    public static void ejecutar() {
        Customer cliente;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido a la tienda Don Pepe!\n");

        Product camiseta = new Camiseta();
        Product pantalon = new Pantalon();
        Product galletas = new Galletas();
        Product jugo = new JugoNatural();

        System.out.println("Tipo de cliente: ");
        String clienteNombre = scan.nextLine();

        if (clienteNombre.equals("Frequent")) {
            cliente = new FrequentCustomer("Frequent");
        }
        else{
            cliente = new NewCustomer("NewCustomer");
        }

        ShoppingCart carrito = new ShoppingCart(cliente);

        System.out.println("Cliente: " + cliente.getName());
        System.out.println("Productos disponibles:");
        System.out.println("  o Camiseta - $" + camiseta.getPrice());
        System.out.println("  o Pantalón - $" + pantalon.getPrice());
        System.out.println("  o Galletas - $" + galletas.getPrice());
        System.out.println("  o Jugo Natural - $" + jugo.getPrice());

        System.out.println("\nIngrese su compra:");

        System.out.print("  o Camiseta (unidades): ");
        int cantCamiseta = scan.nextInt();

        System.out.print("  o Pantalón (unidades): ");
        int cantPantalon = scan.nextInt();

        System.out.print("  o Galletas (unidades): ");
        int cantGalletas = scan.nextInt();

        System.out.print("  o Jugo Natural (unidades): ");
        int cantJugo = scan.nextInt();


        if (cantCamiseta > 0) carrito.addItem(camiseta, cantCamiseta);
        if (cantPantalon > 0) carrito.addItem(pantalon, cantPantalon);
        if (cantGalletas > 0) carrito.addItem(galletas, cantGalletas);
        if (cantJugo > 0) carrito.addItem(jugo, cantJugo);

        carrito.printReceipt();

        scan.close();
    }
}
