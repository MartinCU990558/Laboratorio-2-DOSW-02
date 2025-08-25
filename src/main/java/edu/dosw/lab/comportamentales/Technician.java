package main.java.edu.dosw.lab.comportamentales;

import java.util.ArrayList;

public interface Technician {
    public Ticket resolve(Ticket ticket) throws Exception;
    public String getLevel();
    public ArrayList<Ticket> resolveAll(ArrayList<Ticket> tickets);
}
