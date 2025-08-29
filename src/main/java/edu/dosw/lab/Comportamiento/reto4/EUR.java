package edu.dosw.lab.Comportamiento.reto4;

public class EUR extends Moneda {
    public EUR(double cantidad) {
        super(cantidad);
        this.codigo = "EUR";
    }

    @Override
    public double convertirA(Moneda otraMoneda) {
        return cantidad * getTasa(otraMoneda.getCodigo());
    }

    @Override
    public double getTasa(String codigoDestino) {
        return switch (codigoDestino) {
            case "USD" -> 1.10;
            case "JPY" -> 166.84;
            case "COP" -> 4321.35;
            default -> 1.0;
        };
    }
}