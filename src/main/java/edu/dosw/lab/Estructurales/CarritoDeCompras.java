package edu.dosw.lab.Estructurales;

import java.util.*;
public class CarritDeCompras {
    private final Map<Producto, Integer> elementos  = new HashMap<>();

    public void añadirProducto(Producto producto, int cantidad) {
        elementos.put(producto, elementos.getOrDefault(producto, 0) + cantidad);
    }

    public double getSubtotal() {
        return elementos.entrySet().stream()
                .mapToDouble(e -> e.getKey().getPrecio() * e.getValue())
                .sum();
    }

    public Map<Producto, Integer> getItems() { return elementos; }
}
