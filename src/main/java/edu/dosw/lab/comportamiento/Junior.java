package main.java.edu.dosw.lab.comportamiento;

public class Junior implements Technician{
    private Technician superior;
    private String level;

    public Junior(Technician superior){
        this.superior = superior;
        this.level = "Basico";
    }

    public Ticket resolve(Ticket ticket){
        if(ticket.getLevel().equals(this.level)){
            ticket.setHistory(ticket.getHistory() + "\n" + "Tecnico Basico resolvió el ticket.");
            return ticket.setSolvedBy(this);
        }else{
            ticket.setHistory(ticket.getHistory() + "\n" + "Tecnico Basico no pudo resolver el ticket. ");
            return this.superior.resolve(ticket);
        }
    }
}
