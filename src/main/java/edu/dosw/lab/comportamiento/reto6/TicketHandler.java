package Reto6;

public interface TicketHandler {
    void manejarTicket(Ticket ticket);
    void setSiguiente(TicketHandler siguiente);
}