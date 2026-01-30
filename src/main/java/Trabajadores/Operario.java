package Trabajadores;

public class Operario extends Empleado {
    Operario (String nombre){
        super(nombre);
    }
    @Override
    public String toString() {
        super.toString();
        return "Operario: ";
    }

}