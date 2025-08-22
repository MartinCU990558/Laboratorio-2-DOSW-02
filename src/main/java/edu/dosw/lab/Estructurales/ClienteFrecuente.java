package edu.dosw.lab.Estructurales;
public class ClienteFrecuente extends Cliente {
    @Override
    public double calcularDescuento(double compraFinal) {
        return compraFinal * 0.1;
    }
}