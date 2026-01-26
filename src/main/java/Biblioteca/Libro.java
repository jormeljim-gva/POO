package Biblioteca;

public class Libro {
    private int isbn;
    private Tema tema;
    private Editorial editorial;

    public Libro(int isbn, Tema tema, Editorial editorial) {
        this.isbn = isbn;
        this.tema = tema;
        this.editorial = editorial;
        this.editorial.getLibros().add(this);
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

}