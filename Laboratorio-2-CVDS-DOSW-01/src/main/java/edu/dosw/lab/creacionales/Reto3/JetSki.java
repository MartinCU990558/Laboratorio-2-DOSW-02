public class JetSki extends AbstractVehicle {
    public JetSki(Category category) {
        super("Jet Ski", category);
        this.baseSpeed = 80.0;
        this.baseComfort = 3;
        this.basePrice = 12000.0;
        this.baseEquipment = "Motor a reacción, Asiento individual";
    }
}
