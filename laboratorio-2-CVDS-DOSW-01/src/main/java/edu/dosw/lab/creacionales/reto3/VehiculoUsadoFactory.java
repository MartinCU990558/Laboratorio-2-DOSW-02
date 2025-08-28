package edu.dosw.lab.creacionales.reto3;

public class VehiculoUsadoFactory implements VehiculoFactory {
    public Vehiculo crearAuto()        { return new Auto("Usado",        30000000, 140, "Buen estado, sin raspones ni daños en el motor"); }
    public Vehiculo crearBicicleta()   { return new Bicicleta("Usado",      100000,  30, "Usada, cuidada y accesorios"); }
    public Vehiculo crearMoto()        { return new Moto("Usado",         3000000, 100, "Mantenimiento al día, y con tecnico mecanica"); }
    public Vehiculo crearLancha()      { return new Lancha("Usado",      45000000,  80, "Funcional"); }
    public Vehiculo crearVelero()      { return new Velero("Usado",      40000000,  40, "Velas en buen estado y motor nuevo"); }
    public Vehiculo crearJetSki()      { return new JetSki("Usado",      18000000,  90, "Monoplaza usado"); }
    public Vehiculo crearAvion()       { return new Avion("Usado",      150000000, 450, "Segunda mano, sin daños"); }
    public Vehiculo crearAvioneta()    { return new Avioneta("Usado",   100000000, 200, "Buen estado general con retoques de pintura"); }
    public Vehiculo crearHelicoptero() { return new Helicoptero("Usado", 70000000, 180, "Básico, autopiloto dañado"); }
}
