package main.java.edu.dosw.lab;

import java.util.*;

public class reto4 {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter(new FixedRateProvider());

        Map<String, Double> totals = new HashMap<>();

        System.out.print("Ingrese número de transacciones: ");
        int numTransactions = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numTransactions; i++) {
            System.out.println("\n---- Transacción " + i + " ----");

            System.out.print("Ingrese monto: ");
            double amount = Double.parseDouble(scanner.nextLine());

            System.out.print("Ingrese moneda de origen (USD, EUR, JPY, COP): ");
            Currency from = CurrencyFactory.createCurrency(scanner.nextLine().trim());

            System.out.print("Ingrese monedas destino (separadas por coma, ej: USD,JPY): ");
            String[] toCodes = scanner.nextLine().split(",");
            List<Currency> toCurrencies = new ArrayList<>();
            for (String code : toCodes) {
                toCurrencies.add(CurrencyFactory.createCurrency(code.trim()));
            }

            Transaction transaction = new Transaction(amount, from, toCurrencies);
            Map<String, Double> results = transaction.execute(i, converter);

            results.forEach((currency, value) ->
                    totals.put(currency, totals.getOrDefault(currency, 0.0) + value)
            );
        }

        System.out.println("\n--- Totales por moneda ---");
        totals.forEach((currency, value) -> {
            System.out.println(currency + ": " + String.format("%.3f", value) + " " + currency);
        });

        scanner.close();
    }
}