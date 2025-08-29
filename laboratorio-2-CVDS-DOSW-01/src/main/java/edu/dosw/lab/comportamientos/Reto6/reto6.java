package edu.dosw.lab.comportamientos.Reto6;

import java.util.Scanner;

public class reto6 {

    public static void iniciarPrograma() {
        Scanner scanner = new Scanner(System.in);
        SoporteTecnico soporte = new SoporteTecnico();

        int ticketsBasico = 0;
        int ticketsIntermedio = 0;
        int ticketsAvanzado = 0;
        int ticketsPendientes = 0;
        int sumaPrioridades = 0;
        int ticketsResueltos = 0;

        System.out.println("=== Sistema de Soporte Técnico ===");

        boolean continuar = true;
        while (continuar) {
            System.out.print("\nIngrese la descripción del problema: ");
            String descripcion = scanner.nextLine().trim();

            System.out.print("Ingrese el nivel de dificultad (BASICO, INTERMEDIO, AVANZADO): ");
            NivelDificultad dificultad = NivelDificultad.valueOf(scanner.nextLine().trim().toUpperCase());

            System.out.print("Ingrese la prioridad (BAJA, MEDIA, ALTA): ");
            Prioridad prioridad = Prioridad.valueOf(scanner.nextLine().trim().toUpperCase());

            Ticket ticket = new Ticket(descripcion, dificultad, prioridad);
            soporte.procesarTicket(ticket);

           
            if (ticket.isResuelto()) {
                ticketsResueltos++;
                sumaPrioridades += prioridad.ordinal() + 1;
                switch (dificultad) {
                    case BASICO:
                        ticketsBasico++;
                        break;
                    case INTERMEDIO:
                        ticketsIntermedio++;
                        break;
                    case AVANZADO:
                        ticketsAvanzado++;
                        break;
                }
            } else {
                ticketsPendientes++;
            }

            System.out.print("\n¿Desea registrar otro ticket? (si/no): ");
            String respuesta = scanner.nextLine().trim();
            continuar = respuesta.equalsIgnoreCase("si");
        }

        System.out.println("\n--- Estadísticas ---");
        System.out.println("• Tickets resueltos: " + ticketsResueltos);
        System.out.println("• Básico: " + ticketsBasico);
        System.out.println("• Intermedio: " + ticketsIntermedio);
        System.out.println("• Avanzado: " + ticketsAvanzado);
        System.out.println("• Tickets pendientes: " + ticketsPendientes);
        if (ticketsResueltos > 0) {
            double promedioPrioridad = (double) sumaPrioridades / ticketsResueltos;
            System.out.println("• Promedio de prioridad de tickets resueltos: " + promedioPrioridad);
        } else {
            System.out.println("• Promedio de prioridad de tickets resueltos: N/A");
        }

        System.out.println("\nGracias por usar el sistema de soporte técnico.");
    }
}
