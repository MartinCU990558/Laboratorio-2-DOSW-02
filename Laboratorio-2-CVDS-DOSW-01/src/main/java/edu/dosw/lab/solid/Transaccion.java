package edu.dosw.lab.solid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class Transaccion {
    private Float valorTransaccion;
    private String monedaOrigen;
    private Hashtable<String,Float > totalConversiones = new Hashtable<>();
    private Conversor conversor = new Conversor();
    private List<String> monedasDestino;

    public Transaccion(Float valorTransaccion,String monedaOrigen,List<String> monedasDestino, Hashtable<String, Float> tablaParaConversor){
        conversor.setTablaConversor(tablaParaConversor);
        this.valorTransaccion = valorTransaccion;
        this.monedaOrigen = monedaOrigen;
        this.monedasDestino = monedasDestino;
        convertirMoneda();
    }

    public Float getValorTransaccion() {
        return valorTransaccion;
    }

    public void agregarAlMontoPorMoneda(String moneda,Float montoNuevo){
        totalConversiones.put(moneda,totalConversiones.getOrDefault(moneda, 0.0f)+montoNuevo);
    }

    public void convertirMoneda(){
        monedasDestino.forEach(s -> agregarAlMontoPorMoneda(s,conversor.convertirMoneda(valorTransaccion,monedaOrigen,s)));
    }

    public Hashtable<String, Float> getTotalConversiones() {
        return totalConversiones;
    }

    public String getOrigen() {
        return monedaOrigen;
    }
}
