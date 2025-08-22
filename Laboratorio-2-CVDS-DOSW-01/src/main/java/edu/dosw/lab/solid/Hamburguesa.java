package edu.dosw.lab.solid;
import java.util.ArrayList;
import java.util.List;

public class Hamburguesa {
    private List<Ingrediente> ingredientes = new ArrayList<>();
    private int precioTotal;


    private int calcularPrecioTotal(){
        return  ingredientes.stream().mapToInt(s -> s.getPrecio()).sum();
    }

    public void addIngredientes(Ingrediente ingrediente){
        ingredientes.add(ingrediente);
    }
}