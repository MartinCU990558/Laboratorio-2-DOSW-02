package main.java.edu.dosw.lab.comportamentales.reto7.items;

public class Ligths{
    private boolean IsOn;

    public Ligths(){
        IsOn = false;
    }

    public void turnOn(){
        IsOn = true;
    }

    public void turnOff(){
        IsOn = false;
    }

    public boolean getIsOn() {
        return IsOn;
    }
}
