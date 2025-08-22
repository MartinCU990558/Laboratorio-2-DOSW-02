package main.java.edu.dosw.lab.creacionales.reto1;

public class CustomerFactory {

    public static Customer createCustomer(String type) {
        if (type.equals("frecuente")) {
            return new FrecuentCustomer();
        } else if (type.equals("nuevo")) {
            return new NewCustomer();
        } else {
            throw new IllegalArgumentException("Tipo de cliente no valido");
        }
    }
}
