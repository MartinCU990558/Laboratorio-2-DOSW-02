package edu.dosw.lab.solid;

public class Main {
    
    public static void main(String[] args) {

        Ingrediente lechuga = new Ingrediente("Lechuga", 500);
        Ingrediente tomate = new Ingrediente("Tomate", 700);
        Ingrediente queso = new Ingrediente("Queso", 1200);

        Menu menu = new Menu();
        menu.getIngredientes().add(lechuga);
        menu.getIngredientes().add(tomate);
        menu.getIngredientes().add(queso);

        menu.imprimirOpciones();
    }
}