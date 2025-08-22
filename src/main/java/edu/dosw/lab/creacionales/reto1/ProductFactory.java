package main.java.edu.dosw.lab.creacionales.reto1;

public class ProductFactory {
    public static Product createProduct(String type){
        switch (type.toLowerCase()){
            case "pantalon":
                return new PantalonProduct();
            case "camiseta":
                return new CamisetaProduct();
            case "galletas":
                return new GalletasProduct();
            case "jugo":
                return new JugoProduct();
            default:
                return null;
        }
    }
}