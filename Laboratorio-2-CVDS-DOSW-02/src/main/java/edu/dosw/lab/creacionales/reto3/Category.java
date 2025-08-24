package edu.dosw.lab.creacionales.reto3;
public interface Category {
    double getSpeedModifier();
    int getComfortModifier();
    double getPriceModifier();
    String modifyEquipment(String baseEquipment, String vehicleType);
    String toString();
}