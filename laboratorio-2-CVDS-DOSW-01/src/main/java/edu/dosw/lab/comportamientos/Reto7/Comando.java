package edu.dosw.lab.comportamientos.Reto7;

public interface Comando {
    void ejecutar();
    void deshacer();
    String describir();           
    String describirDeshacer(); 
    String usuario();
}
