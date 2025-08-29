package main.java.edu.dosw.lab.comportamentales.reto7.items;

public class Door{
    private boolean IsOpen;

    public Door(){
        IsOpen = false;
    }

    public void open(){
        IsOpen = true;
    }

    public void close(){
        IsOpen = false;
    }

    public boolean getIsOpen() {
        return IsOpen;
    }
}
