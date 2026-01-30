package Trabajadores;

public class Diectivo extends Empleado {
    Diectivo(String nombre){
        super(nombre);
    }

    @Override
    public String toString() {
        super.toString();
        return "Diectivo: ";
    }

}
