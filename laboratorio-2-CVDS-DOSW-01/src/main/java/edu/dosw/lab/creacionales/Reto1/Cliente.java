package edu.dosw.lab.estructurales.Reto1;

public class Cliente {
    private String nombre;
    private EstrategiaDescuento estrategiaDescuento;
    private String tipoCliente;
    

    public Cliente(String tipoCliente){
      
        this.tipoCliente = tipoCliente;
        switch (tipoCliente.toLowerCase()) {
            case "frecuente":
                this.estrategiaDescuento = new DescuentoClienteFrecuente();
                break;
            case "nuevo":
                this.estrategiaDescuento = new DescuentoClienteNuevo();
                break;
        }
    }

    public double calcularDescuento(double total){
        return estrategiaDescuento.aplicarDescuento(total);
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

}
