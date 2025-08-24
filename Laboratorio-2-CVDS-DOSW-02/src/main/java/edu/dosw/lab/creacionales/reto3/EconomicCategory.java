package edu.dosw.lab.creacionales.reto3;
import java.util.Arrays;
import java.util.stream.Collectors;

public class EconomicCategory implements Category {
    @Override public double getSpeedModifier() { return 1.0; }
    @Override public int getComfortModifier() { return 0; }
    @Override public double getPriceModifier() { return 0.8; }
    @Override public String modifyEquipment(String baseEquipment, String vehicleType) {
        String[] equipmentArray = baseEquipment.isEmpty() ? new String[0] : baseEquipment.split(",\\s*");
        String modified = Arrays.stream(equipmentArray)
                .filter(item -> !Arrays.asList("GPS", "Asientos de cuero", "Sistema de sonido premium", "Cuadro de carbono").contains(item))
                .collect(Collectors.joining(", "));
        return modified.isEmpty() ? "Equipamiento básico" : modified + ", Equipamiento básico";
    }
    @Override public String toString() {
        return "Económico";
    }
}