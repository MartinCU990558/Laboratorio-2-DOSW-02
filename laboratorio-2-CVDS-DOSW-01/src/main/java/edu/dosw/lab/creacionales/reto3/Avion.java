package edu.dosw.lab.creacionales.reto3;

public class Avion implements Vehiculo {
    private final String categoria;
    private final double precio;
    private final int velocidadMaxima;
    private final String equipamiento;
    public Avion(String categoria, double precio, int velocidadMaxima, String equipamiento) {
        this.categoria = categoria;
        this.precio = precio;
        this.velocidadMaxima = velocidadMaxima;
        this.equipamiento = equipamiento;
    }
    @Override
    public String getTipo() { return "Avión"; }
    @Override
    public String getCategoria() { return categoria; }
    @Override
    public double getPrecio() { return precio; }
    @Override
    public int getVelocidadMaxima() { return velocidadMaxima; }
    @Override
    public String getEquipamiento() { return equipamiento; }
}
