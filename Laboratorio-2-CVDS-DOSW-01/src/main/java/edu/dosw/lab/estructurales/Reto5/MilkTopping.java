package estructurales.Reto5;
public class MilkTopping extends ToppingDecorator {
    public MilkTopping(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 1000;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Leche";
    }
}
