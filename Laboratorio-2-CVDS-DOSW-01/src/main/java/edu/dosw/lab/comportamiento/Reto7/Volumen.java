package comportamiento.Reto7;

public class Volumen {
    private int nivel = 0;

    public void ajustar(int valor) {
        nivel = valor;
        System.out.println("Volumen ajustado a " + nivel + "%");
    }

    public void reset() {
        nivel = 0;
        System.out.println("Volumen regresado a " + nivel + "%");
    }
}