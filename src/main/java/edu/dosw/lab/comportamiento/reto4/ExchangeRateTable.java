package edu.dosw.lab.comportamiento.reto4;
import java.util.HashMap;
import java.util.Map;

public class ExchangeRateTable implements CurrencyConverter {
    private final Map<String, Double> rates = new HashMap<>();

    public ExchangeRateTable() {
        rates.put("USD", 1.0);
        rates.put("EUR", 0.91);
        rates.put("JPY", 150.0);
        rates.put("COP", 4000.0);
    }

    @Override
    public double convert(double amount, String fromCurrency, String toCurrency) {
        if (!rates.containsKey(fromCurrency) || !rates.containsKey(toCurrency)) {
            throw new IllegalArgumentException("Moneda no soportada.");
        }
        double inUsd = amount / rates.get(fromCurrency);
        return inUsd * rates.get(toCurrency);
    }
}