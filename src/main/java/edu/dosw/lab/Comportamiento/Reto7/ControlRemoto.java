package edu.dosw.lab.Comportamiento.Reto7;

import java.util.ArrayList;
import java.util.List;

public class ControlRemoto {
    private List<Comando> historial = new ArrayList<>();

    public void ejecutarComando(Comando comando) {
        comando.ejecutar();
        historial.add(comando);
    }

    public void deshacerComando(int indice) {
        if (indice >= 0 && indice < historial.size()) {
            Comando comando = historial.get(indice);
            comando.deshacer();
        }
    }

    public List<Comando> getHistorial() {
        return historial;
    }
}