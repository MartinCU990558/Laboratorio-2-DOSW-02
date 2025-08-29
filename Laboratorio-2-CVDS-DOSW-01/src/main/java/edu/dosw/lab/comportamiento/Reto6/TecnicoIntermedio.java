package comportamiento.Reto6;
public class TecnicoIntermedio extends Tecnico {
    public TecnicoIntermedio(String nombre){
        super(nombre, "intermedio", "media");
    }

    @Override
    protected boolean puedeResolver(Ticket ticket) {
        return ticket.getNivelDificultad().equals("básicos") || 
        ticket.getNivelDificultad().equals("intermedio") && 
        prioridadPermitida(ticket.getPrioridad());
    }
}