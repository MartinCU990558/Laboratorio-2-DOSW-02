package main.java.edu.dosw.lab.comportamiento;

public class Ticket {
    private String level;
    private String description;
    private Technician solvedBy;
    private String status;
    private String history;

    public Ticket(String difficulty, String description){
        this.level = difficulty;
        this.description = description;
        this.status = "unresolved";
    }

    public Ticket setSolvedBy(Technician solvedBy){
        this.solvedBy = solvedBy;
        return this;
    }

    public String getLevel(){
        return this.level;
    }

    public String getHistory(){
        return this.history;
    }

    public Ticket setHistory(String history){
        this.history = history;
        return this;
    }

}
