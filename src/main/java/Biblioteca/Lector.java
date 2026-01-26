package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Lector {
    private String dni;
    private List<Ejemplar> ejemplares = new ArrayList<>();

    public Lector(String dni, List<Ejemplar> ejemplares) {
        this.dni = dni;
        this.ejemplares = ejemplares;

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(List<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

}
