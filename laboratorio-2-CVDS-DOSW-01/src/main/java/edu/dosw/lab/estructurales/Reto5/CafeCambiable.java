package edu.dosw.lab.estructurales.reto5;

public abstract class CafeCambiable implements Cafe {
    protected Cafe cafe;

    public CafeCambiable(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion();
    }

    @Override
    public double getPrecio() {
        return cafe.getPrecio();
    }
}
