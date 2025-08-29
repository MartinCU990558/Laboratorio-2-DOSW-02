package edu.dosw.lab.comportamiento.reto7;

public class Musica {
    private int volumen = 0;
    private boolean reproduciendo = false;

    public void setVolumen(int volumen) {
        this.volumen = Math.max(0, Math.min(100, volumen));
    }

    public void reproducir() {
        reproduciendo = true;
    }

    public void detener() {
        reproduciendo = false;
    }

    public int getVolumen() {
        return volumen;
    }

    public boolean isReproduciendo() {
        return reproduciendo;
    }
}