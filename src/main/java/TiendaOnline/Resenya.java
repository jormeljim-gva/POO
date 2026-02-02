package TiendaOnline;

public class Resenya {
    private String contenido;
    private String fecha;
    private String valoracion;
    private Comprador usuario;
    private Producto producto;

    public Resenya(String contenido, String fecha, String valoracion, Comprador usuario, Producto producto) {
        this.contenido = contenido;
        this.fecha = fecha;
        this.valoracion = valoracion;
        this.usuario = usuario;
        this.producto = producto;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }
}
