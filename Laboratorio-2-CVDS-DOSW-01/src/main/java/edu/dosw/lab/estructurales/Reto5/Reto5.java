import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Reto5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Leche: 1000" + "\n" + "2. Chocolate: 1500" + "\n" + "3. Caramelo: 1200" + "\n"  + "4. Crema Batida: 2000"+ "\n"+
                "5. Menta: 1300" + "\n" + "6. Agregar nuevo topping con precio personalizado. ");
        System.out.println("Número de cafés a personalizar: ");
        String temp = sc.nextLine();
        int n = Integer.parseInt(temp);
        ArrayList<Beverage> coffees = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("--- Café " + i + " ---");
            System.out.println("Seleccione toppings (números separados por coma): ");
            String[] toppings = sc.nextLine().split(",");
            Beverage coffee = new Coffee();
            for (String topping : toppings) {
                int opcion = Integer.parseInt(topping.trim());
                switch (opcion) {
                    case 1 -> coffee = new MilkTopping(coffee);
                    case 2 -> coffee = new ChocolateTopping(coffee);
                    case 3 -> coffee = new CandyTopping(coffee);
                    case 4 -> coffee = new CreamTopping(coffee);
                    case 5 -> coffee = new MintTopping(coffee);
                    case 6 -> {
                        System.out.println("Ingrese el nombre del nuevo topping: ");
                        String coso = sc.nextLine();
                        System.out.println("Ingrese el precio del nuevo topping: ");
                        String temp_precio = sc.nextLine();
                        int precio = Integer.parseInt(temp_precio);
                        coffee = new ToppingBuilder(coffee, coso, precio);
                    }
                }

            }
            coffees.add(coffee);
        }
        System.out.println("--- RESUMEN DE CAFÉ PERSONALIZADO ---");
        IntStream.range(0, coffees.size())
                .forEach(i -> {
                    Beverage b = coffees.get(i);
                    System.out.println("Café " + (i + 1) + ":");
                    System.out.println("Ingredientes: " + b.getDescription());
                    System.out.println("Precio total: $" + b.getCost());
                    System.out.println();
                });
    }
}









