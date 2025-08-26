package edu.dosw.lab.solid;

import java.util.Hashtable;
import java.util.List;

public class Conversor {

    private Hashtable<String,Float> tablaConversor;

    public void setTablaConversor(Hashtable<String, Float> tablaConversor) {
        this.tablaConversor = tablaConversor;
    }

    public Float convertirMoneda(Float monto, String origen, String destino) {
        Float tasaOrigen = tablaConversor.get(origen);
        Float tasaDestino = tablaConversor.get(destino);

        if (tasaOrigen == null || tasaDestino == null) {
            throw new IllegalArgumentException("Moneda no soportada");
        }

        return monto * (tasaDestino / tasaOrigen);
    }

}
