package edu.dosw.lab.creacionales.reto3;
import java.util.Arrays;
import java.util.stream.Collectors;

public class UsedCategory implements Category {
    @Override public double getSpeedModifier() { return 0.7; }
    @Override public int getComfortModifier() { return -2; }
    @Override public double getPriceModifier() { return 0.5; }
    @Override public String modifyEquipment(String baseEquipment, String vehicleType) {
        String[] equipmentArray = baseEquipment.isEmpty() ? new String[0] : baseEquipment.split(",\\s*");
        String modified = Arrays.stream(equipmentArray).filter(item -> !Arrays.asList("GPS", "Asientos de cuero", "Sistema de sonido premium", "Cuadro de carbono").contains(item)).collect(Collectors.joining(", "));
        return modified.isEmpty() ? "Reparaciones necesarias" : modified + ", Reparaciones necesarias";
    }
    @Override public String toString() {
        return "Usado";
    }
}