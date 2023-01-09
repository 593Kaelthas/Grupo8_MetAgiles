package ec.edu.epn.Controladores;

import ec.edu.epn.Modelos.Libro;
import ec.edu.epn.Modelos.LibroDAO;

public class LibroControlador {
    private Libro libro;
    private LibroDAO libroDAO;

    public LibroControlador(Libro libro, LibroDAO libroDAO) {
        this.libro = libro;
        this.libroDAO = libroDAO;
    }

    public void setTituloLibro(String titulo) {
        libro.setTitulo(titulo);
    }
    public void setAutorLibro(String autor){
        libro.setAutor(autor);
    }
    public void setGeneroLibro(String genero){
        libro.setGenero(genero);
    }
    public void setAnoPublicacionLibro(String anoPublicacion){
        libro.setAnoPublicacion(anoPublicacion);
    }
    public void setIsbnLibro(String isbn){
        libro.setIsbn(isbn);
    }
    public void setStockLibro(int stock) {
        libro.setStock(stock);
    }
    public String getToStringLibro(Libro libro){
        return libro.toString();
    }
    public Libro getLibro(){
        return libro;
    }
}
