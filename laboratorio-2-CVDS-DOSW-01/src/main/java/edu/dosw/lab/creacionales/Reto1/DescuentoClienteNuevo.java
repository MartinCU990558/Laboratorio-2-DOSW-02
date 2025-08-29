package edu.dosw.lab.creacionales.Reto1;
public class DescuentoClienteNuevo implements EstrategiaDescuento{

    @Override
    public double aplicarDescuento(double total) {
        return total * 0.5;
    }
} 


