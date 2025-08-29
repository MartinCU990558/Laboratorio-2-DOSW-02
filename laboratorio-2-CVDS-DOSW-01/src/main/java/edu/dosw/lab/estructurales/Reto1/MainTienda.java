package edu.dosw.lab.estructurales;

import java.util.ArrayList;

public class MainTienda {

    public static void main(String[] args) {
        System.out.println("Bienvenido a la tienda Don Pepe!");

        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(new Producto(20000 * 2, "Camiseta (2 unidades)"));
        productos.add(new Producto(500 * 3, "Galletas (3 unidades)"));
        productos.add(new Producto(3000 * 5, "Jugo Natural (5 unidades)"));

        CarritoCompras carrito = new CarritoCompras(productos, "Frecuente");

        System.out.println("Camiseta 2 unidades agregado al carrito.");
        System.out.println("Galletas 3 unidades agregado al carrito.");
        System.out.println("Jugo Natural 5 unidades agregado al carrito.");

        Recibo recibo = new Recibo(carrito);
        recibo.imprimirRecibo();
    }
}
