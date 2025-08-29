package edu.dosw.lab.comportamiento.reto7;
public class ComandoReproducirMusica implements Comando {
    private Musica musica;
    private String usuario;
    private boolean deshecha = false;

    public ComandoReproducirMusica(Musica musica, String usuario) {
        this.musica = musica;
        this.usuario = usuario;
    }

    @Override
    public void ejecutar() { musica.reproducir(); }

    @Override
    public void deshacer() { musica.detener(); }

    @Override
    public String getUsuario() { return usuario; }

    @Override
    public String getNombreAccion() { return "Reproducir música"; }

    @Override
    public boolean estaDeshecha() { return deshecha; }

    @Override
    public void marcarDeshecho() { deshecha = true; }
}