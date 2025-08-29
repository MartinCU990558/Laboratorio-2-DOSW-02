package edu.dosw.lab.Comportamiento.Reto7;

public class ComandoMusica implements Comando {
    private Dispositivo musica;
    private int volumenAnterior;
    private int volumen;
    private String usuario;

    public ComandoMusica(Dispositivo musica, int volumen, String usuario) {
        this.musica = musica;
        this.volumen = volumen;
        this.usuario = usuario;
    }

    @Override
    public void ejecutar() {
        volumenAnterior = musica.getParametro();
        musica.setParametro(volumen);
    }

    @Override
    public void deshacer() {
        musica.setParametro(volumenAnterior);
    }

    @Override
    public String getDescripcion() {
        return "Música " + musica.getNombre() + " - Volumen: " + musica.getParametro();
    }

    @Override
    public String getUsuario() {
        return usuario;
    }
}
 