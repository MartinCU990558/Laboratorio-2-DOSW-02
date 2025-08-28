public class Coffee implements Beverage{
    @Override
    public int getCost() {
        return 2000;
    }

    @Override
    public String getDescription() {
        return "Café base";
    }
}
