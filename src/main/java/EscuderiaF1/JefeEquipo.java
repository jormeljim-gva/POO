package EscuderiaF1;

public class JefeEquipo extends Empleado{

    public JefeEquipo(String nombre){
        super(nombre);
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Jefe de equipo: " + nombre);
    }
}
