package edu.dosw.lab.estructurales.reto5;

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
