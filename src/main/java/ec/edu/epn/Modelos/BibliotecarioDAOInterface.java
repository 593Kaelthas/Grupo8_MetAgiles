package ec.edu.epn.Modelos;

public interface BibliotecarioDAOInterface {
    public void crearBibliotecario (Bibliotecario bibliotecario);
    public Bibliotecario getBibliotecario (String idUsuario);
    public void actualizarBliotecario (Bibliotecario bibliotecario);

}
