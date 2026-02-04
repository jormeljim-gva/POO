package TiendaOnline;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String nombre;
    private String fecha;
    private String direccion;
    private Comprador comprador;
    private List<Producto> productos = new ArrayList<>();
    private MetodoPago metodoPago;

    public Pedido(String nombre, String fecha, String direccion, Comprador comprador, MetodoPago metodoPago) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.direccion = direccion;
        this.comprador = comprador;
        this.comprador.addPedido(this);
        this.metodoPago = metodoPago;
        this.metodoPago.getPedidos().add(this);
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
