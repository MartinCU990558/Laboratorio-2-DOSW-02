package main.java.edu.dosw.lab.comportamentales.reto7;

import main.java.edu.dosw.lab.comportamentales.reto7.commands.ChangeMusicVolume;
import main.java.edu.dosw.lab.comportamentales.reto7.commands.OpenDoor;
import main.java.edu.dosw.lab.comportamentales.reto7.commands.OpenWindows;
import main.java.edu.dosw.lab.comportamentales.reto7.commands.TurnOnLight;
import main.java.edu.dosw.lab.comportamentales.reto7.items.Door;
import main.java.edu.dosw.lab.comportamentales.reto7.items.Ligths;
import main.java.edu.dosw.lab.comportamentales.reto7.items.Music;
import main.java.edu.dosw.lab.comportamentales.reto7.items.Windows;

import java.util.Scanner;


public class CommandFactory {
    public static Command createCommand(int type, String user){
        Scanner input = new Scanner(System.in);
        switch (type){
            case 1:
                return new TurnOnLight(new Ligths(), user);
            case 2:
                return new OpenWindows(new Windows(), user);
            case 3:
                return new OpenDoor(new Door(), user);
            case 4:
                System.out.print("Volumen deseado: ");
                ChangeMusicVolume command = new ChangeMusicVolume(new Music(), user);
                command.setDesiredVolume(input.nextInt());
                return command;
            default:
                return null;
        }
    }
}
