package Subastas;

public class Main {
    public static void main(String[] args) {
        Subasta sub1 = new Subasta("Hoy");
        Lote lote = new Lote("1", 1000, sub1);
        Articulo articulo = new Articulo("Coche", "10000€", lote);
        lote.addArticulo(articulo);
        Pujadores pujador = new Pujadores("Pepe");
        Puja puja = new Puja(11000, pujador, lote);
        lote.addPuja(puja);
    }
}