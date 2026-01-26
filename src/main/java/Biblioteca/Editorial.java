package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Editorial {
    private String cod_ed;
    private List<Libro> libros = new ArrayList<>();

    public Editorial(String cod_ed, List<Libro> libros) {
        this.cod_ed = cod_ed;
        this.libros = libros;
    }

    public String getCod_ed() {
        return cod_ed;
    }

    public void setCod_ed(String cod_ed) {
        this.cod_ed = cod_ed;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

}
