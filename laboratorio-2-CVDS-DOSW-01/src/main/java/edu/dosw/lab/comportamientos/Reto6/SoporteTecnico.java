package edu.dosw.lab.comportamientos.Reto6;

public class SoporteTecnico {
    private Tecnico tecnicoInicial; 
    public SoporteTecnico() {

        Tecnico basico = new TecnicoBasico("Carlos");
        Tecnico intermedio = new TecnicoIntermedio("María");
        Tecnico avanzado = new TecnicoAvanzado("Juan");


        basico.setTecnico(intermedio);
        intermedio.setTecnico(avanzado);

      
        this.tecnicoInicial = basico;
    }

    public void procesarTicket(Ticket ticket) {
        System.out.println("\nNuevo ticket recibido: " + ticket.getDescripcion());
        tecnicoInicial.atender(ticket);
    }
}
