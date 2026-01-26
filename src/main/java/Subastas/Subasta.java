package Subastas;

import java.util.ArrayList;
import java.util.List;

public class Subasta {
    private String fecha;
    private List<Lote> lotes = new ArrayList<>();

    public Subasta(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public List<Lote> getLotes() {
        return lotes;
    }

    public void setLotes(List<Lote> lotes) {
        this.lotes = lotes;
    }

    public void addLote(Lote lote) {
        this.lotes.add(lote);
    }

}
