package edu.dosw.lab.Comportamiento.reto4;
 
public class JPY extends Moneda {
    public JPY(double cantidad) {
        super(cantidad);
        this.codigo = "JPY";
    }
 
    @Override
    public double convertirA(Moneda otraMoneda) {
        return cantidad * getTasa(otraMoneda.getCodigo());
    }
 
    @Override
    public double getTasa(String codigoDestino) {
        return switch (codigoDestino) {
            case "USD" -> 0.0066;     
            case "EUR" -> 0.0060;     
            case "COP" -> 25.64;      
            default -> 1.0;
        };
    }
}