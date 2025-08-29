package edu.dosw.lab.comportamiento.reto6;

import java.util.*;

public class Reto6 {
    public static void main(String[] args) {
        Tecnico tecnicoBasico = new Tecnico("Tecnico Basico", Arrays.asList("basico"), 2);
        Tecnico tecnicoIntermedio = new Tecnico("Tecnico Intermedio", Arrays.asList("basico", "intermedio"), 2);
        Tecnico tecnicoAvanzado = new Tecnico("Tecnico Avanzado", Arrays.asList("basico", "intermedio", "avanzado"), 3);

        tecnicoBasico.setSiguiente(tecnicoIntermedio);
        tecnicoIntermedio.setSiguiente(tecnicoAvanzado);

        List<Ticket> tickets = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numero de tickets: ");
        int numTickets = scanner.nextInt();

        scanner.nextLine();

        for (int i = 0; i < numTickets; i++) {
            System.out.println("Ticket " + (i+1) + ":");
            System.out.print("Nivel: ");
            String nivel = scanner.nextLine().toLowerCase();
            System.out.print("Prioridad: ");
            String prioridad = scanner.nextLine().toLowerCase();
            System.out.print("Descripcion: ");
            String descripcion = scanner.nextLine();

            Ticket ticket = new Ticket(i+1, nivel, prioridad, descripcion);
            tickets.add(ticket);
        }

        for (Ticket ticket : tickets) {
            tecnicoBasico.manejarTicket(ticket);
        }

        long ticketsPendientes = tickets.stream().filter(t -> t.getManejadoPor() == null).count();

        Map<String, Long> resueltosPorTecnico = new LinkedHashMap<>();
        resueltosPorTecnico.put("Tecnico Basico", 0L);
        resueltosPorTecnico.put("Tecnico Intermedio", 0L);
        resueltosPorTecnico.put("Tecnico Avanzado", 0L);

        tickets.stream()
                .filter(t -> t.getManejadoPor() != null)
                .forEach(t -> resueltosPorTecnico.put(t.getManejadoPor(), resueltosPorTecnico.get(t.getManejadoPor()) + 1));

        double prioridadPromedio = tickets.stream()
                .filter(t -> t.getManejadoPor() != null)
                .mapToInt(Ticket::getPriorityValue)
                .average()
                .orElse(0.0);

        System.out.println("-- Estadísticas ---");
        System.out.println("Tickets resueltos por técnico:");
        resueltosPorTecnico.forEach((tecnico, count) ->
                System.out.println(tecnico + ": " + count)
        );
        System.out.println("Tickets pendientes: " + ticketsPendientes);
        System.out.println("Promedio de prioridad de tickets resueltos: " + prioridadPromedio);
    }
}
