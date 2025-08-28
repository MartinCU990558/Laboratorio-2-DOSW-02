public abstract class ToppingDecorator implements Beverage{
    protected Beverage beverage;

    public ToppingDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public int getCost() {
        return beverage.getCost();
    }
    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

}
