
package edu.dosw.lab.comportamientos.Reto4;

import java.util.Map;

public class Moneda {
    public static final Map<String, Double> TASA = Map.of(
            "USD", 1.0,
            "EUR", 0.909,
            "JPY", 150.0,
            "COP", 4000.0
    );

    public static final Map<String, Integer> DECIMALES = Map.of(
            "USD", 2,
            "EUR", 2,
            "JPY", 0,
            "COP", 0
    );
}
