package EscuderiaF1;

public class Main {
    public static void main(String[] args) {
        CEO ceo = new CEO("Adrian Newey");
        JefeEquipo jefe = new JefeEquipo("Andy Cowell");
        Piloto piloto1 = new Piloto("Fernando Alonso");
        Piloto piloto2 = new Piloto("Lance Stroll");
        Mecanico mecanico1 = new Mecanico("Pedro de la Rosa");
        Mecanico mecanico2 = new Mecanico("Manolo");
        Coche coche14 = new Coche(14, piloto1, mecanico1);
        Coche coche18 = new Coche(18, piloto2, mecanico2);
        Escuderia aston = new Escuderia("Aston Martin", ceo, jefe, coche14);
        aston.mostrarEstructura();
    }
}
