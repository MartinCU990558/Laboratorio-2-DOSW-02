package main.java.edu.dosw.lab.creacionales.reto1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class reto1_Salamanca_Ariza {
    private static Map<String, String> availableProducts = new HashMap<String, String>();
    private static ShoppingCart shoppingCart;
    private static Customer customer;
    public static void run() {
        reto1_Salamanca_Ariza.buildAvailableProducts();
        System.out.println("Bienvenido a la tienda Don Pepe");

        Scanner scanner = new Scanner(System.in);
        String customerType = scanner.nextLine();
        customer = CustomerFactory.createCustomer(customerType);

        System.out.println("Ciente "+ customer.getType());
        System.out.println("Productos disponibles: ");
        availableProducts.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
        System.out.println("Ingrese su compra: ");
        reto1_Salamanca_Ariza.registerPurchase(customer);

        reto1_Salamanca_Ariza.printTotal();
    }

    private static void registerPurchase(Customer customer) {
        shoppingCart = new ShoppingCart(customer);

        Scanner scanner = new Scanner(System.in);
        String entry = scanner.nextLine();
        while (!entry.equals("")){
            String[] products = entry.split(",");
            shoppingCart.addProduct(ProductFactory.createProduct(products[0]), Integer.parseInt(products[1]));
            System.out.println(products[0]+": "+products[1]+" unidades.");
            entry = scanner.nextLine();
        }

    }

    public static void buildAvailableProducts(){
        availableProducts.put("Camiseta", "$20.000");
        availableProducts.put("Pantalón", "$50.000");
        availableProducts.put("Galleta", "$500");
        availableProducts.put("Jugo", "$3.000");
    }

    public static void printTotal(){

        System.out.println("=========Factura========");
        System.out.println("Cliente: " + customer.getType());
        System.out.println("Productos: ");
        shoppingCart.getProducts().forEach(product -> System.out.println(product.getName() + " - " + product.getPrice()));

        System.out.println("Subtotal: " +shoppingCart.getSubtotal());
        System.out.println("Descuento: " +shoppingCart.getDiscount());
        System.out.println("Total: " +shoppingCart.calculateTotal());

    }


}
