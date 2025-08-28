import java.util.*;

public class chef_5_estrellas {
    private List<String> ingredientes = new ArrayList<>();
    private List<Integer> precios = new ArrayList<>();

    private static class Ingrediente {
        String nombre;
        int precio;
        Ingrediente(String nombre, int precio) {
            this.nombre = nombre;
            this.precio = precio;
        }
    }

    private static final List<Ingrediente> INGREDIENTES = List.of(
            new Ingrediente("Pan", 3000),
            new Ingrediente("Carne", 10000),
            new Ingrediente("Queso", 5000),
            new Ingrediente("Lechuga", 2000),
            new Ingrediente("Tomate", 2000),
            new Ingrediente("Salsa especial", 3000)
    );

    private void agregarIngrediente(String nombre, int precio) {
        ingredientes.add(nombre);
        precios.add(precio);
    }

    private static void mostrarMenu() {
        System.out.println("\nSeleccione ingredientes para su hamburguesa:");
        for (int i = 0; i < INGREDIENTES.size(); i++) {
            Ingrediente ing = INGREDIENTES.get(i);
            System.out.printf("%d. %s ($%,d)%n", i + 1, ing.nombre, ing.precio);
        }
        System.out.println((INGREDIENTES.size() + 1) + ". Agregar un nuevo ingrediente");
        System.out.print("Ingrese los números separados por coma: ");
    }

    private void Seleccion(String seleccion, Scanner scanner) {
        for (String opcion : seleccion.split(",")) {
            int numero = Integer.parseInt(opcion.trim());

            if (numero == INGREDIENTES.size() + 1) {
                System.out.print("Ingrese el nombre del nuevo ingrediente: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese el precio del ingrediente: ");
                int precio = Integer.parseInt(scanner.nextLine());
                agregarIngrediente(nombre, precio);
            } else if (numero >= 1 && numero <= INGREDIENTES.size()) {
                Ingrediente ing = INGREDIENTES.get(numero - 1);
                agregarIngrediente(ing.nombre, ing.precio);
            }
        }
    }

    private String Pedido() {
        int total = precios.stream().mapToInt(Integer::intValue).sum();
        return "Ingredientes seleccionados: " + String.join(", ", ingredientes) + "Precio total: $" + String.format("%,d", total);
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("¡Bienvenido al restaurante del Chef de 5 estrellas!");
        System.out.println("===================================================");
        Main chef = new Main();
        mostrarMenu();
        String seleccion = sn.nextLine();
        chef.Seleccion(seleccion, sn);
        if (chef.ingredientes.isEmpty()) {
            System.out.println("No se han seleccionado ingredientes.");
        } else {
            System.out.println("HAMBURGUESA PERSONALIZADA");
            System.out.println(chef.Pedido());
            System.out.println("¡Disfrute su hamburguesa!");
        }
        sn.close();
    }
}
