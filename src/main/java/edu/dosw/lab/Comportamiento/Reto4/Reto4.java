package edu.dosw.lab.Comportamiento.Reto4;

import java.util.*;
import java.util.stream.Collectors;

public class Reto4 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese número de transacciones: ");
        int numTransacciones = scanner.nextInt();
        scanner.nextLine();

        List<Transaccion> transacciones = new ArrayList<>();

        for (int i = 1; i <= numTransacciones; i++) {
            System.out.println("\n--- Transacción " + i);
            transacciones.add(procesarTransaccion());
        }

        mostrarResultados(transacciones);
        mostrarTotales(transacciones);
    }

    private static Transaccion procesarTransaccion() {
        System.out.print("Ingrese monto: ");
        double monto = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Ingrese moneda de origen (USD, EUR, JPY, COP): ");
        String monedaOrigen = scanner.nextLine().trim();

        System.out.print("Ingrese monedas destino (separadas por coma, ej: USD, JPY): ");
        List<String> monedasDestino = Arrays.asList(scanner.nextLine().split(","))
                .stream()
                .map(String::trim)
                .collect(Collectors.toList());

        Moneda moneda = crearMoneda(monedaOrigen, monto);
        List<Moneda> monedasDestinoObj = monedasDestino.stream()
                .map(codigo -> crearMoneda(codigo, 0))
                .collect(Collectors.toList());

        Transaccion transaccion = new Transaccion(moneda, monto, monedasDestino);
        transaccion.calcularConversiones(monedasDestinoObj);
        return transaccion;
    }

    private static void mostrarResultados(List<Transaccion> transacciones) {
        for (int i = 0; i < transacciones.size(); i++) {
            Transaccion t = transacciones.get(i);
            System.out.printf("\nTransacción %d: %.2f %s\n",
                    i + 1, t.getMonto(), t.getMonedaOrigenCodigo());

            t.getResultados().forEach((moneda, valor) ->
                    System.out.printf("\nConvertido a %s: %.2f %s", moneda, valor, moneda));
            System.out.println();
        }
    }

    private static void mostrarTotales(List<Transaccion> transacciones) {
        System.out.println("\n--- Totales por moneda");
        Map<String, Double> totales = new HashMap<>();

        transacciones.stream()
                .flatMap(t -> t.getResultados().entrySet().stream())
                .forEach(e -> totales.merge(e.getKey(), e.getValue(), Double::sum));

        totales.forEach((moneda, total) ->
                System.out.printf("%s: %.2f %s\n", moneda, total, moneda));
    }

    private static Moneda crearMoneda(String codigo, double cantidad) {
        return switch (codigo.toUpperCase()) {
            case "USD" -> new USD(cantidad);
            case "EUR" -> new EUR(cantidad);
            case "JPY" -> new JPY(cantidad);
            case "COP" -> new COP(cantidad);
            default -> throw new IllegalArgumentException("Moneda no soportada: " + codigo);
        };
    }
}