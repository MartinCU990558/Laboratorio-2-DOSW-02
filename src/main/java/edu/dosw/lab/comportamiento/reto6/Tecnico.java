package edu.dosw.lab.comportamiento.reto6;


import java.util.List;

public class Tecnico implements TicketHandler {
    private String nombre;
    private List<String> niveles;
    private int valoresMaxPrioridad;
    private TicketHandler siguiente;

    public Tecnico(String nombre, List<String> niveles, int valoresMaxPrioridad) {
        this.nombre = nombre;
        this.niveles = niveles;
        this.valoresMaxPrioridad = valoresMaxPrioridad;
    }

    @Override
    public void manejarTicket(Ticket ticket) {
        if (puedeManejarlo(ticket)) {
            ticket.setManejadoPor(this.nombre);
            System.out.println("Ticket " + ticket.getNumero() + ": " + this.nombre + " resolvió el problema.");
        } else {
            if (siguiente != null) {
                siguiente.manejarTicket(ticket);
            } else {
                System.out.println("Ticket " + ticket.getNumero() + ": " + this.nombre + " no pudo resolver. Ningún técnico disponible. Ticket pendiente de escalamiento.");
            }
        }
    }

    private boolean puedeManejarlo(Ticket ticket) {
        if (!niveles.contains(ticket.getNivel())) {
            return false;
        }
        int valorPrioridadTicket = ticket.getPriorityValue();
        return valorPrioridadTicket <= valoresMaxPrioridad;
    }

    @Override
    public void setSiguiente(TicketHandler siguiente) {
        this.siguiente = siguiente;
    }
}