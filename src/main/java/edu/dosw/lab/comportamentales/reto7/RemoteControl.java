package main.java.edu.dosw.lab.comportamentales.reto7;

import java.util.ArrayList;

public class RemoteControl {
    private ArrayList<Command> history = new ArrayList<>();

    public void executeCommand(Command command){
        history.add(command);
        command.execute();
    }

    public void undoCommand(){
        Command register = history.get(history.size() - 1);
        register.undo();
        history.set(history.size() - 1,register);
    }

    public ArrayList<Command> getHistory(){
        return history;
    }


}
