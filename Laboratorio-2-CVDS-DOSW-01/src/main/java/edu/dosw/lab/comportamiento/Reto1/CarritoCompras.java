package comportamiento.Reto1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarritoCompras {
    private List<ItemCarrito> items = new ArrayList<>();

    public void addProduct(Product product, int cantidad) {
        items.add(new ItemCarrito(product, cantidad));
    }

    public List<ItemCarrito> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void mostrarResumenAgregados() {
        items.forEach(item ->
                System.out.println("• " + item.getName() + " " + item.getCantidad() + " unidades agregado al carrito.")
        );
    }
}