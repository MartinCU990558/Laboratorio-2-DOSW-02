package edu.dosw.lab.Solid;

public class Recibo {
    public static void imprimirRecibo(CarritoDeCompras carrito, Cliente cliente) {


        System.out.println("RECIBO DE COMPRA");
        System.out.println("Cliente: " + cliente.getTipoCliente());
        System.out.println("Productos:");

        carrito.getItems().forEach((producto, cantidad) -> {
            double subtotal = producto.getPrecio() * cantidad;
            System.out.println("- " + producto.getNombre() + " - $" + (int)subtotal);
        });

        double subtotal = carrito.getSubtotal();
        double descuento = cliente.calcularDescuento(subtotal);
        double total = subtotal - descuento;

        System.out.println("Subtotal: $" + (int)subtotal);
        System.out.println("Descuento aplicado: $" + (int)descuento);
        System.out.println("Total a pagar: $" + (int)total);
        System.out.println("------------------------");
        System.out.println("¡Gracias por su compra!");
    }
}
