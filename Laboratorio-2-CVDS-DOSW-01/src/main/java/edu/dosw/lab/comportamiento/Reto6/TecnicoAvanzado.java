package comportamiento.Reto6;
public class TecnicoAvanzado extends Tecnico{
    TecnicoAvanzado(String nombre){
        super(nombre, "avanzado", "alta");
    }

    @Override
    protected boolean puedeResolver(Ticket ticket) {
        return ticket.getNivelDificultad().equals("básico") || 
        ticket.getNivelDificultad().equals("intermedio") ||
        ticket.getNivelDificultad().equals("avanzado") && 
        prioridadPermitida(ticket.getPrioridad());
    }

    
}
