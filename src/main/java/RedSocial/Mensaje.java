package RedSocial;

public class Mensaje {
    private String id;
    private Usuario usuario;
    private String fecha;
    private RedSocial redSocial;

    public Mensaje(String id, Usuario usuario, String fecha, RedSocial redSocial) {
        this.id = id;
        this.usuario = usuario;
        this.usuario.getMensajes().add(this);
        this.fecha = fecha;
        this.redSocial = redSocial;
        this.redSocial.getMensajes().add(this);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
