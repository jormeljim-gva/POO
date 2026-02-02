package TiendaOnline;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String nombre;
    private String fecha;
    private String direccion;
    private Comprador usuario;
    private List<Producto> productos = new ArrayList<>();
    private MetodoPago metodoPago;

    public Pedido(String nombre, String fecha, String direccion, Comprador usuario, List<Producto> productos, MetodoPago metodoPago) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.direccion = direccion;
        this.usuario = usuario;
        this.productos = productos;
        this.metodoPago = metodoPago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
