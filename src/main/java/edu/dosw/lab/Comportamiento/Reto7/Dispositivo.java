package edu.dosw.lab.Comportamiento.Reto7;

public class Dispositivo {
    private String nombre;
    private String estado;
    private int parametro;

    public Dispositivo(String nombre) {
        this.nombre = nombre;
        this.estado = "apagado";
        this.parametro = 0;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setParametro(int parametro) {
        this.parametro = parametro;
    }

    public String getEstado() {
        return estado;
    }

    public int getParametro() {
        return parametro;
    }

    public String getNombre() {
        return nombre;
    }
}
