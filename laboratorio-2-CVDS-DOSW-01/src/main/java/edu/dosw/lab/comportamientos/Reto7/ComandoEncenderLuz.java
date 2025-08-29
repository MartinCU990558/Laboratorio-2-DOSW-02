package edu.dosw.lab.comportamientos.Reto7;

public class ComandoEncenderLuz implements Comando {
    private final Luz luz;
    private final String usuario;

    public ComandoEncenderLuz(Luz luz, String usuario) {
        this.luz = luz;
        this.usuario = usuario;
    }

    public void ejecutar() { 
        luz.encender(); 
    }
    public void deshacer() { 
        luz.apagar(); 
    }
    public String describir() { 
        return "Luz encendida"; 
    }
    public String describirDeshacer() {
         return "Luz apagada";
         }
    public String usuario() { 
        return usuario;
     }
}