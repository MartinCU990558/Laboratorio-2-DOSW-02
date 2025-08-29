package edu.dosw.lab.Creacionales.Reto3;

import java.util.Map;

public final class FabricaAereo implements FabricaVehiculos {

    private final Map<Categoria, PoliticaCategoria> politicas = Map.of(
            Categoria.ECONOMICO, new Economico(),
            Categoria.LUJO, new Lujo(),
            Categoria.USADO, new Usado()
    );


    @Override
    public Vehiculo crear(String modelo, Categoria categoria) {
        Especificaciones base = switch (modelo.toLowerCase()) {
            case "avión", "avion" -> new Especificaciones(850, 2_000_000_000, "Cabina presurizada");
            case "avioneta" -> new Especificaciones(250, 150_000_000, "Instrumentos básicos de vuelo");
            case "helicóptero", "helicoptero" -> new Especificaciones(300, 800_000_000, "Rotores compuestos");
            default -> throw new IllegalArgumentException("Modelo aéreo no soportado: " + modelo);
        };
        PoliticaCategoria pol = politicas.get(categoria);
        Especificaciones fin = pol.aplicar(base);
        return new VehiculoSimple(Tipo.AEREO, categoria, capitalizar(modelo), fin.getVelocidadMaxKmH(), fin.getPrecioCop(), fin.getEquipamiento());
    }

    private static String capitalizar(String s){ return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase(); }

}