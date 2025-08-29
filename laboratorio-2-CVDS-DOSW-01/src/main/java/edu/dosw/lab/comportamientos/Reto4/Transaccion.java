
package edu.dosw.lab.comportamientos.Reto4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Transaccion {

    private final Map<String, BigDecimal> totales = new HashMap<>();

    public void procesarTransacciones(Scanner sc, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("--- Transacción " + i + " ---");
            System.out.print("Ingrese monto: ");
            BigDecimal monto = new BigDecimal(sc.nextLine());
            System.out.print("Ingrese moneda de origen (USD, EUR, JPY, COP): ");
            String origen = sc.nextLine().trim().toUpperCase();
            System.out.print("Ingrese monedas destino (separadas por coma): ");
            String[] destinos = sc.nextLine().toUpperCase().split(",");
            System.out.println("Transacción " + i + ": " + monto + " " + origen);
            BigDecimal enUSD = monto.divide(BigDecimal.valueOf(Moneda.TASA.get(origen)), 10, RoundingMode.HALF_UP);
            for (String destino : destinos) {
                if (!Moneda.TASA.containsKey(destino)) continue;
                BigDecimal convertido = enUSD.multiply(BigDecimal.valueOf(Moneda.TASA.get(destino))).setScale(Moneda.DECIMALES.getOrDefault(destino, 2), RoundingMode.HALF_UP);
                System.out.printf("Convertido a %s: %s %s%n", destino, FormatoMoneda.aplicar(convertido, destino), destino);
                totales.merge(destino, convertido, BigDecimal::add);
            }
        }
        mostrarTotales();
    }

    private void mostrarTotales() {
        System.out.println("--- Totales por moneda ---");
        Arrays.asList("USD", "JPY", "EUR", "COP").forEach(moneda -> {
            if (totales.containsKey(moneda)) {
                BigDecimal total = totales.get(moneda).setScale(Moneda.DECIMALES.get(moneda), RoundingMode.HALF_UP);
                System.out.printf("%s: %s %s%n", moneda, FormatoMoneda.aplicar(total, moneda), moneda);
            }
        });
    }
}
