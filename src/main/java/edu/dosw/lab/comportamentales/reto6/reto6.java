package main.java.edu.dosw.lab.comportamentales.reto6;

import java.util.ArrayList;
import java.util.Scanner;

public class reto6 {
    private static ArrayList<Ticket> tickets = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    public static void run() {
        System.out.print("Numero de tickets: ");
        receiveTickets();
        ArrayList<Ticket> ticketsReviewed = sendTickets();

        for(Ticket ticket : ticketsReviewed){
            System.out.println(ticket.getHistory());
        }

        printStats(ticketsReviewed);

    }

    private static void printStats(ArrayList<Ticket> ticketsReviewed) {
        int basic = 0;
        int intermediate = 0;
        int advanced = 0;

        for(Ticket ticket : ticketsReviewed){
            if (!ticket.getHistory().contains("resolvió")){
                continue;
            }
            if(ticket.getLevel().equals("basico") ) basic++;
            else if(ticket.getLevel().equals("intermedio")) intermediate++;
            else advanced++;
        }

        System.out.println("Estadisticas:");
        System.out.println("Tickets resueltos:");
        System.out.println("Basico:"+ basic);
        System.out.println("Intermedio:"+ intermediate);
        System.out.println("Avanzado:"+ advanced);
        System.out.println("Tickets no resueltos: "+  (ticketsReviewed.size() - basic - intermediate - advanced));

    }

    private static ArrayList<Ticket> sendTickets() {
        Technician senior = new Senior();
        Technician mid = new Mid(senior);
        Technician junior = new Junior(mid);

        return junior.resolveAll(tickets);
    }

    private static void receiveTickets() {
        int n = Integer.parseInt(input.nextLine());
        for(int i = 0; i < n; i++) {
            System.out.println("Ticket "+(i+1) +":");
            System.out.print("Nivel: ");
            String level = input.nextLine().toLowerCase();
            System.out.print("Prioridad: ");
            String priority = input.nextLine().toLowerCase();
            System.out.print("Descripcion: ");
            String description = input.nextLine().toLowerCase();

            tickets.add(new Ticket(level, description, priority));
        }
    }
}