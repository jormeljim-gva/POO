package Hospital;

public class Main {
    public static void main(String[] args) {
        Hospital general = new Hospital("General");
        Departamento rayos = new Departamento("Rayos", general);
        Medico pepe = new Medico("Pepe");
        Habitacion h = new Habitacion("A201");
        Paciente juan = new Paciente("Juan", h);
        Intervencion i = new Intervencion("Consulta", pepe, juan);
        Medicamento m = new Medicamento("Ibuprofeno");
    }
}
