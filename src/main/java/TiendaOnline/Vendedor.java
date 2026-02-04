package TiendaOnline;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Usuario{
    private List<Producto> productos = new ArrayList<>();

    public Vendedor(String nombre) {
        super(nombre);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void addProducto(Producto producto){
        this.productos.add(producto);
    }
}
