package edu.dosw.lab.Solid;
public class ClienteFrecuente extends Cliente {
    @Override
    public double calcularDescuento(double compraFinal) {
        return compraFinal * 0.1;
    }
    @Override
    public String getTipoCliente() {
        return "Cliente Frecuente";
    }
}