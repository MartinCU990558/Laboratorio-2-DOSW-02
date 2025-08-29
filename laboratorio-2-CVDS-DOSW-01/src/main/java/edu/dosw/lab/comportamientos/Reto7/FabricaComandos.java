package edu.dosw.lab.comportamientos.Reto7;

import java.util.Scanner;

public class FabricaComandos {

    public static Comando crearComandoDesdeEntrada(Scanner sc, Dispositivos disp, String usuario) {
        System.out.print("Seleccione: 1. Encender luz 2. Abrir puerta 3. Reproducir música 4. Ajustar volumen\n");
        int opcion = leerEntero(sc);

        switch (opcion) {
            case 1: return new ComandoEncenderLuz(disp.luz(), usuario);
            case 2: return new ComandoAbrirPuerta(disp.puerta(), usuario);
            case 3: return new ComandoReproducirMusica(disp.musica(), usuario);
            case 4:
                System.out.print("Ingrese valor (0–100): ");
                int v = leerEntero(sc);
                return new ComandoAjustarVolumen(disp.musica(), v, usuario);
            default:
                throw new IllegalArgumentException("Opción inválida.");
        }
    }

    private static int leerEntero(Scanner sc) {
        String linea = sc.nextLine().trim();
        return Integer.parseInt(linea);

    }
}