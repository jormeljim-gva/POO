package TiendaOnline;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private String nombre;
    private List<Producto> productos = new ArrayList<>();

    public Categoria(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
