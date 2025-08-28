package estructurales.Reto5;
public class ChocolateTopping extends ToppingDecorator {
    public ChocolateTopping(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 1500;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Chocolate";
    }
}
