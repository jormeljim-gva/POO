package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Tema {
    private String cod_tema;
    private List<Libro> libros = new ArrayList<>();

    public Tema(String cod_tema) {
        this.cod_tema = cod_tema;
    }

    public String getCod_tema() {
        return cod_tema;
    }

    public void setCod_tema(String cod_tema) {
        this.cod_tema = cod_tema;
    }

}
