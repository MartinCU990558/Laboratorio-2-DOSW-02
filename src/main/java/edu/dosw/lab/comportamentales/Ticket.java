package main.java.edu.dosw.lab.comportamentales;

public class Ticket {
    private String level;
    private String description;
    private String priority;
    private Technician solvedBy;
    private Boolean isResolved;
    private String history;

    public Ticket(String difficulty, String description, String priority){
        this.level = difficulty;
        this.description = description;
        this.priority = priority;
        this.history = "";
        this.isResolved = false;
    }

    public Ticket setSolvedBy(Technician solvedBy){
        this.solvedBy = solvedBy;
        this.isResolved = true;
        return this;
    }

    public String getLevel(){
        return this.level;
    }

    public String getHistory(){
        return this.history;
    }

    public String getPriority(){
        return this.priority;
    }
    public String getDescription(){
        return this.description;
    }

    public Ticket setHistory(String history){
        this.history = history;
        return this;
    }


}
