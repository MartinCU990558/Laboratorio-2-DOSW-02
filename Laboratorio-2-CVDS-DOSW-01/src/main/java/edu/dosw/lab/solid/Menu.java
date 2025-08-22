package edu.dosw.lab.solid;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Menu {
    private List<Ingrediente> ingredientes = new ArrayList<>();
    private Hamburguesa hamburguesa = new Hamburguesa();

    public void imprimirOpciones(){
        System.out.println(ingredientes.stream().map(s -> String.format("%s ($ %d)", s.getNombre() ,s.getPrecio())).collect(Collectors.joining("\n")));
    }

    public void imprimirPersonalizada(){
        System.out.println("Hamburguesa personalizada:");
        System.out.println(hamburguesa.getIngredientes().stream().map(s -> String.format("%s ($ %d)", s.getNombre(), s.getPrecio())).collect(Collectors.joining("\n")));
    }

    public void imprimirDespedida(){
        
    }
}