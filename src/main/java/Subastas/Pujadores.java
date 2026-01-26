package Subastas;

import java.util.ArrayList;
import java.util.List;

public class Pujadores {
    private String nombre;
    private List<Puja> pujas = new ArrayList<>();

    public Pujadores(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Puja> getPujas() {
        return pujas;
    }

    public void setPujas(List<Puja> pujas) {
        this.pujas = pujas;
    }

    public void addPuja(Puja puja){
        this.pujas.add(puja);
    }

    @Override
    public String toString() {
        return "Pujadores{" + "nombre=" + nombre + '}';
    }
}
