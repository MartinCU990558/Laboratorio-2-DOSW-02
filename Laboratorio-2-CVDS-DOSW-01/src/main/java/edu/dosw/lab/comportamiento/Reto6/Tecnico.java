package comportamiento.Reto6;

import java.util.HashMap;
import java.util.Map;

public abstract class Tecnico {
    protected String nivelMaximo;
    protected String prioridadMaxima;
    protected Tecnico relevo;
    protected String nombre;
    protected int ticketsResueltos = 0;
    protected int ticketsAtendidos = 0;

    public Tecnico (String nombre, String nivelMaximo, String prioridadMaxima){
        this.nombre = nombre;
        this.nivelMaximo = nivelMaximo;
        this.prioridadMaxima = prioridadMaxima;
    }

    public void setRelevo(Tecnico relevo) {
        this.relevo = relevo;
    }

    public void atender(Ticket ticket){
        StringBuilder resultado = new StringBuilder("- Ticket " + ticket.getNumero() + ": ");
        ticketsAtendidos++;
        if (puedeResolver(ticket)){
            resolver(ticket);
            resultado.append("Técnico " + nombre + " resolvió el problema.");
        } else if (relevo != null) {
            resultado.append("Técnico " + nombre + " no pudo resolver. ");
            resultado.append(relevo.atenderCadena(ticket));
        } else {
            resultado.append("Ningún técnico disponible. Ticket pendiente de escalamiento.");
            ticket.setEstado("Pendiente");
        }
        System.out.println(resultado.toString());
    }

    public String atenderCadena(Ticket ticket){
        ticketsAtendidos++;
        if (puedeResolver(ticket)){
            resolver(ticket);
            return "Técnico " + nombre + " resolvió el problema.";
        } else if (relevo != null) {
            return "Técnico " + nombre + " no pudo resolver. " + relevo.atenderCadena(ticket);
        } else {
            ticket.setEstado("Pendiente");
            return "Ningún técnico disponible. Ticket pendiente de escalamiento.";
        }
    }
    protected abstract boolean puedeResolver(Ticket ticket);

    protected void resolver(Ticket ticket){
        ticketsResueltos++;
        ticket.setEstado("Resuelto");
        ticket.setTecnicoResolvio(nombre);
    }

    protected void pasar(Ticket ticket){
        relevo.atender(ticket);
    }

    public int getTicketsResueltos() {
        return ticketsResueltos;
    }

    protected boolean prioridadPermitida(String prioridadTicket){
        Map<String, Integer> prioridadesNivel = new HashMap<>();
        prioridadesNivel.put("baja", 1);
        prioridadesNivel.put("media", 2);
        prioridadesNivel.put("alta", 3);

        return prioridadesNivel.get(prioridadTicket) <= prioridadesNivel.get(prioridadMaxima);
    } 
}

