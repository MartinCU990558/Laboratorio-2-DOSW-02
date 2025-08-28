public class CreamTopping extends ToppingDecorator {
    public CreamTopping(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 2000;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Crema Batida";
    }
}
