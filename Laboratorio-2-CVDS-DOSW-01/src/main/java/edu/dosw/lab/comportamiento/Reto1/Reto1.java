package comportamiento.Reto1;

import java.util.*;

public class Reto1 {
    private static final List<Product> PRODUCTOS_DISPONIBLES = List.of(
            new Shirt(), new Pants(), new Cookies(), new NaturalJuice()
    );

    public static void mostrarProductosDisponibles() {
        System.out.println("• Productos disponibles:");
        PRODUCTOS_DISPONIBLES.forEach(product -> System.out.println("o " + product.getName() + " - $" + product.getPrice()));
    }

    public static Product buscarProducto(String nombre) {
        return PRODUCTOS_DISPONIBLES.stream().filter(p -> p.getName().equalsIgnoreCase(nombre)).findFirst().orElse(null);
    }

    public static void main(String[] args) {
        System.out.println("¡Bienvenido a la tienda Don Pepe! ");
        Scanner scanner = new Scanner(System.in);
        CarritoCompras carrito = new CarritoCompras();
        System.out.println("Cliente: ");
        boolean esFrecuente = false;
        if (scanner.nextLine().toLowerCase().equals("frecuente")){
            esFrecuente = true;
        }
        Cliente cliente = new Cliente(esFrecuente);

        mostrarProductosDisponibles();


        System.out.println("Ingrese los productos y cantidades (ejemplo: 'Camiseta: 2 unidades'), deje en blanco para terminar:");
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) break;

            String[] parts = input.split(":");
            if (parts.length == 2) {
                String nombreProducto = parts[0].trim();
                String cantidadStr = parts[1].trim().replaceAll("[^0-9]", "");
                int cantidad = Integer.parseInt(cantidadStr);

                Product producto = buscarProducto(nombreProducto);
                if (producto != null && cantidad > 0) {
                    carrito.addProduct(producto, cantidad);
                } else {
                        System.out.println("Producto no disponible o cantidad inválida. Intente de nuevo.");
                }
                } else {
                    System.out.println("Formato incorrecto. Use: 'Producto: X unidades'. Intente de nuevo.");
                }
        }

        System.out.println("Datos de Salida:");
        carrito.mostrarResumenAgregados();

        Recibo recibo = new Recibo(carrito, cliente);
        recibo.imprimirRecibo();

        scanner.close();
    }
}