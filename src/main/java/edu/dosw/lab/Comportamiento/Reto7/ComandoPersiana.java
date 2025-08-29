package edu.dosw.lab.Comportamiento.Reto7;

public class ComandoPersiana implements Comando {
    private Dispositivo persiana;
    private int nivelAnterior;
    private int nivel;
    private String usuario;

    public ComandoPersiana(Dispositivo persiana, int nivel, String usuario) {
        this.persiana = persiana;
        this.nivel = nivel;
        this.usuario = usuario;
    }

    @Override
    public void ejecutar() {
        nivelAnterior = persiana.getParametro();
        persiana.setParametro(nivel);
    }

    @Override
    public void deshacer() {
        persiana.setParametro(nivelAnterior);
    }

    @Override
    public String getDescripcion() {
        return "Persiana " + persiana.getNombre() + " - Nivel: " + persiana.getParametro();
    }

    @Override
    public String getUsuario() {
        return usuario;
    }
}
 
