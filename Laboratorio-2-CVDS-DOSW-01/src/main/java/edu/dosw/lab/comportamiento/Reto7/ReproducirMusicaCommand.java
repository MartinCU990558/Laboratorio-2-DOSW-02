package comportamiento.Reto7;

public class ReproducirMusicaCommand implements Command {
    private Musica musica;
    private String usuario;

    public ReproducirMusicaCommand(Musica musica, String usuario) {
        this.musica = musica;
        this.usuario = usuario;
    }

    @Override
    public void ejecutar() {
        musica.reproducir();
    }

    @Override
    public void paAtras() {
        musica.detener();
    }

    @Override
    public String getDescripcion() {
        return "Reproducir música";
    }

    @Override
    public String getDescripcionDeshecha() {
        return "Música detenida";
    }

    @Override
    public String getUsuario() {
        return usuario;
    }
}