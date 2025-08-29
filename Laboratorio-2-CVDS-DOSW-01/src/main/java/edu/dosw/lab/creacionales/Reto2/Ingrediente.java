package creacionales.Reto2;

public class Ingrediente {
    private final String nombre;
    private final Integer precio;

    public Ingrediente(String nombre, Integer precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPrecio() {
        return precio;
    }
}
