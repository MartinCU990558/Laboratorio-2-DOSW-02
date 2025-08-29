package comportamiento.Reto7;

public class EncenderLuzCommand implements Command {
    private Luz luz;
    private String usuario;

    public EncenderLuzCommand(Luz luz, String usuario) {
        this.luz = luz;
        this.usuario = usuario;
    }

    @Override
    public void ejecutar() {
        luz.encender();
    }

    @Override
    public void paAtras() {
        luz.apagar();
    }

    @Override
    public String getDescripcion() {
        return "Encender luz";
    }

    @Override
    public String getDescripcionDeshecha() {
        return "Luz apagada";
    }
    
    @Override
    public String getUsuario() {
        return usuario;
    }
}