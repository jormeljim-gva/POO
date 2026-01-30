package Animales;

public class Main {
    public static void main(String[] args) {
        Perro p = new Perro("Pepe");
        p.comuincarse();
        p.traerZapatillas();
        Gato g = new Gato("Martín");
        g.comuincarse();
        g.perseguirUnOvillo();
        g.mamar();
        g.respirar();
        g.moverse();
        Tiburon t = new Tiburon("Felipe");
        t.comuincarse();
        t.respirar();
        t.moverse();
    }
}
