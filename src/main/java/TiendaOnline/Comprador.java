package TiendaOnline;

import java.util.ArrayList;
import java.util.List;

public class Comprador {
    private String nombre;
    private List<Pedido> pedidos = new ArrayList<>();
    private List<Resenya> resenyas = new ArrayList<>();

    public Comprador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void addPedido(Pedido pedido){
        this.pedidos.add(pedido);
    }

    public List<Resenya> getResenyas() {
        return resenyas;
    }
    public void addResenya(Resenya resenya){
        this.resenyas.add(resenya);
    }
}
