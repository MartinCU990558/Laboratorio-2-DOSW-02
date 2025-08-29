package edu.dosw.lab.Comportamiento.reto4;

public abstract class Moneda {
    protected double cantidad;
    protected String codigo;

    public Moneda(double cantidad) {
        this.cantidad = cantidad;
    }

    public abstract double convertirA(Moneda otraMoneda);
    public abstract double getTasa(String codigoDestino);

    public double getCantidad() {
        return cantidad;
    }

    public String getCodigo() {
        return codigo;
    }
}
