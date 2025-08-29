package edu.dosw.lab.Comportamiento.Reto4;
 
public class COP extends Moneda{
    public COP(double cantidad) {
        super(cantidad);
        this.codigo = "COP";
    }
 
    @Override
    public double convertirA(Moneda otraMoneda) {
        return cantidad * getTasa(otraMoneda.getCodigo());
    }
 
    @Override
    public double getTasa(String codigoDestino) {
        return switch (codigoDestino) {
            case "USD" -> 0.00025;
            case "EUR" -> 0.00023;
            case "JPY" -> 0.039;
            default -> 1.0;
        };
    }
}