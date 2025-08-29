package edu.dosw.lab.estructurales.reto5;

public class Topping {
    private String nombre;
    private Integer precio;
    public Topping(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Integer getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
}
