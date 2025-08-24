package main.java.edu.dosw.lab.creacionales.reto3;

public class Bike extends Vehicle{

    public Bike(Category category) {
        super("Bicicleta",
              20*category.getSpeedMultiplier(),
              500000*category.getPriceMultiplier(),
              "Campanilla "+category.getEquipment());
    }

}
