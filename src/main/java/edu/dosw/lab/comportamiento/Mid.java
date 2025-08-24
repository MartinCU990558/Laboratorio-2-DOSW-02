package main.java.edu.dosw.lab.comportamiento;

public class Mid implements Technician{
    private Technician superior;
    private String level;

    public Mid(Technician superior){
        this.superior = superior;
        this.level = "Intermedio";
    }

    public Ticket resolve(Ticket ticket){
        if(ticket.getLevel().equals(this.level)){
            ticket.setHistory(ticket.getHistory() + "\n" + "Tecnico Intermedio resolvió el ticket.");
            return ticket.setSolvedBy(this);
        }else{
            ticket.setHistory(ticket.getHistory() + "\n" + "Tecnico Intermedio no pudo resolver el ticket.");
            return this.superior.resolve(ticket);
        }
    }

    public String getLevel(){
        return this.level;
    }
}
