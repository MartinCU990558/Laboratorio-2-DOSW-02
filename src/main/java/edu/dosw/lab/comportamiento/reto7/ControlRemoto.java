package edu.dosw.lab.comportamiento.reto7;
import java.util.*;

public class ControlRemoto {
    private List<Comando> historial = new ArrayList<>();
    private List<String> mensajesCompletos = new ArrayList<>();

    public void ejecutarAccion(Comando comando, int numeroAccion) {
        comando.ejecutar();
        historial.add(comando);

        String mensajeEjecucion = "Acción " + numeroAccion + " ejecutada por " +
                comando.getUsuario() + ": " + getMensajeEjecucion(comando);
        mensajesCompletos.add(mensajeEjecucion);
    }

    public void deshacerUltimaAccion(int numeroAccion) {
        if (!historial.isEmpty()) {
            Comando ultimo = historial.get(historial.size() - 1);
            ultimo.deshacer();
            ultimo.marcarDeshecho();

            String mensajeDeshacer = "Acción " + numeroAccion + " deshecha: " + getMensajeDeshacer(ultimo);
            mensajesCompletos.add(mensajeDeshacer);
        }
    }

    public void mostrarTodosLosMensajes() {
        for (int i = 0; i < mensajesCompletos.size(); i++) {
            System.out.println(mensajesCompletos.get(i));

            if (i + 1 < mensajesCompletos.size()) {
                String currentAction = mensajesCompletos.get(i).split(" ")[1];
                String nextAction = mensajesCompletos.get(i + 1).split(" ")[1];

                if (!currentAction.equals(nextAction)) {
                    System.out.println();
                }
            }
        }
    }

    private String getMensajeEjecucion(Comando comando) {
        String nombreAccion = comando.getNombreAccion();
        if (nombreAccion.startsWith("Volumen ajustado a")) {
            return nombreAccion;
        } else if (nombreAccion.equals("Reproducir música")) {
            return "Música reproducida";
        } else if (nombreAccion.equals("Encender luz")) {
            return "Luz encendida";
        } else if (nombreAccion.equals("Abrir puerta")) {
            return "Puerta abierta";
        }
        return nombreAccion;
    }

    private String getMensajeDeshacer(Comando comando) {
        String nombreAccion = comando.getNombreAccion();
        if (nombreAccion.startsWith("Volumen ajustado a")) {
            return "Volumen regresado a 0%";
        } else if (nombreAccion.equals("Reproducir música")) {
            return "Música detenida";
        } else if (nombreAccion.equals("Encender luz")) {
            return "Luz apagada";
        } else if (nombreAccion.equals("Abrir puerta")) {
            return "Puerta cerrada";
        }
        return "Acción deshecha";
    }

    public void mostrarHistorial() {
        System.out.println("\n--- Historial completo ---");
        int i = 1;
        for (Comando c : historial) {
            String estado = c.estaDeshecha() ? " (deshecha)" : "";
            System.out.println(i + ": " + c.getNombreAccion() + " – Usuario: " + c.getUsuario() + estado);
            i++;
        }
    }

    public List<Comando> getHistorial() {
        return historial;
    }
}