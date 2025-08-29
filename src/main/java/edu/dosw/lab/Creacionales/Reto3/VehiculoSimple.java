package edu.dosw.lab.Creacionales.Reto3;

public final class VehiculoSimple implements Vehiculo {
    private final Tipo tipo;
    private final Categoria categoria;
    private final String modelo;
    private final int velocidadMaxKmH;
    private final int precioCop;
    private final String equipamiento;


    public VehiculoSimple(Tipo tipo, Categoria categoria, String modelo,
        int velocidadMaxKmH, int precioCop, String equipamiento) {
        this.tipo = tipo;
        this.categoria = categoria;
        this.modelo = modelo;
        this.velocidadMaxKmH = velocidadMaxKmH;
        this.precioCop = precioCop;
        this.equipamiento = equipamiento;
    }


    @Override public Tipo getTipo() { return tipo; }
    @Override public Categoria getCategoria() { return categoria; }
    @Override public String getModelo() { return modelo; }
    @Override public int getVelocidadMaxKmH() { return velocidadMaxKmH; }
    @Override public int getPrecioCop() { return precioCop; }
    @Override public String getEquipamiento() { return equipamiento; }

}
