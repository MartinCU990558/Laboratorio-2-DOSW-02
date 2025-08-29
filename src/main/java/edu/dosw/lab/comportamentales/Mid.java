package main.java.edu.dosw.lab.comportamentales;

import java.util.ArrayList;

public class Mid implements Technician{
    private Technician superior;
    private String level;
    private String priority;
    private ArrayList<String> specialties = new ArrayList<String>();

    public Mid(Technician superior){
        this.superior = superior;
        this.level = "intermedio";
        specialties.add("problema con login");
        specialties.add("error critico en instalacion");
        specialties.add("error critico en eliminacion");
    }

    public Ticket resolve(Ticket ticket) throws Exception {
        if(!ticket.getLevel().equals("avanzado") &&
           !ticket.getPriority().equals("alta") &&
           this.specialties.contains(ticket.getDescription())){
            ticket.setHistory(ticket.getHistory() + "Tecnico Intermedio resolvió el ticket.");
            return ticket.setSolvedBy(this);
        }else{
            ticket.setHistory(ticket.getHistory() + "Tecnico Intermedio no pudo resolver el ticket.");
            throw new Exception("Tecnico Intermedio no pudo resolver el ticket.");
        }
    }
    public ArrayList<Ticket> resolveAll(ArrayList<Ticket> tickets){
        ArrayList<Ticket> ticketsReviewed = new ArrayList<Ticket>();
        for(Ticket ticket : tickets){
            try {
                ticketsReviewed.add(this.resolve(ticket));
            } catch (Exception e) {
                ArrayList<Ticket> remainingTickets = new ArrayList<>(tickets);
                remainingTickets.removeAll(ticketsReviewed);
                ticketsReviewed.addAll(this.superior.resolveAll(remainingTickets));
                break;
            }
        }
        return ticketsReviewed;
    }

    public String getLevel(){
        return this.level;
    }
}
