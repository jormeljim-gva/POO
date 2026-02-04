package TiendaOnline;

public class Main {
    public static void main(String[] args) {
        Comprador pepe = new Comprador("Pepe");
        MetodoPago tarjeta = new MetodoPago("Tarjeta");
        Pedido p1 =  new Pedido("p1", "Hoy", "C. Inventada", pepe, tarjeta);
    }
}
