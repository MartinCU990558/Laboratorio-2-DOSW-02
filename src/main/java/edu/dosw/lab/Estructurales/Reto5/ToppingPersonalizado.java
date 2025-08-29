package edu.dosw.lab.Estructurales.Reto5;


public final class ToppingPersonalizado extends DecoradorTopping{
    private final String nombre;
    private final int precio;


    public ToppingPersonalizado(Cafe cafe, String nombre, int precio) {
        super(cafe);
        this.nombre = nombre;
        this.precio = precio;
    }


    @Override
    public String obtenerDescripcion() {
        String descripcionAnterior = this.cafe.obtenerDescripcion();
        return descripcionAnterior + " + " + this.nombre;
    }


    @Override
    public int calcularCosto() {
        int costoAnterior = this.cafe.calcularCosto();
        return costoAnterior + this.precio;
    }
}