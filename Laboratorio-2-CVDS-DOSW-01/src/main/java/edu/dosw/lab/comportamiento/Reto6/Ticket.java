package comportamiento.Reto6;
public class Ticket {
    private static int contador = 1;
    private int numero;
    private String descripcion;
    private String nivelDificultad;
    private String prioridad;
    private String estado;
    private String tecnicoResolvio;

    public Ticket(String descripcion, String nivelDificultad, String prioridad){
        this.numero = contador++;
        this.descripcion = descripcion;
        this.nivelDificultad = nivelDificultad;
        this.prioridad = prioridad;
        this.estado = "Pendiente";
        this.tecnicoResolvio = null;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public String getNivelDificultad() {
        return nivelDificultad;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public String getTecnicoResolvio() {
        return tecnicoResolvio;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTecnicoResolvio(String tecnicoResolvio) {
        this.tecnicoResolvio = tecnicoResolvio;
    }

    public int getNumero() {
        return numero;
    }
}