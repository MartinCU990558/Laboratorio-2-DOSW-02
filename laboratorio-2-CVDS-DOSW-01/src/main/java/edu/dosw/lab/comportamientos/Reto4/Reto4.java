package edu.dosw.lab.comportamientos.Reto4;

public class Reto4 {
    public static void iniciarPrograma() {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        try {
            System.out.print("Ingrese número de transacciones: ");
            int n = Integer.parseInt(sc.nextLine());
            Transaccion transaccion = new Transaccion();
            transaccion.procesarTransacciones(sc, n);
        } catch (Exception e) {
            System.out.println("Error en casa de cambio: " + e.getMessage());
        }
    }
}