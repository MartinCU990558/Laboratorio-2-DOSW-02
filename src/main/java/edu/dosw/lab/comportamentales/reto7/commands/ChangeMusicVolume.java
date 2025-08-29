package main.java.edu.dosw.lab.comportamentales.reto7.commands;

import main.java.edu.dosw.lab.comportamentales.reto7.Command;
import main.java.edu.dosw.lab.comportamentales.reto7.items.Music;

public class ChangeMusicVolume implements Command {
    private final Music music;
    private String user;
    private boolean wasUndo;
    private int desiredVolume;

    public ChangeMusicVolume(Music music, String user) {
        this.music = music;
        this.user = user;
        this.wasUndo = false;
    }

    public void execute() {
        music.setVolume(desiredVolume);
    }

    public void undo() {
        wasUndo = true;
        music.setVolume(music.getPreviousVolume());
    }

    public String getUser() {
        return user;
    }

    public String getAction() {
        return "Cambiar Volumen";
    }

    public void setDesiredVolume(int desiredVolume) {
        this.desiredVolume = desiredVolume;
    }

    public String getWasUndo() {
        return wasUndo ? "(Deshecho)" : "";
    }
}
