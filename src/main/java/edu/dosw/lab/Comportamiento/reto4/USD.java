package edu.dosw.lab.Comportamiento.reto4;

public class USD extends Moneda {
    public USD(double cantidad) {
        super(cantidad);
        this.codigo = "USD";
    }

    @Override
    public double convertirA(Moneda otraMoneda) {
        return cantidad * getTasa(otraMoneda.getCodigo());
    }

    @Override
    public double getTasa(String codigoDestino) {
        return switch (codigoDestino) {
            case "EUR" -> 0.91;
            case "JPY" -> 151.67;
            case "COP" -> 3928.50;
            default -> 1.0;
        };
    }
}
