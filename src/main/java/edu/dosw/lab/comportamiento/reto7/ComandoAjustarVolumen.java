package edu.dosw.lab.comportamiento.reto7;
public class ComandoAjustarVolumen implements Comando {
    private Musica musica;
    private String usuario;
    private int volumenAnterior;
    private int nuevoVolumen;
    private boolean deshecha = false;

    public ComandoAjustarVolumen(Musica musica, String usuario, int volumen) {
        this.musica = musica;
        this.usuario = usuario;
        this.nuevoVolumen = volumen;
        this.volumenAnterior = musica.getVolumen();
    }

    @Override
    public void ejecutar() { musica.setVolumen(nuevoVolumen); }

    @Override
    public void deshacer() { musica.setVolumen(volumenAnterior); }

    @Override
    public String getUsuario() { return usuario; }

    @Override
    public String getNombreAccion() {
        return "Volumen ajustado a " + nuevoVolumen + "%";
    }

    @Override
    public boolean estaDeshecha() { return deshecha; }

    @Override
    public void marcarDeshecho() { deshecha = true; }
}