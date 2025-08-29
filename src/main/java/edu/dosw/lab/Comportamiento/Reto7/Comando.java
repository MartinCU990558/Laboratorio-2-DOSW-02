package edu.dosw.lab.Comportamiento.Reto7;

public interface Comando {
    void ejecutar();
    void deshacer();
    String getDescripcion();
    String getUsuario();
}
