
package edu.dosw.lab.comportamientos.Reto4;

import java.util.Scanner;

public class CasaDeCambio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese número de transacciones: ");
        int n = Integer.parseInt(sc.nextLine());
        Transaccion transaccion = new Transaccion();
        transaccion.procesarTransacciones(sc, n);
    }

}

