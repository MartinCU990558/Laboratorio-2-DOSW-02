package edu.dosw.lab.Estructurales;

public class ClienteNuevo extends Cliente {

    public ClienteNuevo(String nombre) {
        super("Nuevo");
    }
    @Override
    public double calcularDescuento(double compraFinal) {
        return compraFinal * 0.05;}


}