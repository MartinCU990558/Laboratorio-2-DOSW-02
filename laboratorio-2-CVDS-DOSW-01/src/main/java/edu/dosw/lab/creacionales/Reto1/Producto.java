package edu.dosw.lab.creacionales.Reto1;
public class Producto {
    private String nombre;
    private final double precio;

    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;   
    }

    public String getNombre() {
        return nombre;
    }   

    public double getPrecio() {
        return precio;
    }   

}
