package edu.dosw.lab.comportamiento.reto7;
public class ComandoEncenderLuz implements Comando {
    private Luz luz;
    private String usuario;
    private boolean deshecha = false;

    public ComandoEncenderLuz(Luz luz, String usuario) {
        this.luz = luz;
        this.usuario = usuario;
    }

    @Override
    public void ejecutar() { luz.encender(); }

    @Override
    public void deshacer() { luz.apagar(); }

    @Override
    public String getUsuario() { return usuario; }

    @Override
    public String getNombreAccion() { return "Encender luz"; }

    @Override
    public boolean estaDeshecha() { return deshecha; }

    @Override
    public void marcarDeshecho() { deshecha = true; }
}