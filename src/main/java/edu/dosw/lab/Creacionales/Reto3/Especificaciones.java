package edu.dosw.lab.Creacionales.Reto3;

public final class Especificaciones {
    private final int velocidadMaxKmH;
    private final int precioCop;
    private final String equipamiento;


    public Especificaciones(int velocidadMaxKmH, int precioCop, String equipamiento) {
        this.velocidadMaxKmH = velocidadMaxKmH;
        this.precioCop = precioCop;
        this.equipamiento = equipamiento;
    }


    public int getVelocidadMaxKmH() { return velocidadMaxKmH; }
    public int getPrecioCop() { return precioCop; }
    public String getEquipamiento() { return equipamiento; }

}