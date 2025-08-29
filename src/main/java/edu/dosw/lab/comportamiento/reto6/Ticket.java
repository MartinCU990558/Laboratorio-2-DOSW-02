package edu.dosw.lab.comportamiento.reto6;


public class Ticket {
    private int numero;
    private String nivel;
    private String prioridad;
    private String descripcion;
    private String manejadoPor;
    public Ticket(int numero, String level, String prioridad, String descripcion) {
        this.numero = numero;
        this.nivel = level;
        this.prioridad = prioridad;
        this.descripcion = descripcion;
    }

    public int getNumero() {
        return numero;
    }

    public String getNivel() {
        return nivel;
    }

    public String getManejadoPor() {
        return manejadoPor;
    }

    public void setManejadoPor(String manejadoPor) {
        this.manejadoPor = manejadoPor;
    }

    public int getPriorityValue() {
        switch (this.prioridad) {
            case "baja":
                return 1;
            case "media":
                return 2;
            case "alta":
                return 3;
            default:
                return 0;
        }
    }
}
