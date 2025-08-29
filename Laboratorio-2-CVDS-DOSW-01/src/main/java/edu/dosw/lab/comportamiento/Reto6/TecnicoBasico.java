package comportamiento.Reto6;

public class TecnicoBasico extends Tecnico {
    public TecnicoBasico(String nombre){
        super(nombre, "básico", "baja");
    }

    @Override
    protected boolean puedeResolver(Ticket ticket) {
        return ticket.getNivelDificultad().equals("básico") && prioridadPermitida(ticket.getPrioridad());
    }

    
}