package edu.dosw.lab.Comportamiento.Reto7;

public class ComandoPuerta implements Comando {
    private Dispositivo puerta;
    private String estadoAnterior;
    private String usuario;

    public ComandoPuerta(Dispositivo puerta, String usuario) {
        this.puerta = puerta;
        this.usuario = usuario;
    }

    @Override
    public void ejecutar() {
        estadoAnterior = puerta.getEstado();
        puerta.setEstado("abierta");
    }

    @Override
    public void deshacer() {
        puerta.setEstado(estadoAnterior);
    }

    @Override
    public String getDescripcion() {
        return "Puerta " + puerta.getNombre() + " - Estado: " + puerta.getEstado();
    }

    @Override
    public String getUsuario() {
        return usuario;
    }
}
 