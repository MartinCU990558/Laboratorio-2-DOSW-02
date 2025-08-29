package edu.dosw.lab.Creacionales.Reto3;

public final class Usado implements PoliticaCategoria {
    @Override public Especificaciones aplicar(Especificaciones base) {
        int vel = (int) Math.round(base.getVelocidadMaxKmH() * 0.90);
        int precio = (int) Math.round(base.getPrecioCop() * 0.60);
        String equip = base.getEquipamiento() + (base.getEquipamiento().isEmpty()?"":" + ") + "Revisión mecánica";
        return new Especificaciones(vel, precio, equip);
    }
    @Override public String nombre() { return "Usado"; }
}
