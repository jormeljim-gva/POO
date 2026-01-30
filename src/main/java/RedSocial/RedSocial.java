package RedSocial;

import java.util.ArrayList;
import java.util.List;

public class RedSocial {
    private String nombre;
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Mensaje> mensajes = new ArrayList<>();

    public RedSocial(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Mensaje> getMensajes() {
        return mensajes;
    }
}
