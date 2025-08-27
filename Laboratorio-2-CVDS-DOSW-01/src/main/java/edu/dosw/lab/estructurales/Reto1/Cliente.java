public class Cliente {
    private String Antiguedad;
    private DescuentoStrategy descuentoStrategy;

    public Cliente(boolean esFrecuente) {
        Antiguedad = esFrecuente ? "Frecuente" : "Nuevo";
        this.descuentoStrategy = esFrecuente ? new DescuentoFrecuente() : new DescuentoNuevo();
    }

    public double getDescuentoPorcentaje() { return descuentoStrategy.getPorcentaje(); }
    public String getAntiguedad() {return Antiguedad;}
}
