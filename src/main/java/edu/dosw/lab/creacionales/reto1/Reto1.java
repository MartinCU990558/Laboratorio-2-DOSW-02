package edu.dosw.lab.creacionales.reto1;

public class Reto1 {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la tienda Don Pepe!\n");

        Product camiseta = new Camiseta();
        Product pantalon = new Pantalon();
        Product galletas = new Galletas();
        Product jugo = new JugoNatural();

        Customer cliente = new FrequentCustomer("Frecuente");

        ShoppingCart carrito = new ShoppingCart(cliente);
        carrito.addItem(camiseta, 2);
        carrito.addItem(galletas, 3);
        carrito.addItem(jugo, 5);

        carrito.printReceipt();
    }
}