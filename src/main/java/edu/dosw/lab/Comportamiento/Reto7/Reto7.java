package edu.dosw.lab.Comportamiento.Reto7;

import java.util.*;

public class Reto7 {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ControlRemoto control = new ControlRemoto();
    private static final Map<String, Integer> accionesPorUsuario = new HashMap<>();

    public static void main(String[] args) {
        System.out.print("Número de acciones a registrar: ");
        int numAcciones = scanner.nextInt();
        scanner.nextLine();

        List<Dispositivo> dispositivos = inicializarDispositivos();

        for (int i = 1; i <= numAcciones; i++) {
            System.out.println("\nAcción " + i + ":");
            procesarAccion(i, dispositivos);
        }

        mostrarHistorialCompleto();
        mostrarEstadisticasUsuarios();
    }

    private static List<Dispositivo> inicializarDispositivos() {
        List<Dispositivo> dispositivos = new ArrayList<>();
        dispositivos.add(new Dispositivo("Principal"));
        return dispositivos;
    }

    private static void procesarAccion(int numeroAccion, List<Dispositivo> dispositivos) {
        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();

        System.out.println("Seleccione: 1. Encender luz 2. Abrir puerta 3. Reproducir música 4. Ajustar volumen");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        Comando comando = null;
        Dispositivo dispositivo = dispositivos.get(0);

        switch (opcion) {
            case 1:
                comando = new ComandoLuz(dispositivo, usuario);
                System.out.println("Luz encendida");
                break;
            case 2:
                comando = new ComandoPuerta(dispositivo, usuario);
                System.out.println("Puerta abierta");
                break;
            case 3:
                comando = new ComandoMusica(dispositivo, 50, usuario);
                System.out.println("Música reproducida");
                break;
            case 4:
                System.out.print("Ingrese valor (0-100): ");
                int valor = scanner.nextInt();
                scanner.nextLine();
                comando = new ComandoMusica(dispositivo, valor, usuario);
                System.out.println("Volumen ajustado a " + valor + "%");
                break;
        }

        if (comando != null) {
            control.ejecutarComando(comando);
            accionesPorUsuario.merge(usuario, 1, Integer::sum);

            System.out.print("Deshacer acción? (si/no): ");
            String deshacer = scanner.nextLine();
            if (deshacer.equalsIgnoreCase("si")) {
                control.deshacerComando(control.getHistorial().size() - 1);
                System.out.println("Acción " + numeroAccion + " deshecha: " + obtenerMensajeDeshecho(opcion));
            }
        }
    }

    private static String obtenerMensajeDeshecho(int opcion) {
        return switch (opcion) {
            case 1 -> "Luz apagada";
            case 2 -> "Puerta cerrada";
            case 3 -> "Música detenida";
            case 4 -> "Volumen regresado a 0%";
            default -> "";
        };
    }

    private static void mostrarHistorialCompleto() {
        System.out.println("\n--- Historial completo ---");
        List<Comando> historial = control.getHistorial();
        for (int i = 0; i < historial.size(); i++) {
            Comando comando = historial.get(i);
            System.out.printf("%d: %s - Usuario: %s%s\n",
                    i + 1,
                    comando.getDescripcion(),
                    comando.getUsuario(),
                    comando instanceof ComandoMusica ? " (deshecha)" : "");
        }
    }

    private static void mostrarEstadisticasUsuarios() {
        System.out.println("\n--- Investigando quién desconfiguró los electrodomésticos");
        accionesPorUsuario.forEach((usuario, acciones) -> {
            System.out.printf("%s realizó %d %s.\n",
                    usuario,
                    acciones,
                    acciones == 1 ? "acción" : "acciones");
        });
    }
}