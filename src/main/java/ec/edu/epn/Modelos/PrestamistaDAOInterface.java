package ec.edu.epn.Modelos;

public interface PrestamistaDAOInterface {
    public void crearPrestamista (Prestamista prestamista);
    public void buscarPrestamista(String cedula);
    public void actualizarPrestamista (Prestamista prestamista);
    public void elimiarPrestamista(String cedula);
}
