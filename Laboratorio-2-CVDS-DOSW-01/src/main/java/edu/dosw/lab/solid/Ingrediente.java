package edu.dosw.lab.solid;
public class Ingrediente {
    private String nombre;
    private int precio;

    public Ingrediente(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

}
