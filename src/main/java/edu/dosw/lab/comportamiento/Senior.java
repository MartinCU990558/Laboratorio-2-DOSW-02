package main.java.edu.dosw.lab.comportamiento;

public class Senior implements Technician{
    private String level;

    public Senior(){
        this.level = "Avanzado";
    }

    public Ticket resolve(Ticket ticket){
        if(ticket.getLevel().equals(this.level)){
            ticket.setHistory(ticket.getHistory() + "\n" + "Tecnico Avanzado resolvió el ticket.");
            return ticket.setSolvedBy(this);
        }else{
            ticket.setHistory(ticket.getHistory() + "\n" + "Tecnico Avanzado no pudo resolver el ticket.");
            return ticket;
        }
    }
}
