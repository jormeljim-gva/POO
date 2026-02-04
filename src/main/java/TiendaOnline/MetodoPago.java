package TiendaOnline;

import java.util.ArrayList;
import java.util.List;

public class MetodoPago {
    private String tipo;
    private List<Pedido> pedidos = new ArrayList<>();

    public MetodoPago(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void addPedido(Pedido pedido){
        this.pedidos.add(pedido);
    }
}
