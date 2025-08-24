package main.java.edu.dosw.lab.creacionales.reto3;

public class Car extends Vehicle {

    public Car(Category categoria, Type type) {
        super("Carro",
              categoria,
              type,
              120 * categoria.getSpeedMultiplier()* type.getSpeedMultiplier(),
              1000000 * categoria.getPriceMultiplier()* type.getPriceMultiplier(),
              "Aire Acondicionado"+categoria.getEquipment());
    }
}
