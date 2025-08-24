package edu.dosw.lab.creacionales.reto3;

public abstract class AbstractVehicle implements Vehicle {
    protected final String type;
    protected double baseSpeed;
    protected int baseComfort;
    protected double basePrice;
    protected String baseEquipment;
    protected final Category category;

    public AbstractVehicle(String type, Category category) {
        this.type = type;
        this.category = category;
    }

    @Override public String getType() { return type; }

    @Override public double getMaxSpeed() {
        return baseSpeed * category.getSpeedModifier();
    }

    @Override public int getComfort() {
        int modified = baseComfort + category.getComfortModifier();
        return Math.max(1, Math.min(10, modified));
    }

    @Override public double getPrice() {
        return basePrice * category.getPriceModifier();
    }

    @Override public String getEquipment() {
        return category.modifyEquipment(baseEquipment, type);
    }

    public String toString(){
        return ("Tipo: " + getType() + "\n" + "Categoría: " + category.toString() + "\n" + "Velocidad Máxima: " + getMaxSpeed() + "km/h" + "\n" + "Precio: $" +
                getPrice() + "\n" + "Equipamiento: "+ getEquipment());
    }

}