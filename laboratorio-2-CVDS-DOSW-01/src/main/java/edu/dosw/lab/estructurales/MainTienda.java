package edu.dosw.lab.estructurales;

import java.util.ArrayList;

public class MainTienda {

    public static void main(String[] args) {
        System.out.println("Bienvenido a la tienda Don Pepe!");

        // Crear lista de productos que el cliente compra
        ArrayList<Producto> productos = new ArrayList<>();

        // Cantidades solicitadas por el cliente
        productos.add(new Producto(20000 * 2, "Camiseta (2 unidades)"));
        productos.add(new Producto(500 * 3, "Galletas (3 unidades)"));
        productos.add(new Producto(3000 * 5, "Jugo Natural (5 unidades)"));

        // Crear carrito
        CarritoCompras carrito = new CarritoCompras(productos, "Frecuente");

        // Confirmar agregados
        System.out.println("Camiseta 2 unidades agregado al carrito.");
        System.out.println("Galletas 3 unidades agregado al carrito.");
        System.out.println("Jugo Natural 5 unidades agregado al carrito.");

        // Generar recibo
        Recibo recibo = new Recibo(carrito);
        recibo.imprimirRecibo();
    }
}
