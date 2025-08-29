package main.java.edu.dosw.lab.comportamentales.reto7.commands;

import main.java.edu.dosw.lab.comportamentales.reto7.Command;
import main.java.edu.dosw.lab.comportamentales.reto7.items.Windows;

public class OpenWindows implements Command {
    private final Windows windows;
    private String user;
    private boolean wasUndo;

    public OpenWindows(Windows windows, String user){
        this.user = user;
        this.windows = windows;
        this.wasUndo = false;
    }

    public void execute(){
        windows.open();
    }

    public void undo(){
        wasUndo = true;
        if (windows.getIsOpen()){
            windows.close();
        }else {
            windows.open();
        }
    }

    public String getUser(){
        return user;
    }

    public String getAction(){
        return "Abrir/Cerrar Ventanas";
    }

    public String getWasUndo() {
        return wasUndo ? "(Deshecho)" : "";
    }
}
