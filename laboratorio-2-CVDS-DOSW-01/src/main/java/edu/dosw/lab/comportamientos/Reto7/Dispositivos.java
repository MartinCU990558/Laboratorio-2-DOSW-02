package edu.dosw.lab.comportamientos.Reto7;


public class Dispositivos {
    private final Luz luz = new Luz();
    private final Puerta puerta = new Puerta();
    private final Musica musica = new Musica();

    public Luz luz() { return luz; }
    public Puerta puerta() { 
        return puerta;
     }
    public Musica musica() { 
        return musica;
     }
}