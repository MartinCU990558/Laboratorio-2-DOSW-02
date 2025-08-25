package main.java.edu.dosw.lab;

public class CurrencyFactory {
    public static Currency createCurrency(String code) {
        switch (code.toUpperCase()) {
            case "USD":
                return new USD();
            case "EUR":
                return new EUR();
            case "JPY":
                return new JPY();
            case "COP":
                return new COP();
            default:
                return null;
        }
    }
}
