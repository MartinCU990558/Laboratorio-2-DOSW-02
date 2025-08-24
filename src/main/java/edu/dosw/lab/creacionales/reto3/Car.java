package main.java.edu.dosw.lab.creacionales.reto3;

public class Car extends Vehicle {

    public Car(Category categoria) {
        super("Carro",
              120 * categoria.getSpeedMultiplier(),
              1000000 * categoria.getPriceMultiplier(),
              "Aire Acondicionado");
    }
}
