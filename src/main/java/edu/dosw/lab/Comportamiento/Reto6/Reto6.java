package edu.dosw.lab.Comportamiento.Reto6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reto6 {
    public static void main(String[] args) {
        Technician basic = new BasicTechnician();
        Technician intermediate = new IntermediateTechnician();
        Technician advanced = new AdvancedTechnician();

        basic.setNext(intermediate);
        intermediate.setNext(advanced);

        List<Ticket> tickets = Arrays.asList(
                new Ticket(1, Technician.BASIC, Technician.PRIORITY_LOW, "Problema con login"),
                new Ticket(2, Technician.INTERMEDIATE, Technician.PRIORITY_HIGH, "Error crítico en instalación"),
                new Ticket(3, Technician.ADVANCED, Technician.PRIORITY_MEDIUM, "Caída del servidor"),
                new Ticket(4, Technician.BASIC, Technician.PRIORITY_HIGH, "Problema de facturación")
        );

        List<Ticket> resolved = new ArrayList<>();
        List<Ticket> pending = new ArrayList<>();

        for (Ticket t : tickets) {
            boolean result = basic.resolve(t);
            if (result) resolved.add(t);
            else pending.add(t);
        }

        System.out.println("-- Estadísticas ---");
        System.out.println("• Tickets resueltos:");
        System.out.println("• Básico: " + basic.getResolvedTickets());
        System.out.println("• Intermedio: " + intermediate.getResolvedTickets());
        System.out.println("• Avanzado: " + advanced.getResolvedTickets());
        System.out.println("• Tickets pendientes: " + pending.size());

        double avgPriority = resolved.stream()
                .collect(Collectors.averagingDouble(Ticket::getPriority));

        System.out.println("• Promedio de prioridad de tickets resueltos: " + avgPriority);
    }
}
