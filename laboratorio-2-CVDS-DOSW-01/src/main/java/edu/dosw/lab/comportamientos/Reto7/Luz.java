package edu.dosw.lab.comportamientos.Reto7;


public class Luz {
    private boolean encendida;

    public void encender() { 
        encendida = true; 
    }
    public void apagar() { 
        encendida = false; 
    }
    public boolean estaEncendida() { 
        return encendida; 
    }
}
