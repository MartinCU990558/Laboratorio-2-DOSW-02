package edu.dosw.lab.estructurales.reto5;

import java.util.ArrayList;
import java.util.List;

public class Cafe {
    private List<Topping> toppingElegidos;
    private Integer precio;
    public Cafe(ArrayList<Topping> toppingElegidos) {
        this.toppingElegidos = toppingElegidos;
        this.precio = 2000;
        for(Topping topping : this.toppingElegidos){
            this.precio += topping.getPrecio();
        }
    }

    public Integer getPrecio() {
        return precio;
    }

    public List<Topping> getToppingsElegidos() {
        return toppingElegidos;
    }
}
