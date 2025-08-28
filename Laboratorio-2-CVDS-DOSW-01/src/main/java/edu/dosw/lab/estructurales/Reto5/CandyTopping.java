public class CandyTopping extends ToppingDecorator {
    public CandyTopping(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 1200;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Caramelo";
    }
}
