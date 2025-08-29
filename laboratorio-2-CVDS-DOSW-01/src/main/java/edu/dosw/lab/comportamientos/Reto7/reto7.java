package edu.dosw.lab.comportamientos.Reto7;

import java.util.Scanner;

public class reto7 {
    public static void iniciarPrograma() {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Número de acciones a registrar: ");
            int n = Integer.parseInt(sc.nextLine().trim());
            System.out.println();

            Dispositivos dispositivos = new Dispositivos();
            ControlRemoto control = new ControlRemoto();

            for (int i = 1; i <= n; i++) {
                System.out.printf("Acción %d:%n", i);
                System.out.print("Usuario: ");
                String usuario = sc.nextLine().trim();

                Comando comando = FabricaComandos.crearComandoDesdeEntrada(sc, dispositivos, usuario);

                var registro = control.enviar(comando);

                System.out.print("Deshacer acción? (si/no): ");
                String ans = sc.nextLine().trim().toLowerCase();
                if (ans.equals("si") || ans.equals("sí")) {
                    control.deshacer(registro);
                } else {
                    System.out.println();
                }
            }

            control.imprimirHistorial();
            control.imprimirInvestigacion();

        } catch (Exception e) {
            System.out.println("Error en el control remoto: " + e.getMessage());
        }
    }
}
