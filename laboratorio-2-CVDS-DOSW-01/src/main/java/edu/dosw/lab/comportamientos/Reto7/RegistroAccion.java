package edu.dosw.lab.comportamientos.Reto7;

import java.time.Instant;

public class RegistroAccion {
    private final int id;
    private final String usuario;
    private final Comando comando;
    private final Instant momento;
    private boolean deshecha;

    public RegistroAccion(int id, String usuario, Comando comando, Instant momento) {
        this.id = id;
        this.usuario = usuario;
        this.comando = comando;
        this.momento = momento;
        this.deshecha = false;
    }

    public int getId() { return id; }
    public String getUsuario() { 
        return usuario; 
    }
    public Comando getComando() { 
        return comando; 
    }
    public Instant getMomento() { 
        return momento;
     }
    public boolean isDeshecha() {
         return deshecha; 
        }
    public void marcarDeshecha() { 
        this.deshecha = true; 
    }

    public String resumen() {
        return String.format("%d: %s – Usuario: %s%s",
                id, comando.describir(), usuario, deshecha ? " (deshecha)" : "");
    }
}