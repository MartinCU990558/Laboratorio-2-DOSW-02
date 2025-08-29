package edu.dosw.lab.Estructurales.Reto5;


public final class Chocolate extends DecoradorTopping {
    public static final int PRECIO = 1500;

    public Chocolate(Cafe cafe) {
        super(cafe);
    }


    @Override
    public String obtenerDescripcion() {
        String descripcionAnterior = this.cafe.obtenerDescripcion();
        return descripcionAnterior + " + Chocolate";
    }


    @Override
    public int calcularCosto() {
        int costoAnterior = this.cafe.calcularCosto();
        return costoAnterior + PRECIO;
    }

}