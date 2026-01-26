package Biblioteca;

public class Ejemplar {
    private int n_reg;
    private String fecha_p;
    private Libro libro;

    public Ejemplar(int n_reg, String fecha_p, Libro libro) {
        this.n_reg = n_reg;
        this.fecha_p = fecha_p;
        this.libro = libro;
    }

    public int getN_reg() {
        return n_reg;
    }

    public void setN_reg(int n_reg) {
        this.n_reg = n_reg;
    }

    public String getFecha_p() {
        return fecha_p;
    }

    public void setFecha_p(String fecha_p) {
        this.fecha_p = fecha_p;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

}
