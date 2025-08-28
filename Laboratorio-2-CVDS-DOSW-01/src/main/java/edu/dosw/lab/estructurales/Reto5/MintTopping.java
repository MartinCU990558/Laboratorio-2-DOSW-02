package estructurales.Reto5;
public class MintTopping extends ToppingDecorator {
    public MintTopping(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 1300;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Menta";
    }
}
