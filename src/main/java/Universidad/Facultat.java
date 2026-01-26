package Universidad;

import java.util.ArrayList;
import java.util.List;

public class Facultat {
    private String nom_facultat;
    private List<Catedra> catedras = new ArrayList<>();

    public Facultat(String nom_facultat, List<Catedra> catedras) {
        this.nom_facultat = nom_facultat;
        this.catedras = catedras;
    }

    public String getNom_facultat() {
        return nom_facultat;
    }

    public void setNom_facultat(String nom_facultat) {
        this.nom_facultat = nom_facultat;
    }

    public List<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(List<Catedra> catedras) {
        this.catedras = catedras;
    }

    public void addCatedra (Catedra catedra){
       this.catedras.add(catedra);
    }

    @Override
    public String toString(){
        return this.nom_facultat;
    }
}
