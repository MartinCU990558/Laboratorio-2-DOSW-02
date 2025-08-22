package main.java.edu.dosw.lab.Laboratorio_2_CVDS_DOSW_02.reto1;

public class ProductFactory {
    public static Product createProduct(String type){
        switch (type){
            case "Pantalón":
                return new PantalonProduct();
            case "Camiseta":
                return new CamisetaProduct();
            case "Galletas":
                return new GalletasProduct();
            case "Jugo":
                return new JugoProduct();
            default:
                return null;
        }
    }
}