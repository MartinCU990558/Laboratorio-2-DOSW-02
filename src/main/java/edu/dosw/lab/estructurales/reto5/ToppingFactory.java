package main.java.edu.dosw.lab.estructurales.reto5;

import java.util.Scanner;

public class ToppingFactory {
    public static Coffee addTopping(String topping, Coffee coffee) {
        switch (topping) {
            case "1":return new Milk(coffee);
            case "2":return new Chocolate(coffee);
            case "3":return new Caramel(coffee);
            case "4":return new Crema(coffee);
            case "5":return new Mint(coffee);
            case "6":
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese el topping personalizado: ");
                String customTopping = scanner.nextLine();
                System.out.print("Ingrese el precio: ");
                double price = scanner.nextDouble();
                return new CustomTopping(coffee, customTopping, price);
            default:
                return coffee;
        }

    }
}
