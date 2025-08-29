package edu.dosw.lab.Estructurales.Reto5;

public class CafeBase implements Cafe {
    private final int precioBase;

    public CafeBase(int precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public String obtenerDescripcion() {
        return "Café base";
    }

    @Override
    public int calcularCosto() {
        return this.precioBase;
    }

}