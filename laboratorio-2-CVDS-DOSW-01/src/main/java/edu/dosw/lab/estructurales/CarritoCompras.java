package edu.dosw.lab.estructurales;

public class CarritoCompras {

    private ArrayList<Producto> ListaProductos;
    private String TCliente;

    public CarritoCompras(ArrayList<Producto> productos, String Tcliente){
        this.ListaProductos = productos;
        this.TCliente = Tcliente;
    }

    public ArrayList<Producto> getProductos(){
        return ListaProductos;
    }

    public String getTcliente(){
        return TCliente;
    }
}
