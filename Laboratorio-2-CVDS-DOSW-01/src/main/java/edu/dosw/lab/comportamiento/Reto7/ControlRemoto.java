package edu.dosw.lab.comportamiento.Reto7;

import java.util.*;
import java.util.stream.Collectors;

public class ControlRemoto {
    private List<Command> historial = new ArrayList<>();
    private Map<Command, Boolean> fueDeshecha = new HashMap<>();

    public void ejecutarAccion(Command comando, boolean deshacer) {
        int numAccion = historial.size() + 1;
        System.out.println("Acción " + numAccion + " ejecutada por " + comando.getUsuario() + ": " + comando.getDescripcion());
        comando.ejecutar();
        if (deshacer) {
            System.out.println("Acción " + numAccion + " deshecha: " + comando.getDescripcionDeshecha());
            comando.paAtras();
            fueDeshecha.put(comando, true);
        } else {
            fueDeshecha.put(comando, false);
        }
        historial.add(comando);
    }

    public void mostrarHistorial() {
        System.out.println("\n---- Historial completo ----");
        int i = 1;
        for (Command c : historial) {
            String deshecha;
            if (fueDeshecha.getOrDefault(c, false)) {
                deshecha = " (deshecha)";
            } else {
                deshecha = "";
            }
            System.out.println(i++ + ": " + c.getDescripcion() + " - Usuario: " + c.getUsuario() + deshecha);
        }
    }

    public void analizarUsuarios() {
        Map<String, Long> contador = historial.stream()
            .collect(Collectors.groupingBy(Command::getUsuario, Collectors.counting()));

        System.out.println("\n---- Investigando quién desconfiguró los electrodomésticos ----");

        long maxAcciones = contador.values().stream().max(Long::compare).orElse(0L);
        List<String> maxUsuarios = contador.entrySet().stream()
            .filter(e -> e.getValue() == maxAcciones)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());

        if (!maxUsuarios.isEmpty()) {
            System.out.println("Se detecta que " + maxUsuarios.get(0) + " realizó " + maxAcciones + " acciones que alteraron la configuración.");
        }
        contador.forEach((usuario, acciones) -> {
            String palabra;
            if (acciones > 1) {
                palabra = "acciones.";
            } else {
                palabra = "acción.";
            }
            System.out.println(usuario + " realizó " + acciones + " " + palabra);
        });
    }

    public void ejecutar(){
        ControlRemoto control = new ControlRemoto();

        Luz luz = new Luz();
        Puerta puerta = new Puerta();
        Musica musica = new Musica();
        Volumen volumen = new Volumen();

        Command accion1 = new AjustarVolumenCommand(volumen, 75, "Andrés");
        control.ejecutarAccion(accion1, true);

        Command accion2 = new AbrirPuertaCommand(puerta, "Camila");
        control.ejecutarAccion(accion2, false);

        Command accion3 = new ReproducirMusicaCommand(musica, "Andrés");
        control.ejecutarAccion(accion3, true);

        Command accion4 = new EncenderLuzCommand(luz, "Laura");
        control.ejecutarAccion(accion4, false);

        control.mostrarHistorial();
        control.analizarUsuarios();
    }
}