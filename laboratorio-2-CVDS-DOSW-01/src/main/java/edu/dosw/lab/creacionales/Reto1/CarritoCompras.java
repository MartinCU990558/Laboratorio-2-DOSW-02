package edu.dosw.lab.estructurales.Reto1;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompras {
    private List<ItemCarrito> items;

    public CarritoCompras() {
        this.items = new ArrayList<>();
    }

    public void agregarProducto(Producto producto, int cantidad) {
        ItemCarrito item = new ItemCarrito(producto, cantidad);
        items.add(item);
    }

    public double CalcularSubtotal() {
        double subtotal = 0.0;
        for (ItemCarrito item : items) {
            subtotal += item.getSubTotal();
        }       
        return subtotal;
    }

    public ArrayList<ItemCarrito> getItems(){
        return (ArrayList<ItemCarrito>) items;
    }
    

}       
