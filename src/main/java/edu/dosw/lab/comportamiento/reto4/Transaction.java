package edu.dosw.lab.comportamiento.reto4;

import java.util.List;

public class Transaction {
    private final int id;
    private final double amount;
    private final String fromCurrency;
    private final List<String> toCurrencies;

    public Transaction(int id, double amount, String fromCurrency, List<String> toCurrencies) {
        this.id = id;
        this.amount = amount;
        this.fromCurrency = fromCurrency;
        this.toCurrencies = toCurrencies;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public List<String> getToCurrencies() {
        return toCurrencies;
    }
}
