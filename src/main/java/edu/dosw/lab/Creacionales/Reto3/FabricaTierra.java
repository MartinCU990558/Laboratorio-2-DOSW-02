package edu.dosw.lab.Creacionales.Reto3;

import java.util.Map;

public final class FabricaTierra implements FabricaVehiculos {
    private final Map<Categoria, PoliticaCategoria> politicas = Map.of(
            Categoria.ECONOMICO, new Economico(),
            Categoria.LUJO, new Lujo(),
            Categoria.USADO, new Usado()
    );


    @Override
    public Vehiculo crear(String modelo, Categoria categoria) {
        Especificaciones base = switch (modelo.toLowerCase()) {
            case "auto" -> new Especificaciones(150, 35_000_000, "Aire acondicionado");
            case "bicicleta" -> new Especificaciones(40, 1_200_000, "Luces LED");
            case "moto" -> new Especificaciones(160, 12_000_000, "Frenos ABS");
            default -> throw new IllegalArgumentException("Modelo de tierra no soportado: " + modelo);
        };
        PoliticaCategoria pol = politicas.get(categoria);
        Especificaciones fin = pol.aplicar(base);
        return new VehiculoSimple(Tipo.TIERRA, categoria, capitalizar(modelo), fin.getVelocidadMaxKmH(), fin.getPrecioCop(), fin.getEquipamiento());
    }


    private static String capitalizar(String s){ return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase(); }

}