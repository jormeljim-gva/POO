package Hospital;

import java.util.ArrayList;
import java.util.List;

public class Intervencion {
    private String cod_intervencion;
    private Medico medico;
    private Paciente paciente;
    private List<Medicamento> medicamentos = new ArrayList<>();

    public Intervencion(String cod_intervencion, Medico medico, Paciente paciente) {
        this.cod_intervencion = cod_intervencion;
        this.medico = medico;
        this.medico.addIntervencion(this);
        this.paciente = paciente;
        this.paciente.addIntervenvion(this);
    }

    public String getCod_intervencion() {
        return cod_intervencion;
    }

    public void setCod_intervencion(String cod_intervencion) {
        this.cod_intervencion = cod_intervencion;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public void addMedicaqmento(Medicamento medicamento){
        this.medicamentos.add(medicamento);
        medicamento.getIntervenciones().add(this);
    }
}
