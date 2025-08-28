package edu.dosw.lab.creacionales.reto3;

public class VehiculoEconomicoFactory implements VehiculoFactory {
    public Vehiculo crearAuto()        { return new Auto("Económico",     60000000, 160, "Equipamiento simple"); }
    public Vehiculo crearBicicleta()   { return new Bicicleta("Económico",   700000,  35, "Acero, cambios simples"); }
    public Vehiculo crearMoto()        { return new Moto("Económico",      5000000, 120, "Pintura simple"); }
    public Vehiculo crearLancha()      { return new Lancha("Económico",   75000000,  90, "Sin cabina"); }
    public Vehiculo crearVelero()      { return new Velero("Económico",   55000000,  50, "Velas simples"); }
    public Vehiculo crearJetSki()      { return new JetSki("Económico",   35000000, 110, "Monoplaza"); }
    public Vehiculo crearAvion()       { return new Avion("Económico",   300000000, 500, "Modelo sin pantalla, jacuzzi, mini bar"); }
    public Vehiculo crearAvioneta()    { return new Avioneta("Económico",150000000, 250, "Instrumentos simples"); }
    public Vehiculo crearHelicoptero() { return new Helicoptero("Económico",120000000,220,"Equipamiento simples"); }
}
