package Subastas;

import Biblioteca.Lector;

public class Articulo {
    private  String nombre;
    private String precio;
    private Lote lote;

    public Articulo(String nombre, String precio, Lote lote) {
        this.nombre = nombre;
        this.precio = precio;
        this.lote = lote;
        this.lote.getArticulos().add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "nombre='" + nombre + '\'' +
                ", fecha='" + precio + '\'' +
                '}';
    }
}
