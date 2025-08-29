package main.java.edu.dosw.lab.comportamentales;

import java.util.ArrayList;

public class Senior implements Technician{
    private String level;
    private ArrayList<String>  specialties = new ArrayList<String>();

    public Senior(){
        this.level = "avanzado";
        specialties.add("problema con login");
        specialties.add("error critico en instalacion");
        specialties.add("caida del servidor");

    }

    public Ticket resolve(Ticket ticket) throws Exception{
        if(specialties.contains(ticket.getDescription())){
            ticket.setHistory(ticket.getHistory()+ "Tecnico Avanzado resolvió el ticket.");
            return ticket.setSolvedBy(this);
        }else{
            ticket.setHistory(ticket.getHistory() +"Ningun tecnico disponible. Ticket pendiente de escalamiento.");
            throw new Exception("Ningun tecnico disponible. Ticket pendiente de escalamiento.");
        }
    }

    public ArrayList<Ticket> resolveAll(ArrayList<Ticket> tickets){
        ArrayList<Ticket> ticketsReviewed = new ArrayList<Ticket>();
        for(Ticket ticket : tickets){
            try {
                ticketsReviewed.add(this.resolve(ticket));
            } catch (Exception e) {
                ticketsReviewed.add(ticket);
                continue;
            }
        }
        return ticketsReviewed;
    }

    public String getLevel(){
        return this.level;
    }
}
