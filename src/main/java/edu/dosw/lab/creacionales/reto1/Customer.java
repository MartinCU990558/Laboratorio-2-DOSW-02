package main.java.edu.dosw.lab.creacionales.reto1;

public class Customer {
    private float discount;
    private String type;

    public Customer(float discount, String type) {
        this.discount = discount;
        this.type = type;
    }

    public float getDiscount() {
        return discount;
    }

    public String getType() {
        return type;
    }
}
