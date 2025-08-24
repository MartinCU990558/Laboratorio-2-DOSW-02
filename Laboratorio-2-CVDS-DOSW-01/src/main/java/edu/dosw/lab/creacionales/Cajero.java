package edu.dosw.lab.creacionales;

public class Cajero {
    Recibo recibo;

    public Cajero(){
        reset();
    }

    public void reset() {
        recibo = new Recibo();
    }

    public void colocarIngrediente(Ingrediente ingrediente) {
        recibo.colocarIngrediente(ingrediente);
    }

    public Recibo obtenerRecibo(){
        recibo.setPrecioTotal();
        return recibo;
    }

}
