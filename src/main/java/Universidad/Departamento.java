package Universidad;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nom_dep;
    private AreaConocimiento area;
    private List<Catedra> catedras = new ArrayList<>();

    public Departamento(String nom_dep, AreaConocimiento area) {
        this.nom_dep = nom_dep;
        this.area = area;
        this.area.getDepartamentos().add(this);
    }

    public Departamento(String nom_dep, AreaConocimiento area, List<Catedra> catedras) {
        this.nom_dep = nom_dep;
        this.area = area;
        this.catedras = catedras;
    }

    public String getNom_dep() {
        return nom_dep;
    }

    public void setNom_dep(String nom_dep) {
        this.nom_dep = nom_dep;
    }

    public AreaConocimiento getArea() {
        return area;
    }

    public void setArea(AreaConocimiento area) {
        this.area = area;
    }

    public List<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(List<Catedra> catedras) {
        this.catedras = catedras;
    }

    public void addCatedras(Catedra catedra){
        this.catedras.add(catedra);
    }

    @Override
    public String toString(){
        return "Departamento{" + "nom_dep= " + this.nom_dep + "}";
    }
}
