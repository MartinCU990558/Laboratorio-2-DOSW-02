package edu.dosw.lab.Solid;

public class Producto {

    private final String nombreProducto;
    private final double precioProducto;


    public Producto(String nombre, double precio) {
        this.nombreProducto = nombre;
        this.precioProducto = precio;
    }

    public String getNombre() {return nombreProducto;}
    public double getPrecio() {return precioProducto;}

}