package main.java.edu.dosw.lab.comportamentales.reto7.commands;

import main.java.edu.dosw.lab.comportamentales.reto7.Command;
import main.java.edu.dosw.lab.comportamentales.reto7.items.Door;

public class OpenDoor implements Command {
    private Door door;
    private String user;
    private boolean wasUndo;

    public OpenDoor(Door door, String user){
        this.door = door;
        this.user = user;
        this.wasUndo = false;
    }

    public void execute(){
        door.open();
        this.user = user;
    }

    public void undo(){
        wasUndo = true;
        if (door.getIsOpen()){
            door.close();
        }else {
            door.open();
        }
    }

    public String getUser(){
        return user;
    }

    public String getAction(){
        return "Abrir/Cerrar Puerta";
    }

    public String getWasUndo() {
        return wasUndo ? "(Deshecho)" : "";
    }
}
