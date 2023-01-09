package ec.edu.epn.Modelos;

public interface LibroDAOInterface {
    public void crearLibro (Libro libro);
    public Libro buscarLibro(String isbn);
    public void actualizarLibro(Libro libro);
    public void eliminarLibro(String isbn);


}
