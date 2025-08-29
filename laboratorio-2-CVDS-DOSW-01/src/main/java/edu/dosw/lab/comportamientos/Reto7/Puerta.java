package edu.dosw.lab.comportamientos.Reto7;

public class Puerta {
    private boolean abierta;

    public void abrir() { 
        abierta = true; 
    }
    public void cerrar() { 
        abierta = false;
     }
    public boolean estaAbierta() {
         return abierta;
         }
}