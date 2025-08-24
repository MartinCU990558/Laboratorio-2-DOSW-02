package edu.dosw.lab.solid;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

class Producto {
    private String name;
    private int price;



    public Producto(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public int getPrice() {
        return price;
    }
}

class CarritoCompras {
    private ArrayList<Producto> productos;
    public CarritoCompras(){
        productos = new ArrayList<>();
    }
    public void addProduct(Producto producto){
        productos.add(producto);
    }
    public ArrayList<Producto> getProductos(){
        return productos;
    }

}


class Cliente {
    private String name;
    private boolean esAntiguo;

    private ArrayList<Recibo> recibos;

    public Cliente(String name){
        this.name = name;
        esAntiguo = false;
    }

    public void cambiarAntiguedad(){
        esAntiguo = true;
    }

    public void agregarRecibo(Recibo recibo){
        recibos.add(recibo);
    }

    public boolean getEsAntiguo(){
        return esAntiguo;
    }

    public String getAntiguedad(){
        if (esAntiguo){
            return "Frecuente";
        } else{
            return "Nuevo";
        }
    }

}

class Recibo {
    private Cliente cliente;
    private ArrayList<Producto> productos;
    private int precioTotal;
    private int descuentoAplicado;

    private int precioFinal;

    public Recibo (ArrayList<Producto> productos, Cliente cliente){
        this.productos = productos;
        this.cliente = cliente;
        calcularPrecioTotal();
        calcularDescuento();
        calcularPrecioFinal();
    }

    private void calcularPrecioTotal(){
        precioTotal = productos.stream().map(p -> p.getPrice()).mapToInt(Integer::intValue).sum();
    }

    private void calcularDescuento(){
        descuentoAplicado = (int) (precioTotal * (cliente.getEsAntiguo() ? 0.10 : 0.05));
    }

    private void calcularPrecioFinal(){
        precioFinal = precioTotal - descuentoAplicado;
    }

    public int getPrecioFinal(){
        return precioFinal;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public int getDescuentoAplicado() {
        return descuentoAplicado;
    }

}

class Tienda {
    private ArrayList<Producto> productos;
    public Tienda(){
        productos = new ArrayList<>();
    }

    public void addProduct (Producto producto){
        productos.add(producto);
    }
    public String getMensajeBienvenida(){
        return "Bienvenido a la tienda Don Pepe";
    }
    public String getProductsWithPrice(){
        return productos.stream().map(p-> p.getName() + " - $" + p.getPrice()).collect(Collectors.joining("\n"));
    }

    public ArrayList<Producto> getProductos(){
        return productos;
    }

}


public class Reto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tienda tienda = new Tienda();
        tienda.addProduct(new Producto("Camiseta", 20000));
        tienda.addProduct(new Producto("Pantalón", 50000));
        tienda.addProduct(new Producto("Galletas", 500));
        tienda.addProduct(new Producto("Jugo Natural", 3000));
        Cliente e = new Cliente("Belen");
        System.out.println(tienda.getMensajeBienvenida());
        System.out.println("Cliente: ");
        if (sc.nextLine().equals("Frecuente")) {
            e.cambiarAntiguedad();
        }
        System.out.println("Cliente " + e.getAntiguedad());
        System.out.println(tienda.getProductsWithPrice());
        System.out.println("Ingrese su compra: ");


        Map<String, Integer> carrito = new LinkedHashMap<>();
        ArrayList<Producto> carrito2 = new ArrayList<>();
        while (true) {
            String linea = sc.nextLine().trim();
            if (linea.isEmpty()) {
                break;
            }

            String[] partes = linea.split(":");
            if (partes.length == 2) {
                String productoNombre = partes[0].trim();
                int unidades = Integer.parseInt(partes[1].trim());

                Producto prod = tienda.getProductos().stream()
                        .filter(p -> p.getName().equalsIgnoreCase(productoNombre))
                        .findFirst()
                        .orElse(null);

                if (prod != null) {
                    for (int i = 0; i < unidades; i++) {
                        carrito2.add(new Producto(prod.getName(), prod.getPrice()));
                    }
                    carrito.put(productoNombre, unidades);
                } else {
                    System.out.println("Producto no encontrado en la tienda.");
                }
            } else {
                System.out.println("Formato incorrecto. Use: Producto: unidades");
            }
        }

        carrito.forEach((producto, unidades) -> System.out.println(producto + " " + unidades + " unidades agregadas al carrito"));

        Recibo recibo = new Recibo(carrito2, e);



        System.out.println("\n-- RECIBO DE COMPRA --");
        System.out.println("Cliente: " + e.getAntiguedad());

        Map<String, Integer> resumen = new LinkedHashMap<>();

        for (Producto p : carrito2) {
            resumen.put(p.getName(), resumen.getOrDefault(p.getName(), 0) + 1);
        }

        System.out.println("\nProductos:");
        resumen.forEach((nombre, cantidad) -> {
            int precioUnitario = carrito2.stream().filter(p -> p.getName().equals(nombre)).findFirst().get().getPrice();
            int totalProducto = precioUnitario * cantidad;
            System.out.println(cantidad + " " + nombre + " - $" + totalProducto);
        });


        System.out.println("Subtotal: $" + recibo.getPrecioTotal());
        System.out.println("Descuento aplicado: $" + recibo.getDescuentoAplicado());
        System.out.println("Total a pagar: $" + recibo.getPrecioFinal());


    }
}
