package TiendaOnline;

import java.util.ArrayList;
import java.util.List;

public class Comprador extends Usuario {
    private List<Pedido> pedidos = new ArrayList<>();
    private List<Resenya> resenyas = new ArrayList<>();

    public Comprador(String nombre) {
        super(nombre);
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
