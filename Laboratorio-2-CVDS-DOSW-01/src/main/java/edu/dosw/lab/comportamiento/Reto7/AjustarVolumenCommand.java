package comportamiento.Reto7;
public class AjustarVolumenCommand implements Command {
    private Volumen volumen;
    private int nivel;
    private String usuario;

    public AjustarVolumenCommand(Volumen volumen, int nivel, String usuario) {
        this.volumen = volumen;
        this.nivel = nivel;
        this.usuario = usuario;
    }

    @Override
    public void ejecutar() {
        volumen.ajustar(nivel);
    }

    @Override
    public void paAtras() {
        volumen.reset();
    }

    @Override
    public String getDescripcion() {
        return "Ajustar volumen a " + nivel + "%";
    }

    @Override
    public String getUsuario() {
        return usuario;
    }

    @Override
    public String getDescripcionDeshecha() {
        return "Volumen regresado a 0%";
    }
}