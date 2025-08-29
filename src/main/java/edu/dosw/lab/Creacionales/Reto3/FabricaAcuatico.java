package edu.dosw.lab.Creacionales.Reto3;
import java.util.Map;

public final class FabricaAcuatico implements FabricaVehiculos{

    private final Map<Categoria, PoliticaCategoria> politicas = Map.of(
            Categoria.ECONOMICO, new Economico(),
            Categoria.LUJO, new Lujo(),
            Categoria.USADO, new Usado()
    );


    @Override
    public Vehiculo crear(String modelo, Categoria categoria) {
        Especificaciones base = switch (modelo.toLowerCase()) {
            case "lancha" -> new Especificaciones(70, 80_000_000, "Chalecos salvavidas");
            case "velero" -> new Especificaciones(50, 60_000_000, "Velas y equipo básico");
            case "jet ski", "jetski" -> new Especificaciones(90, 45_000_000, "2 plazas");
            default -> throw new IllegalArgumentException("Modelo acuático no soportado: " + modelo);
        };
        PoliticaCategoria pol = politicas.get(categoria);
        Especificaciones fin = pol.aplicar(base);
        return new VehiculoSimple(Tipo.ACUATICO, categoria, capitalizar(modelo), fin.getVelocidadMaxKmH(), fin.getPrecioCop(), fin.getEquipamiento());
    }

    private static String capitalizar(String s){ return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase(); }

}