package solid.Reto4;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class CasaDeCambio {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Transaccion> transacciones = new ArrayList<>();
    private Hashtable<String, Float> tasas = new Hashtable<>();

    public CasaDeCambio(){
        tasas.put("USD", 1.0f);
        tasas.put("EUR", 0.86f);
        tasas.put("COP", 4027.0f);
        tasas.put("JPY", 147.8f);
    }

    public void nuevaTransaccion(){
        System.out.println("Ingrese monto: ");
        Float valor = Float.parseFloat(sc.nextLine());
        System.out.println("Ingrese moneda de origen (USD, EUR, JPY, COP): ");
        String monedaOrigen = sc.nextLine().toUpperCase();
        System.out.println("Ingrese monedas destino (separadas por coma, ej: USD,JPY): ");
        List<String> monedasDestino= List.of(sc.nextLine().toUpperCase().split(","));
        transacciones.add(new Transaccion(valor,monedaOrigen,monedasDestino,tasas));
    }

    public void entregarTotalesPorMoneda() {
        Hashtable<String, Float> acumulado = new Hashtable<>();
        transacciones.stream().forEach(t -> {
            t.getTotalConversiones().forEach((moneda, valor) -> {
                acumulado.put(moneda, acumulado.getOrDefault(moneda, 0.0f) + valor);
            });
        });
        System.out.println("--Totales por moneda--");
        acumulado.entrySet().stream().forEach(s-> System.out.printf("%s: %.2f %s%n",s.getKey(),s.getValue(),s.getKey()));
    }

    public void empezar() {
        System.out.println("Ingrese numero de transacciones");
        Integer noTransacciones = Integer.parseInt(sc.nextLine());
        for(int i=0 ;i<noTransacciones;i++){
            nuevaTransaccion();
        }
        entregarTranssaciones();
        entregarTotalesPorMoneda();
    }

    private void entregarTranssaciones() {
        for(int i=0;i < transacciones.size();i++){
            System.out.printf("Transaccion %d: %.2f %s%n", i+1 ,transacciones.get(i).getValorTransaccion(), transacciones.get(i).getOrigen());
            transacciones.get(i).getTotalConversiones().entrySet().stream()
                    .forEach(entry ->
                            System.out.printf("Convertido a %s: %.2f %s%n",
                                    entry.getKey(), entry.getValue(), entry.getKey()));
        }
    }
}
