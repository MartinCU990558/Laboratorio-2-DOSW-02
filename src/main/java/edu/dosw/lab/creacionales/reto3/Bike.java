package main.java.edu.dosw.lab.creacionales.reto3;

public class Bike extends Vehicle{

    public Bike(Category category, Type type) {
        super("Bicicleta",
              category,
              type,
              20*category.getSpeedMultiplier()* type.getSpeedMultiplier(),
              500000*category.getPriceMultiplier()* type.getPriceMultiplier(),
              "Campanilla "+category.getEquipment());
    }

}
