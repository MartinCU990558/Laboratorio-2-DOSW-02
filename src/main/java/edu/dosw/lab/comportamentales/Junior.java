package main.java.edu.dosw.lab.comportamentales;

import java.util.ArrayList;

public class Junior implements Technician{
    private Technician superior;
    private String level;
    private ArrayList<String>  specialties = new ArrayList<String>();

    public Junior(Technician superior){
        this.superior = superior;
        this.level = "basico";
        specialties.add("problema con login");
        specialties.add("problema con registro");
    }

    public Ticket resolve(Ticket ticket) throws Exception {
        if(ticket.getLevel().equals(this.level) &&
           !ticket.getPriority().equals("alta") &&
            this.specialties.contains(ticket.getDescription())){
            ticket.setHistory(ticket.getHistory() +"Tecnico Basico resolvió el ticket.");
            return ticket.setSolvedBy(this);
        }else{
            ticket.setHistory(ticket.getHistory() +"Tecnico Basico no pudo resolver el ticket. ");
            throw new Exception("Tecnico Basico no pudo resolver el ticket.");
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
