package edu.dosw.lab.comportamientos.Reto7;

public class ComandoReproducirMusica implements Comando {
    private final Musica musica;
    private final String usuario;

    public ComandoReproducirMusica(Musica musica, String usuario) {
        this.musica = musica;
        this.usuario = usuario;
    }

    public void ejecutar() { 
        musica.reproducir(); 
    }

    public void deshacer() { 
        musica.detener();
     }
    public String describir() { 
        return "Música reproducida";
     }
    public String describirDeshacer() { 
        return "Música detenida"; 
    }
    public String usuario() {
        return usuario; 
    }
}