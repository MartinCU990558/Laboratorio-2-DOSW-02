package edu.dosw.lab.estructurales.Reto2;

import java.util.Scanner;

public class Chef {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("¡Bienvenido al restaurante del Chef de 5 estrellas!");
        System.out.println("===================================================");
        Menu menu = new Menu();
        Pedido pedido = new Pedido();
        menu.mostrarMenu();
        String seleccion = sn.nextLine();
        pedido.seleccionar(seleccion, sn, menu);
        if (pedido.estaVacio()) {
            System.out.println("No se han seleccionado ingredientes.");
        } else {
            System.out.println("HAMBURGUESA PERSONALIZADA");
            System.out.println(pedido.resumenPedido());
            System.out.println("¡Disfrute su hamburguesa!");
        }
    }
}