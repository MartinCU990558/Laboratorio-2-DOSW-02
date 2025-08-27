public class ItemCarrito {
    private Product product;
    private int cantidad;

    public ItemCarrito(Product product, int cantidad) {
        this.product = product;
        this.cantidad = cantidad;
    }

    public int getSubtotal() {
        return product.getPrice() * cantidad;
    }

    public String getName() { return product.getName(); }
    public int getCantidad() { return cantidad; }
}