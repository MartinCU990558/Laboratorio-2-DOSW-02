import java.util.List;

public class Recibo {
    private List<ItemCarrito> items;
    private int precioTotal;
    private int descuentoAplicado;
    private int precioFinal;
    private Cliente cliente;

    public Recibo(CarritoCompras carrito, Cliente cliente) {
        this.items = carrito.getItems();
        this.cliente = cliente;
        calcularPrecioTotal();
        calcularDescuento();
        calcularPrecioFinal();
    }

    private void calcularPrecioTotal() {
        precioTotal = items.stream()
                .mapToInt(ItemCarrito::getSubtotal)
                .sum();
    }

    private void calcularDescuento() {
        descuentoAplicado = (int) (precioTotal * cliente.getDescuentoPorcentaje());
    }

    private void calcularPrecioFinal() {
        precioFinal = precioTotal - descuentoAplicado;
    }

    public void imprimirRecibo() {
        System.out.println("--- RECIBO DE COMPRA ---");
        System.out.println("Cliente: " + cliente.getAntiguedad());
        System.out.println("Productos:");
        items.forEach(item -> System.out.println("- " + item.getName() + " - $" + item.getSubtotal()));
        System.out.println("Subtotal: $" + precioTotal);
        System.out.println("Descuento aplicado: $" + descuentoAplicado);
        System.out.println("Total a pagar: $" + precioFinal);
        System.out.println("------------------------");
        System.out.println("¡Gracias por su compra!");
    }
}