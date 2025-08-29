package edu.dosw.lab.Estructurales.Reto5;

public final class Caramelo extends DecoradorTopping {
    public static final int PRECIO = 1200;


    public Caramelo(Cafe cafe) {
        super(cafe);
    }


    @Override
    public String obtenerDescripcion() {
        String descripcionAnterior = this.cafe.obtenerDescripcion();
        return descripcionAnterior + " + Caramelo";
    }


    @Override
    public int calcularCosto() {
        int costoAnterior = this.cafe.calcularCosto();
        return costoAnterior + PRECIO;
    }

}