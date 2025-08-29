package main.java.edu.dosw.lab.comportamentales.reto7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class reto7 {
    private static Scanner input = new Scanner(System.in);
    private static RemoteControl remoteControl = new RemoteControl();
    public static void run() {
        System.out.print("Numero de acciones a Registrar: ");
        int n = input.nextInt();

        System.out.print("Tipos de Accion .\n 1. Encender/Apagar Luz.\n 2. Abrir/Cerrar Ventana.\n 3. Abrir/Cerrar Puerta.\n 4. Cambiar Volumen. ");
        System.out.println("");

        for(int i = 0; i < n; i++) {
            System.out.println("Accion " + (i+1) +"\n");

            System.out.print("Tipo de Accion: ");
            int type = input.nextInt();
            System.out.print("Usuario: ");
            String user = input.next();

            Command command = CommandFactory.createCommand(type, user);
            remoteControl.executeCommand(command);

            System.out.println("Quiere deshacer la accion? (S/N): ");
            if(input.next().equalsIgnoreCase("s")) {
                remoteControl.undoCommand();
            }
        }
        System.out.println("========== Historial de Acciones ==========");
        remoteControl.getHistory().forEach((command) -> {
            System.out.println( command.getAction() + "-> Usuario: "+command.getUser() + " " + command.getWasUndo());
        });

        System.out.println("====== Investigacion ======");
        research(remoteControl.getHistory());

    }

    private static void research(ArrayList<Command> history) {
        Map<String, Integer> persistentActions = new HashMap<>();
        Map<String, Integer> temporatyActions = new HashMap<>();

        for (Command command : history) {
            String usuario = command.getUser();
            if (command.getWasUndo().isEmpty()) {
                persistentActions.put(usuario, persistentActions.getOrDefault(usuario, 0) + 1);
            }else{
                temporatyActions.put(usuario, temporatyActions.getOrDefault(usuario, 0) + 1);
            }
        }
        persistentActions.forEach((usuario, cantidad) -> {
            System.out.println("Se detecta que " + usuario + " realizo " + cantidad + " acciones que alteraron la configuracion.");
        });
        temporatyActions.forEach((usuario, cantidad) -> {
            System.out.println(usuario + " realizo " + cantidad + " acción(es)");
        });
    }
}
