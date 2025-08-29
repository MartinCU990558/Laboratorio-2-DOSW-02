import java.util.Scanner;

import comportamiento.Reto1.Reto1;
import creacionales.Reto2.Reto2HamburguesasPepe;
import creacionales.Reto3.Reto3;
import estructurales.Reto5.Reto5;
import comportamiento.Reto6.SistemaSoporteTecnico;
import comportamiento.Reto7.ControlRemoto;
import solid.Reto4.Reto4CasaDeCambioPepe;

public class Application {

    public static void main(String[] args) {
        System.out.println("✅ Proyecto Maven configurado y corriendo correctamente");

        Scanner sc = new Scanner(System.in);

        System.out.println("\nSeleccione el reto que desea ejecutar:");
        System.out.println("1. Reto1");
        System.out.println("2. Reto2");
        System.out.println("3. Reto3");
        System.out.println("4. Reto4");
        System.out.println("5. Reto5");
        System.out.println("6. Reto6");
        System.out.println("7. Reto7");
        System.out.println("8. Reto8");

        System.out.print("👉 Ingrese un número: ");
        String input = sc.nextLine().trim();

        int opcion;
        try {
            opcion = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida, por favor ingrese un número.");
            return;
        }

        switch (opcion) {
            case 1 -> Reto1.ejecutar();
            case 2 -> Reto2HamburguesasPepe.ejecutar();
            case 3 -> Reto3.ejecutar();
            case 4 -> Reto4CasaDeCambioPepe.ejecutar();
            case 5 -> Reto5.ejecutar();
            case 6 -> SistemaSoporteTecnico.ejecutar();
            case 7 -> ControlRemoto.ejecutar();
            case 8 -> System.out.println("docs/uml/Reto8/zoologico.asta");
            default -> System.out.println("Opción no válida.");
        }
        System.out.println("Muchas Gracias !");
        sc.close();
    }
}
