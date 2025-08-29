package edu.dosw.lab.comportamiento.reto7;

public interface Comando {
    void ejecutar();
    void deshacer();
    String getUsuario();
    String getNombreAccion();
    boolean estaDeshecha();
    void marcarDeshecho();
}
