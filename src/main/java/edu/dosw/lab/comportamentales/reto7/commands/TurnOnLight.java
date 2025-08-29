package main.java.edu.dosw.lab.comportamentales.reto7.commands;

import main.java.edu.dosw.lab.comportamentales.reto7.Command;
import main.java.edu.dosw.lab.comportamentales.reto7.items.Ligths;

public class TurnOnLight implements Command {
    private final Ligths ligth;
    private String user;
    private boolean wasUndo;

    public TurnOnLight(Ligths light, String user){
        this.ligth = light;
        this.user = user;
        this.wasUndo = false;
    }

    public void execute(){
        ligth.turnOn();
    }

    public void undo(){
        wasUndo = true;
        if (ligth.getIsOn()) {
            ligth.turnOff();
        } else {
            ligth.turnOn();
        }
    }

    public String getUser(){
        return user;
    }

    public String getAction(){
        return "Encender/Apagar Luz";
    }

    public String getWasUndo() {
        return wasUndo ? "(Deshecho)" : "";
    }
}
