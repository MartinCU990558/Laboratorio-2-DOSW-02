package edu.dosw.lab.estructurales.Reto5;

public class CafeSimple implements Cafe {
    @Override
    public String getDescripcion() {
        return "Cafe normal";
    }

    @Override
    public double getPrecio() {
        return 2500;
    }
}
