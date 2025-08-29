package edu.dosw.lab.comportamientos.Reto7;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ControlRemoto {
    private final List<RegistroAccion> historial = new ArrayList<>();
    private int consecutivo = 1;

    public RegistroAccion enviar(Comando comando) {
        comando.ejecutar();
        RegistroAccion reg = new RegistroAccion(consecutivo++, comando.usuario(), comando, Instant.now());
        historial.add(reg);
        System.out.printf("Acción %d ejecutada por %s: %s%n",
                reg.getId(), reg.getUsuario(), comando.describir());
        return reg;
    }

    public void deshacer(RegistroAccion reg) {
        if (reg.isDeshecha()) return;
        reg.getComando().deshacer();
        reg.marcarDeshecha();
        System.out.printf("Acción %d deshecha: %s%n%n",
                reg.getId(), reg.getComando().describirDeshacer());
    }

    public List<RegistroAccion> historial() { return Collections.unmodifiableList(historial); }

    public void imprimirHistorial() {
        System.out.println("---- Historial completo ----");
        for (RegistroAccion r : historial) {
            System.out.println(r.resumen());
        }
        System.out.println();
    }

    public void imprimirInvestigacion() {
        System.out.println("---- Investigando quién desconfiguró los electrodomésticos ----");
        Map<String,Integer> conteo = new LinkedHashMap<>();
        for (RegistroAccion r : historial) {
            conteo.merge(r.getUsuario(), 1, Integer::sum);
        }
        if (!conteo.isEmpty()) {
            String mas = null; int max = -1;
            for (Map.Entry<String,Integer> e : conteo.entrySet()) {
                if (e.getValue() > max) { max = e.getValue(); mas = e.getKey(); }
            }
            System.out.printf("Se detecta que %s realizó %d acciones que alteraron la configuración.%n", mas, max);
        }
        for (Map.Entry<String,Integer> e : conteo.entrySet()) {
            System.out.printf("%s realizó %d acción%s.%n", e.getKey(), e.getValue(), e.getValue()==1 ? "" : "es");
        }
        System.out.println();
    }
}