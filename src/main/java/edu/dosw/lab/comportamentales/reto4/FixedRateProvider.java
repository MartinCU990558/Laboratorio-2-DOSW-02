package main.java.edu.dosw.lab.comportamentales.reto4;

import java.util.HashMap;
import java.util.Map;

public class FixedRateProvider implements RateProvider {
    private final Map<String, Double> ratesToUSD = new HashMap<>();

    public FixedRateProvider() {
        ratesToUSD.put("USD", 1.0);
        ratesToUSD.put("EUR", 0.91);
        ratesToUSD.put("JPY", 150.0);
        ratesToUSD.put("COP", 4000.0);
    }

    public double getRate(String from, String to) {
        if (!ratesToUSD.containsKey(from) || !ratesToUSD.containsKey(to)) {
            throw new IllegalArgumentException("Moneda no soportada: " + from + " o " + to);
        }
        double fromToUSD = 1.0 / ratesToUSD.get(from);
        double usdToTarget = ratesToUSD.get(to);
        return fromToUSD * usdToTarget;
    }
}