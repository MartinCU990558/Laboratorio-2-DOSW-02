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