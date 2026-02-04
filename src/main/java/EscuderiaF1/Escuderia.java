package EscuderiaF1;

public class Escuderia {
    private String nombre;
    private CEO ceo;
    private JefeEquipo jefeEquipo;
    private Coche coche;

    public Escuderia(String nombre, CEO ceo, JefeEquipo jefeEquipo, Coche coche) {
        this.nombre = nombre;
        this.ceo = ceo;
        this.jefeEquipo = jefeEquipo;
        this.coche = coche;
    }

    public void mostrarEstructura(){
        System.out.println("Escuderia: " + nombre);
        ceo.mostrarInfo();
        jefeEquipo.mostrarInfo();
        coche.mostrarInfo();
    }

}
