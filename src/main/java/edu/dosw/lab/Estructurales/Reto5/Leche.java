package edu.dosw.lab.Estructurales.Reto5;


public final class Leche extends DecoradorTopping{
    public static final int PRECIO = 1000;


    public Leche(Cafe cafe) {
        super(cafe);
    }


    @Override
    public String obtenerDescripcion() {
        String descripcionAnterior = this.cafe.obtenerDescripcion();
        return descripcionAnterior + " + Leche";
    }


    @Override
    public int calcularCosto() {
        int costoAnterior = this.cafe.calcularCosto();
        return costoAnterior + PRECIO;
}

}