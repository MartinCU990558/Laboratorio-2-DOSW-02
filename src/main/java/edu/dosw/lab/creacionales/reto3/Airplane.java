package main.java.edu.dosw.lab.creacionales.reto3;

public class Airplane extends Vehicle{

    public Airplane(Category category, Type type) {
        super("Avioneta",
              category,
              type,
              200* category.getSpeedMultiplier()* type.getSpeedMultiplier(),
              200000000* category.getPriceMultiplier(),
              "Equipo Basico de Vuelo "+category.getEquipment());
    }
}
