package TiendaOnline;

import java.util.ArrayList;
import java.util.List;

public class Producto {
    private String nombre;
    private double precio;
    private Categoria categoria;
    private Vendedor vendedor;
    private List<Resenya> resenyas = new ArrayList<>();
    public Producto(String nombre, double precio, Categoria categoria, Vendedor vendedor) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.vendedor = vendedor;
        this.vendedor.getProductos().add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<Resenya> getResenyas() {
        return resenyas;
    }

    public void setResenyas(List<Resenya> resenyas) {
        this.resenyas = resenyas;
    }
}
