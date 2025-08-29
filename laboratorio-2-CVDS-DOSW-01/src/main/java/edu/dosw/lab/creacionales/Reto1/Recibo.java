package edu.dosw.lab.estructurales.Reto1;

import java.util.List;

public class Recibo {
    private Cliente cliente;
    private List<ItemCarrito> items;

    public Recibo(Cliente cliente, List<ItemCarrito> items) {
        this.cliente = cliente;
        this.items = items;
    }

    public void imprimirRecibo() {
        System.out.println("\n--- RECIBO DE COMPRA ---");
        System.out.println("Tipo de cliente: " + cliente.getTipoCliente());
        System.out.println("Productos:");


        items.forEach(i -> 
            System.out.println(" - " + i.getProducto().getNombre() + 
                               " x" + i.getCantidad() + 
                               " : $" + (i.getProducto().getPrecio() * i.getCantidad()))
        );

   
        double subtotal = items.stream()
                .mapToDouble(i -> i.getProducto().getPrecio() * i.getCantidad())
                .sum();


        double descuento = cliente.calcularDescuento(subtotal);

        double total = subtotal - descuento;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("TOTAL A PAGAR: $" + total);
    }
}

