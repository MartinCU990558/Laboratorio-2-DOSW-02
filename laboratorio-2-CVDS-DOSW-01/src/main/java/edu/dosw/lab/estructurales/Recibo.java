package edu.dosw.lab.estructurales;

import java.util.ArrayList;

public class Recibo {

    private CarritoCompras carrito;

    public Recibo(CarritoCompras carrito) {
        this.carrito = carrito;
    }

    public void imprimirRecibo() {
        System.out.println("\n--- RECIBO DE COMPRA ---");
        System.out.println("Cliente: " + carrito.getTcliente());
        System.out.println("Productos:");

        int subtotal = 0;

        for (Producto p : carrito.getProductos()) {
            subtotal += p.getPrecio();
            System.out.println("- " + p.getNombre() + " - $" + p.getPrecio());
        }

        System.out.println("\nSubtotal: $" + subtotal);

        double descuento = calcularDescuento(subtotal, carrito.getTcliente());
        System.out.println("Descuento aplicado: $" + (int)descuento);

        double total = subtotal - descuento;
        System.out.println("Total a pagar: $" + (int)total);
        System.out.println("------------------------");
        System.out.println("¡Gracias por su compra!");
    }

    private double calcularDescuento(int subtotal, String tipoCliente) {

        if (tipoCliente.equalsIgnoreCase("Frecuente")) {
            return subtotal * 0.10;
        }
        return 0;
    }
}
