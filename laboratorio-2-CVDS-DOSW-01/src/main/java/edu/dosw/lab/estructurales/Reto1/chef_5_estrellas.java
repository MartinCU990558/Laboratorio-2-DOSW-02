package edu.dosw.lab.estructurales;
import java.util.Scanner;

public class chef_5_estrellas {
    static int pan;
    static int carne;
    static int queso;
    static int lechuga;
    static int tomate;
    static int salsa_especial;
    public String agregar_nuevo_ingrediente;
    public chef_5_estrellas(int pan, int carne, int queso, int lechuga, int tomate, int salsa_especial, int agregar_nuevo_ingrediente){
        chef_5_estrellas.pan = 3000;
        chef_5_estrellas.carne = 10000;
        chef_5_estrellas.queso = 5000;
        chef_5_estrellas.tomate = 2000;
        chef_5_estrellas.salsa_especial = 3000;

    }
    public void recibo(){

    }
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while(!salir){

            System.out.println("1. Pan ($3.000)");
            System.out.println("2. Carne ($10.000)");
            System.out.println("3. Queso ($5.000)");
            System.out.println("4. Lechuga ($2.000)");
            System.out.println("5. Tomate ($2.000)");
            System.out.println("6. Salsa especial ($3.000)");
            System.out.println("7. Agregar un nuevo ingrediente");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

        }


    }
}
