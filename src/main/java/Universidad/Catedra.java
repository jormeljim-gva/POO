package Universidad;

public class Catedra {
    private String nom_catedra;
    private Departamento departamento;
    private Facultat facultat;

    public Catedra(String nom_catedra, Departamento departamento, Facultat facultat) {
        this.nom_catedra = nom_catedra;
        this.departamento = departamento;
        this.facultat.getCatedras().add(this);
    }

    public String getNom_catedra() {
        return nom_catedra;
    }

    public void setNom_catedra(String nom_catedra) {
        this.nom_catedra = nom_catedra;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Facultat getFacultat() {
        return facultat;
    }

    public void setFacultat(Facultat facultat) {
        this.facultat = facultat;
    }

    @Override
    public String toString(){
        return this.nom_catedra;
    }
}
