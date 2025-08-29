package edu.dosw.lab.comportamiento.reto7;

public class Puerta {
    private boolean abierta = false;

    public void abrir() {
        abierta = true;
    }

    public void cerrar() {
        abierta = false;
    }

    public boolean isAbierta() {
        return abierta;
    }
}