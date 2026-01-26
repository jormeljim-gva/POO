package Hospital;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String nombre;
    private Habitacion habitacion;
    private List<Intervencion> intervenciones = new ArrayList<>();

    public Paciente(String nombre, Habitacion habitacion) {
        this.nombre = nombre;
        this.habitacion = habitacion;
        this.habitacion.addPaciente(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public List<Intervencion> getIntervenciones() {
        return intervenciones;
    }

    public void setIntervenciones(List<Intervencion> intervenciones) {
        this.intervenciones = intervenciones;
    }

    public void addIntervenvion(Intervencion intervencion){
        this.intervenciones.add(intervencion);
    }
}
