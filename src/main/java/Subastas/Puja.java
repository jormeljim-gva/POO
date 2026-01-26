package Subastas;

import java.util.List;

public class Puja {
    private int cantidad;
    private Pujadores pujadores;
    private Lote lote;

    public Puja(int cantidad, Pujadores pujadores, Lote lote) {
        this.cantidad = cantidad;
        this.pujadores = pujadores;
        this.lote = lote;

    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Pujas{" + "cantidad=" + cantidad + '}';
    }
}
