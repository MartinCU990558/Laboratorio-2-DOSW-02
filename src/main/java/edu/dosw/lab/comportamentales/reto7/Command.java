package main.java.edu.dosw.lab.comportamentales.reto7;

public interface Command {
    public void execute();
    public void undo();
    public String getAction();
    public String getUser();
    public String getWasUndo();
}
