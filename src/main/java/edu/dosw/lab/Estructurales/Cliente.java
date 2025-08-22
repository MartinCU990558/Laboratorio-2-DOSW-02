package edu.dosw.lab.Estructurales;

public abstract class Cliente {
    protected String tipo;

    public Cliente(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
}
