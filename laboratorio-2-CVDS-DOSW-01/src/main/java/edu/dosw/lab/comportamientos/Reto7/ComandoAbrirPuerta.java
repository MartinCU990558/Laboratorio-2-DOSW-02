package edu.dosw.lab.comportamientos.Reto7;

public class ComandoAbrirPuerta implements Comando {
    private final Puerta puerta;
    private final String usuario;

    public ComandoAbrirPuerta(Puerta puerta, String usuario) {
        this.puerta = puerta;
        this.usuario = usuario;
    }

    public void ejecutar() { 
        puerta.abrir(); 
    }
    public void deshacer() { 
        puerta.cerrar(); 
    }
    public String describir() { 
        return "Puerta abierta"; 
    }
    public String describirDeshacer() { 
        return "Puerta cerrada";
     }
    public String usuario() { 
        return usuario; 
    }
}

