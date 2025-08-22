package edu.dosw.lab.Solid;

import java.util.*;
public class CarritoDeCompras {
    private final Map<Producto, Integer> elementos  = new HashMap<>();

    public void añadirProducto(Producto producto, int cantidad) {
        elementos.put(producto, elementos.getOrDefault(producto, 0) + cantidad);
        System.out.println(producto.getNombre() + " " + cantidad + " unidades agregado al carrito.");
    }

    public double getSubtotal() {
        return elementos.entrySet().stream()
                .mapToDouble(e -> e.getKey().getPrecio() * e.getValue())
                .sum();
    }

    public Map<Producto, Integer> getItems() { return elementos; }
}
