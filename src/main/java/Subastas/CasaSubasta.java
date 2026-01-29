package Subastas;

import java.util.List;

public class CasaSubasta {
    private String nombre;
    private String direccion;
    private List<Subasta> subastas;

    public CasaSubasta(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Subasta> getSubastas() {
        return subastas;
    }

    public void addSubasta(Subasta subasta){
        this.subastas.add(subasta);
    }


}
