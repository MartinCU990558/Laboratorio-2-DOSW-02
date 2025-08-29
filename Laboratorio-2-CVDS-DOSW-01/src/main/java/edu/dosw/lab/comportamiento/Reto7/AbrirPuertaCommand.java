package comportamiento.Reto7;

public class AbrirPuertaCommand implements Command {
    private Puerta puerta;
    private String usuario;

    public AbrirPuertaCommand(Puerta puerta, String usuario) {
        this.puerta = puerta;
        this.usuario = usuario;
    }

    @Override
    public void ejecutar() {
        puerta.abrir();
    }

    @Override
    public void paAtras() {
        puerta.cerrar();
    }

    @Override
    public String getDescripcion() {
        return "Abrir puerta";
    }

    @Override
    public String getDescripcionDeshecha() {
        return "Puerta cerrada";
    }
    
    @Override
    public String getUsuario() {
        return usuario;
    }
}