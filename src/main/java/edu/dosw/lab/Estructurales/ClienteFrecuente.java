package edu.dosw.lab.Estructurales;
public class ClienteFrecuente extends Cliente {


    public ClienteFrecuente(String nombre) {
        super("Frecuente");
    }
    @Override
    public double calcularDescuento(double compraFinal) {
        return compraFinal * 0.1;
    }
}