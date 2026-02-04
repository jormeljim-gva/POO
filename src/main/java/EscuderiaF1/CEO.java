package EscuderiaF1;

public class CEO extends Empleado {

    public CEO(String nombre) {
        super(nombre);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("CEO de la escudería: " + nombre);
    }

}
