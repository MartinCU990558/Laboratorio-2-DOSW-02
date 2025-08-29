package edu.dosw.lab.Estructurales.Reto5;

public abstract class DecoradorTopping implements Cafe {

    protected final Cafe cafe;

    protected DecoradorTopping(Cafe cafe) {

        this.cafe = cafe;

    }

}

