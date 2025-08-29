import java.util.*;

public class SistemaSoporteTecnico {
    private List<Ticket> tickets;
    private TecnicoBasico tecnicoBasico;
    private TecnicoIntermedio tecnicoIntermedio;
    private TecnicoAvanzado tecnicoAvanzado;
    
    public SistemaSoporteTecnico() {
        this.tickets = new ArrayList<>();
        configurarCadena();
    }
    
    private void configurarCadena() {
        tecnicoBasico = new TecnicoBasico("basico");
        tecnicoIntermedio = new TecnicoIntermedio("intermedio");
        tecnicoAvanzado = new TecnicoAvanzado("avanzado");

        tecnicoBasico.setRelevo(tecnicoIntermedio);
        tecnicoIntermedio.setRelevo(tecnicoAvanzado);
    }
    
    public void agregarTicket(Ticket ticket) {
        tickets.add(ticket);
    }
    
    public void procesarTickets() {
        tickets.stream().forEach(t -> {
            System.out.println("Ticket " + t.getNumero() + ":");
            System.out.println(" Nivel: " + t.getNivelDificultad());
            System.out.println(" Prioridad: " + t.getPrioridad());
            System.out.println(" Descripción: " + t.getDescripcion() + "\n");
        });

        tickets.stream().forEach(t -> {
            Tecnico primerTecnico;
            switch (t.getNivelDificultad()) {
                case "básico":
                    primerTecnico = tecnicoBasico;
                    break;
                case "intermedio":
                    primerTecnico = tecnicoIntermedio;
                    break;
                case "avanzado":
                    primerTecnico = tecnicoAvanzado;
                    break;
                default:
                    primerTecnico = tecnicoBasico;
                    break;
            }
            primerTecnico.atender(t);
        });
    }
    
    public void generarEstadisticas() {
        System.out.println("\n-- Estadísticas --");

        Map<String, Integer> prioridadValor = new HashMap<>();
        prioridadValor.put("baja", 1);
        prioridadValor.put("media", 2);
        prioridadValor.put("alta", 3);

        long pendientes = tickets.stream()
            .filter(t -> t.getEstado().equals("Pendiente"))
            .count();

        double promedioPrioridad = tickets.stream()
            .filter(t -> t.getEstado().equals("Resuelto"))
            .mapToInt(t -> prioridadValor.getOrDefault(t.getPrioridad(), 0))
            .average()
            .orElse(0.0);

        System.out.println("- Tickets resueltos: ");
        System.out.println("- Básico: " + tecnicoBasico.getTicketsResueltos());
        System.out.println("- Intermedio: " + tecnicoIntermedio.getTicketsResueltos());
        System.out.println("- Avanzado: " + tecnicoAvanzado.getTicketsResueltos());
        System.out.println("- Tickets pendientes: " + pendientes);

        System.out.printf("- Promedio de prioridad de tickets resueltos: %.1f%n", promedioPrioridad);
        System.out.println();
    }

    public static void ejecutar() {
        SistemaSoporteTecnico ejemplSoporteTecnico = new SistemaSoporteTecnico();

        ejemplSoporteTecnico.agregarTicket(new Ticket("Problema con login", "básico", "baja"));
        ejemplSoporteTecnico.agregarTicket(new Ticket("Error crítico en la instalación", "intermedio", "alta"));
        ejemplSoporteTecnico.agregarTicket(new Ticket("Caída del servidor", "avanzado", "media"));
        ejemplSoporteTecnico.agregarTicket(new Ticket("Problema de facturación", "básico", "alta"));

        ejemplSoporteTecnico.procesarTickets();
        ejemplSoporteTecnico.generarEstadisticas();        
    }
}