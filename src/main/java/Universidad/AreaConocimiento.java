package Universidad;

import java.util.ArrayList;
import java.util.List;

public class AreaConocimiento {
    private String nombre;
    private List<Departamento> departamentos = new ArrayList<>();

    public AreaConocimiento(String nombre, List<Departamento> departamentos) {
        this.nombre = nombre;
        this.departamentos = departamentos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public void addDepartamento(Departamento departamento){
        this.departamentos.add(departamento);
    }

    @Override
    public String toString(){
        return "nombre = " + this.nombre;
    }

}
