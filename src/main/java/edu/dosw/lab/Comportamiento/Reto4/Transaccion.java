package edu.dosw.lab.Comportamiento.Reto4;

import java.util.*;


public class Transaccion {
    private Moneda monedaOrigen;
    private double monto;
    private List<String> monedasDestino;
    private Map<String, Double> resultados;

    public Transaccion(Moneda monedaOrigen, double monto, List<String> monedasDestino) {
        this.monedaOrigen = monedaOrigen;
        this.monto = monto;
        this.monedasDestino = monedasDestino;
        this.resultados = new HashMap<>();
    }

    public void calcularConversiones(List<Moneda> monedasDestinoObj) {
        for (Moneda monedaDestino : monedasDestinoObj) {
            double resultado = monedaOrigen.convertirA(monedaDestino);
            resultados.put(monedaDestino.getCodigo(), resultado);
        }
    }

    public Map<String, Double> getResultados() {
        return resultados;
    }

    public double getMonto() {
        return monto;
    }

    public String getMonedaOrigenCodigo() {
        return monedaOrigen.getCodigo();
    }
}