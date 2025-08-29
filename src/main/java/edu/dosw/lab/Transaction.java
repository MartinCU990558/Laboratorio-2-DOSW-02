package main.java.edu.dosw.lab;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Transaction {
    private final double amount;
    private final Currency from;
    private final List<Currency> toCurrencies;

    public Transaction(double amount, Currency from, List<Currency> toCurrencies) {
        this.amount = amount;
        this.from = from;
        this.toCurrencies = toCurrencies;
    }

    public Map<String, Double> execute(int transactionNumber, CurrencyConverter converter) {
        Map<String, Double> results = new HashMap<>();

        System.out.println("Transacción " + transactionNumber + ": " + amount + " " + from.getCode());
        toCurrencies.forEach(to -> {
            double converted = converter.convert(from, to, amount);
            results.put(to.getCode(), converted);
            System.out.println("Convertido a " + to.getCode() + ": " + String.format("%.3f", converted) + " " + to.getCode());
        });

        System.out.println();
        return results;
    }
}