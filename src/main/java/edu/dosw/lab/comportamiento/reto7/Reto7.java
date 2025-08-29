package edu.dosw.lab.comportamiento.reto7;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map;

public class Reto7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ControlRemoto control = new ControlRemoto();

        Luz luz = new Luz();
        Puerta puerta = new Puerta();
        Musica musica = new Musica();

        System.out.print("Número de acciones a registrar: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nAcción " + i + ":");
            System.out.print("Usuario: ");
            String usuario = sc.nextLine();

            if (i == 1) {
                System.out.println("Seleccione: 1. Encender luz 2. Abrir puerta 3. Reproducir música 4. Ajustar volumen");
            } else {
                System.out.print("Seleccione: ");
            }

            int opcion = sc.nextInt();
            sc.nextLine();

            Comando comando = null;

            switch (opcion) {
                case 1 -> comando = new ComandoEncenderLuz(luz, usuario);
                case 2 -> comando = new ComandoAbrirPuerta(puerta, usuario);
                case 3 -> comando = new ComandoReproducirMusica(musica, usuario);
                case 4 -> {
                    System.out.print("Ingrese valor (0-100): ");
                    int valor = sc.nextInt();
                    sc.nextLine();
                    comando = new ComandoAjustarVolumen(musica, usuario, valor);
                }
                default -> System.out.println("Opción no válida.");
            }

            if (comando != null) {
                control.ejecutarAccion(comando, i);

                System.out.print("Deshacer acción? (si/no): ");
                String resp = sc.nextLine();
                if (resp.equalsIgnoreCase("si")) {
                    control.deshacerUltimaAccion(i);
                }

                if (i < n) {
                    System.out.println();
                }
            }
        }



        control.mostrarTodosLosMensajes();

        control.mostrarHistorial();

        System.out.println("\n--- Investigando quién desconfiguró los electrodomésticos ---");

        LinkedHashMap<String, Integer> contador = new LinkedHashMap<>();
        for (Comando c : control.getHistorial()) {
            String usuario = c.getUsuario();
            if (!contador.containsKey(usuario)) {
                contador.put(usuario, 1);
            } else {
                contador.put(usuario, contador.get(usuario) + 1);
            }
        }

        boolean primero = true;
        for (Map.Entry<String, Integer> entry : contador.entrySet()) {
            if (primero) {
                System.out.println("Se detecta que " + entry.getKey() + " realizó " + entry.getValue() +
                        (entry.getValue() == 1 ? " acción que alteró la configuración." : " acciones que alteraron la configuración."));
                primero = false;
            } else {
                System.out.println(entry.getKey() + " realizó " + entry.getValue() +
                        (entry.getValue() == 1 ? " acción." : " acciones."));
            }
        }
    }
}