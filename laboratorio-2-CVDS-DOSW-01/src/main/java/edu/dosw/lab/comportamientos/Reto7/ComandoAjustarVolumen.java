package edu.dosw.lab.comportamientos.Reto7;

public class ComandoAjustarVolumen implements Comando {
    private final Musica musica;
    private final int nuevoVolumen;
    private int volumenPrevio;
    private final String usuario;

    public ComandoAjustarVolumen(Musica musica, int nuevoVolumen, String usuario) {
        this.musica = musica;
        this.nuevoVolumen = nuevoVolumen;
        this.usuario = usuario;
    }

    public void ejecutar() {
        volumenPrevio = musica.getVolumen();
        musica.setVolumen(nuevoVolumen);
    }

    public void deshacer() { 
        musica.setVolumen(volumenPrevio); 
    }

    public String describir() { 
        return "Volumen ajustado a " + nuevoVolumen + "%"; 
    }

    public String describirDeshacer() { 
        return "Volumen regresado a " + volumenPrevio + "%"; 
    }

    public String usuario() { 
        return usuario; 
    }
}