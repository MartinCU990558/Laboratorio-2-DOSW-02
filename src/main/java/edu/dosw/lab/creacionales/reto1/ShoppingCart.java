package main.java.edu.dosw.lab.creacionales.reto1;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ShoppingCart {
    ArrayList<Product> products;
    Customer customer;
    int total;

    public ShoppingCart(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addProduct(Product product, int quantity) {
        for (int i = 0; i < quantity; i++) {
            products.add(product);
        }
    }

    public double calculateTotal() {
        total = products.stream().mapToInt(Product::getPrice).sum();
        return total * (1 - customer.getDiscount());
    }

    public double getSubtotal() {
        return products.stream().mapToInt(Product::getPrice).sum();
    }

    public double getDiscount() {
        return products.stream().mapToInt(Product::getPrice).sum() * customer.getDiscount();
    }

    public ArrayList<Product> getProducts() {
        return new ArrayList<>(new LinkedHashSet<>(products));
    }
}
