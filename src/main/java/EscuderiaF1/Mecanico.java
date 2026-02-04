package EscuderiaF1;

public class Mecanico extends Empleado {

    public Mecanico(String nombre) {
        super(nombre);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Mecánico: " + nombre);
    }
}

