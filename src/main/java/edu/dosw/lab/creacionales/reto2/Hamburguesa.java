package main.java.edu.dosw.lab.creacionales.reto2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Hamburguesa {
    private Ingredient queso;
    private Ingredient carne;
    private Ingredient pan;
    private Ingredient lechuga;
    private Ingredient tomate;
    private Ingredient salsa;
    private Ingredient customIngredient;

    public Hamburguesa(Builder builder) {
        this.queso = builder.queso;
        this.carne = builder.carne;
        this.pan = builder.pan;
        this.lechuga = builder.lechuga;
        this.tomate = builder.tomate;
        this.salsa = builder.salsa;
        this.customIngredient = builder.customIngredient;
    }

    public ArrayList<Ingredient> getIngredientes() {
        return Stream.of(queso, carne, pan, lechuga, tomate, salsa, customIngredient).filter(ingrediente -> ingrediente != null).collect(Collectors.toCollection(ArrayList::new));
    }

    public static class Builder {
        private Ingredient queso;
        private Ingredient carne;
        private Ingredient pan;
        private Ingredient lechuga;
        private Ingredient tomate;
        private Ingredient salsa;
        private Ingredient customIngredient;

        public Builder setQueso() {
            this.queso = new Ingredient("Queso", 1000);
            return this;
        }

        public Builder setCarne() {
            this.carne = new Ingredient("Carne", 2000);
            return this;
        }

        public Builder setPan() {
            this.pan = new Ingredient("Pan", 3000);
            return this;
        }

        public Builder setLechuga() {
            this.lechuga = new Ingredient("Lechuga", 500);
            return this;
        }

        public Builder setTomate() {
            this.tomate = new Ingredient("Tomate", 500);
            return this;
        }

        public Builder setSalsa() {
            this.salsa = new Ingredient("Salsa", 500);
            return this;
        }
        public Builder setCustomIngredient(String name, double price) {
            this.customIngredient = new Ingredient(name, price);
            return this;
        }

        public Hamburguesa build() {
            return new Hamburguesa(this);
        }



    }

}
