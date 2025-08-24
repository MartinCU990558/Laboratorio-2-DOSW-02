package main.java.edu.dosw.lab.creacionales.reto3;

public class Airplane extends Vehicle{

    public Airplane(Category category) {
        super("Avioneta",
              200* category.getSpeedMultiplier(),
              200000000* category.getPriceMultiplier(),
              "Equipo Basico de Vuelo "+category.getEquipment());
    }
}
