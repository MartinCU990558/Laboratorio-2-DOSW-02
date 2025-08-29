package main.java.edu.dosw.lab;

import main.java.edu.dosw.lab.creacionales.reto1.reto1_Salamanca_Ariza;
import main.java.edu.dosw.lab.creacionales.reto2.reto2;
import main.java.edu.dosw.lab.creacionales.reto3.reto3;
import main.java.edu.dosw.lab.creacionales.reto4.reto4;
import main.java.edu.dosw.lab.estructurales.reto5.reto5;
import main.java.edu.dosw.lab.comportamentales.reto6;

public class Application {
    public static void main(String[] args){
        System.out.println("Proyecto Maven configurado y corriendo correctamente");

        reto1_Salamanca_Ariza.run();

        reto2.run();

        reto3.run();

        reto4.run();
        reto5.run();
        reto6.run();
    }
}