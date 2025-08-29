package edu.dosw.lab.comportamientos.Reto6;

public class TecnicoAvanzado implements Tecnico {
    private Tecnico siguiente;   // referencia al siguiente en la cadena
    private String nombre;       // nombre del técnico

    public TecnicoAvanzado(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setTecnico(Tecnico siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void atender(Ticket ticket) {
        if (ticket.getDificultad() == NivelDificultad.AVANZADO) {
            ticket.marcarComoResuelto();
            System.out.println("El técnico avanzado " + nombre + " resolvió el ticket: " + ticket.getDescripcion());
        } else if (siguiente != null) {
            System.out.println("El técnico avanzado " + nombre + " no puede resolverlo, escalando...");
            siguiente.atender(ticket);
        } else {
            System.out.println("Nadie pudo resolver el ticket: " + ticket.getDescripcion());
        }
    }
}
