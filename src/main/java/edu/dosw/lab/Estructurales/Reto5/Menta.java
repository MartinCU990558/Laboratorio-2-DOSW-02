package edu.dosw.lab.Estructurales.Reto5;


public final class Menta extends DecoradorTopping {
    public static final int PRECIO = 1300;

    public Menta(Cafe cafe) {
        super(cafe);
    }


    @Override
    public String obtenerDescripcion() {
        String descripcionAnterior = this.cafe.obtenerDescripcion();
        return descripcionAnterior + " + Menta";
    }


    @Override
    public int calcularCosto() {
        int costoAnterior = this.cafe.calcularCosto();
        return costoAnterior + PRECIO;
    }
}
