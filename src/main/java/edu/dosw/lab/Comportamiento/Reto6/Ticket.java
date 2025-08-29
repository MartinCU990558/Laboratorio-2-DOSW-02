package edu.dosw.lab.Comportamiento.Reto6;

public class Ticket {
    private final int id;
    private final int level;
    private final int priority;
    private final String description;

    public Ticket(int id, int level, int priority, String description) {
        this.id = id;
        this.level = level;
        this.priority = priority;
        this.description = description;
    }

    public int getId() { return id; }
    public int getLevel() { return level; }
    public int getPriority() { return priority; }
    public String getDescription() { return description; }
    
}
