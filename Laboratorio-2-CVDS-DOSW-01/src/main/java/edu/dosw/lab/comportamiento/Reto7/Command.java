package edu.dosw.lab.comportamiento.Reto7;

public interface Command {
    void ejecutar();
    void paAtras();
    String getDescripcion();
    String getUsuario();
    String getDescripcionDeshecha();
}
