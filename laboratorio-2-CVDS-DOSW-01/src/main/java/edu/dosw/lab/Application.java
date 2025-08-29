package edu.dosw.lab;

import edu.dosw.lab.comportamientos.Reto4.Reto4;
import edu.dosw.lab.comportamientos.Reto6.reto6;
import edu.dosw.lab.creacionales.reto3.Reto3;
import edu.dosw.lab.estructurales.Reto1.reto1;
import edu.dosw.lab.estructurales.Reto2.Reto2;

public class Application {

    public static void main(String[] args) {
        System.out.println("Proyecto de Maven configurado y ejecutado correctamente");
        reto6.iniciarPrograma();
        reto1.iniciarPrograma();
        Reto3.iniciarPrograma();
        Reto2.iniciarPrograma();
        Reto4.iniciarPrograma();
    }
}
