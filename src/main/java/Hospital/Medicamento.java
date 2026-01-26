package Hospital;

import java.util.ArrayList;
import java.util.List;

public class Medicamento {
    private String nombre;
    private List<Intervencion> intervenciones = new ArrayList<>();

    public Medicamento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Intervencion> getIntervenciones() {
        return intervenciones;
    }

    public void setIntervenciones(List<Intervencion> intervenciones) {
        this.intervenciones = intervenciones;
    }

    public void addIntervencion(Intervencion intervencion){
        this.intervenciones.add(intervencion);
        intervencion.getMedicamentos().add(this);
    }
}
