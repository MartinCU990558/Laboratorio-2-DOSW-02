package edu.dosw.lab.Creacionales.Reto3;

public final class Economico implements PoliticaCategoria {
    @Override public Especificaciones aplicar(Especificaciones base) {
        int vel = Math.max(1, (int) Math.round(base.getVelocidadMaxKmH() * 0.80));
        int precio = (int) Math.round(base.getPrecioCop() * 0.70);
        String equip = base.getEquipamiento() + (base.getEquipamiento().isEmpty()?"":" + ") + "Equipamiento básico";
        return new Especificaciones(vel, precio, equip);
    }
    @Override public String nombre() { return "Económico"; }

}