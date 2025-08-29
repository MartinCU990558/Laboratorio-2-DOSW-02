package edu.dosw.lab.Comportamiento.Reto7;

public class ComandoLuz implements Comando {
    private Dispositivo luz;
    private String estadoAnterior;
    private String usuario;

    public ComandoLuz(Dispositivo luz, String usuario) {
        this.luz = luz;
        this.usuario = usuario;
    }

    @Override
    public void ejecutar() {
        estadoAnterior = luz.getEstado();
        luz.setEstado("encendido");
    }

    @Override
    public void deshacer() {
        luz.setEstado(estadoAnterior);
    }

    @Override
    public String getDescripcion() {
        return "Luz " + luz.getNombre() + " - Estado: " + luz.getEstado();
    }

    @Override
    public String getUsuario() {
        return usuario;
    }
}
