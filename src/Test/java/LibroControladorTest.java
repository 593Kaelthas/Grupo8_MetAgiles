import ec.edu.epn.Controladores.LibroControlador;
import ec.edu.epn.Modelos.Libro;
import ec.edu.epn.Modelos.LibroDAO;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibroControladorTest {

    @Test
    public void when_add_book_check_equals(){
        String titulo = "El proncipito";
        String autor = "Antoine de Saint Exupéry";
        String genero = "Literatura infantil";
        String anoPublicacion = "1943";
        String isbn = "9783140464079";
        int stock = 10;

        Libro libro = new Libro(titulo, autor, genero, anoPublicacion, isbn, stock);
        LibroDAO libroDAO = new LibroDAO();

        LibroControlador libroControlador = new LibroControlador(libro, libroDAO);
        assertEquals(titulo,libroControlador.getLibro().getTitulo());
        assertEquals(autor,libroControlador.getLibro().getAutor());
        assertEquals(genero,libroControlador.getLibro().getGenero());
        assertEquals(anoPublicacion, libroControlador.getLibro().getAnoPublicacion());
        assertEquals(isbn, libroControlador.getLibro().getIsbn());
        assertEquals(stock, libroControlador.getLibro().getStock(), 0);
    }

}