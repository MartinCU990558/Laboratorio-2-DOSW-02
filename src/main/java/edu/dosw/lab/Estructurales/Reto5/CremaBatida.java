package edu.dosw.lab.Estructurales.Reto5;


public final class CremaBatida extends DecoradorTopping {

    public static final int PRECIO = 2000;

    public CremaBatida(Cafe cafe) {
        super(cafe);
    }


    @Override
    public String obtenerDescripcion() {
        String descripcionAnterior = this.cafe.obtenerDescripcion();
        return descripcionAnterior + " + Crema Batida";
    }


    @Override
    public int calcularCosto() {
        int costoAnterior = this.cafe.calcularCosto();
        return costoAnterior + PRECIO;
    }
}