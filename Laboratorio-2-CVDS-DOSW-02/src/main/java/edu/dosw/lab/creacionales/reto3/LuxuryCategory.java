package edu.dosw.lab.creacionales.reto3;
public class LuxuryCategory implements Category {
    @Override public double getSpeedModifier() { return 2.0; }
    @Override public int getComfortModifier() { return 5; }
    @Override public double getPriceModifier() { return 2.5; }
    @Override public String modifyEquipment(String baseEquipment, String vehicleType) {
        String modified = baseEquipment.isEmpty() ? "" : baseEquipment + ", ";
        switch (vehicleType) {
            case "Auto":
            case "Avión":
            case "Avioneta":
            case "Helicóptero":
            case "Lancha":
                modified += "GPS, Asientos de cuero, Sistema de sonido premium";
                break;
            case "Moto":
            case "Jet Ski":
                modified += "GPS, Asiento ergonómico";
                break;
            case "Velero":
                modified += "GPS, Cabina de lujo";
                break;
            case "Bicicleta":
                modified += "Cuadro de carbono";
                break;
        }
        return modified;
    }
    @Override public String toString() {
        return "Lujo";
    }
}