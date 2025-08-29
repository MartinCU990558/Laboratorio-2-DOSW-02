package edu.dosw.lab.comportamiento.reto7;

public class Luz {
    private boolean encendida = false;

    public void encender() {
        encendida = true;
    }

    public void apagar() {
        encendida = false;
    }

    public boolean isEncendida() {
        return encendida;
    }
}