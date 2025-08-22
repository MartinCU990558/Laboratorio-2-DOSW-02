package edu.dosw.lab.creacionales.reto1;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private Customer customer;
    private List<CartItem> items;

    public ShoppingCart(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
    }

    public void addItem(Product product, int quantity) {
        items.add(new CartItem(product, quantity));
        System.out.println(product.getName() + " " + quantity + " unidades agregado al carrito.");
    }

    public void printReceipt() {
        System.out.println("\n--- RECIBO DE COMPRA ---");
        System.out.println("Cliente: " + customer.getName());

        double subtotal = items.stream()
                .peek(item -> System.out.println("- " + item.getProduct().getName() +
                        " - $" + (int)item.getTotalPrice()))
                .mapToDouble(CartItem::getTotalPrice)
                .sum();

        double discount = subtotal * customer.getDiscountRate();
        double total = subtotal - discount;

        System.out.println("\nSubtotal: $" + (int)subtotal);
        System.out.println("Descuento aplicado: $" + (int)discount);
        System.out.println("Total a pagar: $" + (int)total);
        System.out.println("------------------------");
        System.out.println("¡Gracias por su compra!");
    }
}
