package ec.edu.epn.Modelos;

public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private String anoPublicacion;
    private String isbn;
    private int stock;

    public Libro(String titulo, String autor, String genero, String anoPublicacion, String isbn, int stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anoPublicacion = anoPublicacion;
        this.isbn = isbn;
        this.stock = stock;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(String anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", añopublicacion='" + anoPublicacion + '\'' +
                ", isbn='" + isbn + '\'' +
                ", stock=" + stock +
                '}';
    }
}
