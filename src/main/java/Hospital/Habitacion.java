package Hospital;

import java.util.ArrayList;
import java.util.List;

public class Habitacion {
    private String numeroHabitacion;
    private List<Paciente> pacientes = new ArrayList<>();

    public Habitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public void addPaciente(Paciente paciente){
        this.pacientes.add(paciente);
    }
}
