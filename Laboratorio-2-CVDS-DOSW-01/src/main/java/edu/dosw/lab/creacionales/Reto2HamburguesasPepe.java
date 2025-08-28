package edu.dosw.lab.creacionales;

public class Reto2HamburguesasPepe {
    private static final Restaurante restaurante = new Restaurante();

    public static void ejecutar(){
        restaurante.iniciarPedido();
        restaurante.finalizarPedido();
    }
}
