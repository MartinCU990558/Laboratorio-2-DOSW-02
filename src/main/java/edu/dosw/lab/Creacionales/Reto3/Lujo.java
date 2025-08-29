package edu.dosw.lab.Creacionales.Reto3;

public final class Lujo implements PoliticaCategoria {
    @Override public Especificaciones aplicar(Especificaciones base) {
        int vel = (int) Math.round(base.getVelocidadMaxKmH() * 1.20);
        int precio = (int) Math.round(base.getPrecioCop() * 1.40);
        String equip = base.getEquipamiento() + (base.getEquipamiento().isEmpty()?"":" + ") + "Aire acondicionado + GPS";
        return new Especificaciones(vel, precio, equip);
    }
    @Override public String nombre() { return "Lujo"; }

}