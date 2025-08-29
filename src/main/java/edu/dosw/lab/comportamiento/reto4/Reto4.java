package edu.dosw.lab.comportamiento.reto4;

import java.util.*;

public class Reto4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExchangeRateTable converter = new ExchangeRateTable();

        List<Transaction> transactions = new ArrayList<>();

        System.out.print("Ingrese número de transacciones: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("\n---- Transacción " + i + " ----");

            double amount;
            String fromCurrency;
            String[] targets;

            if (i == 1) {
                System.out.print("Ingrese monto: ");
                amount = sc.nextDouble();
                sc.nextLine();

                System.out.print("Ingrese moneda de origen (USD, EUR, JPY, COP): ");
                fromCurrency = sc.nextLine().toUpperCase();

                System.out.print("Ingrese monedas destino (separadas por coma, ej: USD,JPY): ");
                targets = sc.nextLine().toUpperCase().split(",");
            } else {
                System.out.print("Monto: ");
                amount = sc.nextDouble();
                sc.nextLine();

                System.out.print("Origen: ");
                fromCurrency = sc.nextLine().toUpperCase();

                System.out.print("Destino(s): ");
                targets = sc.nextLine().toUpperCase().split(",");
            }

            transactions.add(new Transaction(i, amount, fromCurrency, Arrays.asList(targets)));
        }


        Map<String, Double> totalsByCurrency = new HashMap<>();


        for (Transaction tx : transactions) {
            System.out.println("\nTransacción " + tx.getId() + ": " + tx.getAmount() + " " + tx.getFromCurrency());

            for (String toCurrency : tx.getToCurrencies()) {
                double converted = converter.convert(tx.getAmount(), tx.getFromCurrency(), toCurrency);
                System.out.printf("Convertido a %s: %.2f %s%n", toCurrency, converted, toCurrency);
                totalsByCurrency.merge(toCurrency, converted, Double::sum);
            }
        }


        System.out.println("\n-- Totales por moneda --");
        totalsByCurrency.forEach((currency, total) ->
                System.out.printf("%s: %.2f %s%n", currency, total, currency));
    }
}