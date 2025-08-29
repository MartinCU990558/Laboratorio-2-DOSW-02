package edu.dosw.lab.comportamientos.Reto6;

public class Ticket {
    private String descripcion;
    private NivelDificultad dificultad;
    private Prioridad prioridad;
    private boolean resuelto; // nuevo atributo

    public Ticket(String descripcion, NivelDificultad dificultad, Prioridad prioridad) {
        this.descripcion = descripcion;
        this.dificultad = dificultad;
        this.prioridad = prioridad;
        this.resuelto = false; // al inicio está pendiente
    }

    public String getDescripcion() {
        return descripcion;
    }

    public NivelDificultad getDificultad() {
        return dificultad;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    // === Métodos nuevos ===
    public void marcarComoResuelto() {
        this.resuelto = true;
    }

    public boolean isResuelto() {
        return resuelto;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "descripcion='" + descripcion + '\'' +
                ", dificultad=" + dificultad +
                ", prioridad=" + prioridad +
                ", resuelto=" + resuelto +
                '}';
    }
}
