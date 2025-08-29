package edu.dosw.lab.estructurales.reto5;

public class ExtraPersonalizado extends CafeCambiable {
    private String nombre;
    private double costo;

    public ExtraPersonalizado(Cafe cafe, String nombre, double costo) {
        super(cafe);
        this.nombre = nombre;
        this.costo = costo;
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + " + " + nombre;
    }

    @Override
    public double getPrecio() {
        return cafe.getPrecio() + costo;
    }
}
