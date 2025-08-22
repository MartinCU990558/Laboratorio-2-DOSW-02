package edu.dosw.lab.Solid;

public class ClienteNuevo extends Cliente {
    @Override
    public double calcularDescuento(double compraFinal) {
        return compraFinal * 0.05;}

    @Override
    public String getTipoCliente() {
        return "Cliente Nuevo";
    }

}