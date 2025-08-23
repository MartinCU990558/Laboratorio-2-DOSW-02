package edu.dosw.lab.estructurales;

public class Producto {
    private int precio;
    private String Nombre;

    public Producto(int precio, String nombre){
        this.precio = precio;
        this.Nombre = nombre;
    }
    public int getPrecio(){
        return precio;
    }
    public String getNombre(){
        return Nombre;
    }
}
