package edu.dosw.lab.comportamientos.Reto7;

public class Musica {
    private boolean reproduciendo;
    private int volumen; // 0-100

    public void reproducir() {
         reproduciendo = true;
         }
    public void detener() {
         reproduciendo = false; 
        }
    public boolean estaReproduciendo() { 
        return reproduciendo; 
    }

    public int getVolumen() { return volumen; }
    public void setVolumen(int v) {
        if (v < 0) v = 0;
        if (v > 100) v = 100;
        volumen = v;
    }
}