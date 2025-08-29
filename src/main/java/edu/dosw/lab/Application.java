package edu.dosw.lab;

import edu.dosw.lab.comportamiento.reto4.Reto4;
import edu.dosw.lab.comportamiento.reto6.Reto6;
import edu.dosw.lab.comportamiento.reto7.Reto7;
import edu.dosw.lab.creacionales.reto1.Reto1;
import edu.dosw.lab.creacionales.reto3.Reto3;
import edu.dosw.lab.estructurales.reto2.Reto2;
import edu.dosw.lab.estructurales.reto5.Reto5;
import java.io.IOException;
public class Application {
    public static void main(String[] args) {
        System.out.println("Proyecto Maven configurado y corriendo correctamente");

        Reto1.ejecutar();
        waitForEnter(); // Pausa entre retos

        Reto2.main(args);
        waitForEnter();

        Reto3.main(args);
        waitForEnter();

        Reto4.main(args);
        waitForEnter();

        Reto5.main(args);
        waitForEnter();

        Reto6.main(args);
        waitForEnter();

        Reto7.main(args);
        waitForEnter();

    }

    private static void waitForEnter() {
        System.out.println("\nPresiona Enter para continuar al siguiente reto...");
        try {
            System.in.read();

            while (System.in.available() > 0) {
                System.in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}