package edu.dosw.lab.estructurales.Reto2;

class Ingrediente {
    String nombre;
    int precio;
    Ingrediente(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    @Override
    public String toString() {
        return nombre + " ($" + String.format("%,d", precio) + ")";
    }
}
