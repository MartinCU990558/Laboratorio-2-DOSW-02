package edu.dosw.lab.creacionales;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Recibo {
    private ArrayList<Ingrediente> ingredientes;
    private  Integer precioTotal;

    public Recibo(){
        ingredientes = new ArrayList<Ingrediente>();
    }

    public Integer calcularPrecioTotal(){
        return ingredientes.stream().mapToInt(Ingrediente::getPrecio).sum();
    }

    public void colocarIngrediente(Ingrediente ingrediente){
        ingredientes.add(ingrediente);
    }

    public void setPrecioTotal(){
        precioTotal = calcularPrecioTotal();
    }
    public List<String> getIngredientesNombre(){
        return ingredientes.stream().map(Ingrediente::getNombre).collect(Collectors.toList());
    }

    public Integer getPrecioTotal() {
        return precioTotal;
    }
}
