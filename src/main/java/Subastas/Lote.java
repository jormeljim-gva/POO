package Subastas;

import java.util.ArrayList;
import java.util.List;

public class Lote {
    private String numero;
    private int precio_salida;
    private Subasta subasta;
    private List<Articulo> articulos = new ArrayList<>();
    private List<Puja> pujas = new ArrayList<>();

    public Lote(String numero, int precio_salida, Subasta subasta) {
        this.numero = numero;
        this.precio_salida = precio_salida;
        this.subasta = subasta;
        this.subasta.getLotes().add(this);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getPrecio_salida() {
        return precio_salida;
    }

    public void setPrecio_salida(int precio_salida) {
        this.precio_salida = precio_salida;
    }

    public Subasta getSubasta() {
        return subasta;
    }

    public void setSubasta(Subasta subasta) {
        this.subasta = subasta;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    public void addArticulo (Articulo articulo) {
        this.articulos.add(articulo);
    }

    public List<Puja> getPujas() {
        return pujas;
    }

    public void setPujas(List<Puja> pujas) {
        this.pujas = pujas;
    }

    public void addPuja(Puja puja){
        this.pujas.add(puja);
    }

}
