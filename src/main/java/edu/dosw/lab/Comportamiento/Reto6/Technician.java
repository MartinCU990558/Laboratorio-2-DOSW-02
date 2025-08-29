package edu.dosw.lab.Comportamiento.Reto6;

public abstract class Technician {
    public static final int BASIC = 1;
    public static final int INTERMEDIATE = 2;
    public static final int ADVANCED = 3;

    public static final int PRIORITY_LOW = 1;
    public static final int PRIORITY_MEDIUM = 2;
    public static final int PRIORITY_HIGH = 3;

    protected Technician next;
    protected final int supportLevel;
    protected final int maxPriority;
    protected int resolvedTickets = 0;

    public Technician(int supportLevel, int maxPriority) {
        this.supportLevel = supportLevel;
        this.maxPriority = maxPriority;
    }

    public void setNext(Technician next) {
        this.next = next;
    }

    public boolean resolve(Ticket ticket) {
        if (canResolve(ticket)) {
            System.out.println("Ticket " + ticket.getId() + ": Técnico " + levelName(supportLevel) + " resolvió el problema.");
            resolvedTickets++;
            return true;
        } else {
            System.out.print("Ticket " + ticket.getId() + ": Técnico " + levelName(supportLevel) + " no pudo resolver. ");
            if (next != null) {
                return next.resolve(ticket);
            } else {
                System.out.println("Ningún técnico disponible. Ticket pendiente de escalamiento.");
                return false;
            }
        }
    }

    private boolean canResolve(Ticket ticket) {
        return (ticket.getLevel() == supportLevel && ticket.getPriority() <= maxPriority)
                || (ticket.getLevel() < supportLevel && ticket.getPriority() <= maxPriority);
    }



    public int getResolvedTickets() { return resolvedTickets; }

    private String levelName(int level) {
        switch (level) {
            case BASIC: return "Básico";
            case INTERMEDIATE: return "Intermedio";
            case ADVANCED: return "Avanzado";
            default: return "Desconocido";
        }
    }
}