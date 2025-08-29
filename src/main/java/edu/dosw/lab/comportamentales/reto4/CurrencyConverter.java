package main.java.edu.dosw.lab.comportamentales.reto4;

public class CurrencyConverter {
    private final RateProvider rateProvider;

    public CurrencyConverter (RateProvider rateProvider) {
        this.rateProvider = rateProvider;
    }

    public double convert(Currency from, Currency to, double amount) {
        double rate = rateProvider.getRate(from.getCode(), to.getCode());
        return amount*rate;
    }
}
