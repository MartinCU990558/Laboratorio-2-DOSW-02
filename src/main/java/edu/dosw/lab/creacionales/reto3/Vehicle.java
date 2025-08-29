package main.java.edu.dosw.lab.creacionales.reto3;

public class Vehicle {
    private final Model model;
    private final Category category;
    private final Type type;
    private final double speed;
    private final double price;
    private final String equipment;

    private Vehicle(Builder builder) {
        this.model = builder.model;
        this.category = builder.category;
        this.type = builder.type;
        this.speed = builder.type.getSpeedMultiplier()*builder.category.getSpeedMultiplier()*builder.model.getBaseSpeed();
        this.price =builder.type.getPriceMultiplier()*builder.category.getPriceMultiplier()*builder.model.getBasePrice();
        this.equipment = builder.category.getEquipment()+" + "+builder.model.getEquipment();
    }

    public String getModel() {
        return model.getName();
    }
    public String getCategory() {
        return category.getName();
    }
    public String getType() {
        return type.getName();
    }
    public double getSpeed() {
        return speed;
    }
    public double getPrice() {
        return price;
    }
    public String getEquipment() {
        return equipment;
    }

    public static class Builder {
        private Model model;
        private Category category;
        private Type type;

        public Builder setModel(Model model) {
            this.model = model;
            return this;
        }
        public Builder setCategory(Category category) {
            this.category = category;
            return this;
        }
        public Builder setType(Type type) {
            this.type = type;
            return this;
        }
        public Vehicle build() {
            return new Vehicle(this);
        }
    }
}
