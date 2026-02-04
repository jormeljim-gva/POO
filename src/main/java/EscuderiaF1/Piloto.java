package EscuderiaF1;

public class Piloto extends Empleado {

    public Piloto(String nombre) {
        super(nombre);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Piloto: " + nombre);
    }
}
