package edu.dosw.lab.comportamiento.reto7;

public class ComandoAbrirPuerta implements Comando {
    private Puerta puerta;
    private String usuario;
    private boolean deshecha = false;

    public ComandoAbrirPuerta(Puerta puerta, String usuario) {
        this.puerta = puerta;
        this.usuario = usuario;
    }

    @Override
    public void ejecutar() { puerta.abrir(); }

    @Override
    public void deshacer() { puerta.cerrar(); }

    @Override
    public String getUsuario() { return usuario; }

    @Override
    public String getNombreAccion() { return "Abrir puerta"; }

    @Override
    public boolean estaDeshecha() { return deshecha; }

    @Override
    public void marcarDeshecho() { deshecha = true; }
}