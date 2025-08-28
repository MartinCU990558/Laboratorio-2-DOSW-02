public class ToppingBuilder extends ToppingDecorator {
    private int cost;
    private String description;
    public ToppingBuilder(Beverage beverage, String description, int cost) {
        super(beverage);
        this.cost = cost;
        this.description = description;
    }
    @Override
    public int getCost() {
        return beverage.getCost() + cost;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + " + " + description;
    }
}
