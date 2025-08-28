package edu.dosw.lab.creacionales.reto3;

public class VehiculoLujoFactory implements VehiculoFactory {
    public Vehiculo crearAuto()        { return new Auto("Lujo",       400000000, 350, "Cuero, pantalla tactil"); }
    public Vehiculo crearBicicleta()   { return new Bicicleta("Lujo",    5500000,  60, "Carbono, 22v"); }
    public Vehiculo crearMoto()        { return new Moto("Lujo",        100000000, 320, "Deportiva de lujo, fibra de carbono"); }
    public Vehiculo crearLancha()      { return new Lancha("Lujo",     300000000, 200, "Cabina de lujo, turbo"); }
    public Vehiculo crearVelero()      { return new Velero("Lujo",     200000000,  70, "Velas de alto rendimiento"); }
    public Vehiculo crearJetSki()      { return new JetSki("Lujo",      80000000, 150, "Biplaza de lujo"); }
    public Vehiculo crearAvion()       { return new Avion("Lujo",    500000000, 900, "Clase ejecutiva completa con todos los accesorios y autopiloto"); }
    public Vehiculo crearAvioneta()    { return new Avioneta("Lujo",   460000000, 400, "Privado con GPS avanzado y mejores alerones"); }
    public Vehiculo crearHelicoptero() { return new Helicoptero("Lujo", 720000000, 300, "Cabina de lujo con autopiloto"); }
}
