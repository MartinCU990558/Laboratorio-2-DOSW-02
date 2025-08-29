package main.java.edu.dosw.lab.comportamentales.reto7.items;

public class Music{
    private int volume;
    private int previousVolume;

    public Music(){
        this.volume = 0;
    }

    public void setVolume(int volume){
        this.previousVolume = this.volume;
        this.volume = volume;
    }

    public int getPreviousVolume(){
        return previousVolume;
    }

    public int getVolume(){
        return volume;
    }
}
