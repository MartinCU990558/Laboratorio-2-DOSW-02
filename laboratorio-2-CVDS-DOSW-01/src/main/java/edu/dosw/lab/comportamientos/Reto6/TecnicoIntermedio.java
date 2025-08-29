package edu.dosw.lab.comportamientos.Reto6;

public class TecnicoIntermedio implements Tecnico {
    private Tecnico siguiente;  
    private String nombre;     

    public TecnicoIntermedio(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setTecnico(Tecnico siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void atender(Ticket ticket) {
        if (ticket.getDificultad() == NivelDificultad.INTERMEDIO) {
            ticket.marcarComoResuelto();
            System.out.println("El técnico intermedio " + nombre + " resolvió el ticket: " + ticket.getDescripcion());
        } else if (siguiente != null) {
            System.out.println("El técnico intermedio " + nombre + " no puede resolverlo, escalando...");
            siguiente.atender(ticket);
        } else {
            System.out.println("Nadie pudo resolver el ticket: " + ticket.getDescripcion());
        }
    }
}
