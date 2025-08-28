package edu.dosw.lab.comportamientos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class CasaDeCambio {
    private static final Map<String, Double> TASA = Map.of("USD", 1.0, "EUR", 0.909, "JPY", 150.0, "COP", 4000.0);
    private static final Map<String, Integer> DECIMALES = Map.of("USD", 2, "EUR", 2, "JPY", 0, "COP", 0);

    private static String Transacciones(BigDecimal numero, String moneda) {
        if ("JPY".equals(moneda) && numero.compareTo(BigDecimal.valueOf(1000)) >= 0) {
            String str = numero.toPlainString();
            StringBuilder sb = new StringBuilder();
            for (int i = str.length() - 1, count = 0; i >= 0; i--) {
                if (count == 3) {
                    sb.insert(0, ".");
                    count = 0;
                }
                sb.insert(0, str.charAt(i));
                count++;
            }
            return sb.toString();
        }
        return "EUR".equals(moneda) ? numero.toPlainString().replace(".", ",") : numero.toPlainString();
    }

    private static void procesarTransacciones(Scanner sc, int n) {
        Map<String, BigDecimal> totales = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("--- Transaccion " + i + " ---");
            System.out.print("Ingrese monto: ");
            BigDecimal monto = new BigDecimal(sc.nextLine());
            System.out.print("Ingrese moneda de origen (USD, EUR, JPY, COP): ");
            String origen = sc.nextLine().trim().toUpperCase();
            System.out.print("Ingrese monedas destino (separadas por coma)");
            String[] destinos = sc.nextLine().toUpperCase().replace("", "").split(",");
            System.out.println("Transaccion " + i + ": " + monto + origen);
            BigDecimal enUSD = monto.divide(BigDecimal.valueOf(TASA.get(origen)), 10, RoundingMode.HALF_UP);
            for (String destino : destinos) {
                if (!TASA.containsKey(destino)) continue;
                BigDecimal convertido = enUSD.multiply(BigDecimal.valueOf(TASA.get(destino))).setScale(DECIMALES.getOrDefault(destino, 2), RoundingMode.HALF_UP);
                System.out.printf("Convertido a %s: %s %s%n", destino, Transacciones(convertido, destino), destino);
                totales.merge(destino, convertido, BigDecimal::add);
            }
        }
        System.out.println("--- Totales por moneda ---");
        Arrays.asList("USD", "JPY", "EUR", "COP").forEach(moneda -> {
            if (totales.containsKey(moneda)) {
                BigDecimal total = totales.get(moneda).setScale(DECIMALES.get(moneda), RoundingMode.HALF_UP);
                System.out.printf("%s: %s %s%n", moneda, Transacciones(total, moneda), moneda);
            }
        });
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese número de transacciones: ");
        int n = Integer.parseInt(sc.nextLine());
        procesarTransacciones(sc, n);
        sc.close();
    }
}
